
import os


def analyze_image():

    # import AzurKeyCredential and DocumentAnalysisClient from the Azure Form Recognizer library
    from azure.core.credentials import AzureKeyCredential
    from azure.ai.formrecognizer import DocumentAnalysisClient

    # set the endpoint and key from environment variables
    endpoint = os.environ["AZURE_FORM_RECOGNIZER_ENDPOINT"]
    key = os.environ["AZURE_FORM_RECOGNIZER_KEY"]

    # create a DocumentAnalysisClient
    document_analysis_client = DocumentAnalysisClient(endpoint=endpoint, credential=AzureKeyCredential(key))

    # set the path to the image
    image_path = "population.png"

    # open the image and analyze it with prebuilt-layout model
    with open(image_path, "rb") as f:
        poller = document_analysis_client.begin_analyze_document("prebuilt-layout", document=f)
    result = poller.result()

    # get the table informaton from the result and print the number of lines and columns
    tables = result.tables
    for idx, table in enumerate(tables):
        print("Table {} has {} rows and {} columns".format(idx, table.row_count, table.column_count))

        # print the table data
        for cell in table.cells:
            print("...Cell[{}][{}] has text '{}' ".format(
                cell.row_index,
                cell.column_index,
                cell.content
            ))

        rows = [];

        # iterate of the rows using the row_index
        for row_index in range(table.row_count):
            row = [];

            # iterate over the celles and append the content to the row if the row_index matches
            for cell in table.cells:
                if cell.row_index == row_index:
                    row.append(cell.content)


            # apend the row to rows
            rows.append(row)
        
        # print the rows in a loop
        for row in rows:
            print(row)


        # print the rows into a HTML table and save it to a file
        html = "<table>"
        for row in rows:
            html += "<tr>"
            for cell in row:
                html += "<td>{}</td>".format(cell)
            html += "</tr>"
        html += "</table>"
        with open("table.html", "w") as f:
            f.write(html)
            


    



    print("\n\n" + "-"*100)
    print("Analyzed the image using the prebuilt-layout model")





# Create main and call analyze_image
if __name__ == "__main__":
    analyze_image()    