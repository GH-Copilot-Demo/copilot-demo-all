
import os


def analyze_image():

    # import AzurKeyCredential and DocumentAnalysisClient from the Azure Form Recognizer library
    from azure.core.credentials import AzureKeyCredential
    from azure.ai.formrecognizer import DocumentAnalysisClient

    # set the endpoint and key from environment variables
    endpoint = os.environ["AZURE_FORM_RECOGNIZER_ENDPOINT"]
    key = os.environ["AZURE_FORM_RECOGNIZER_KEY"]


    print("\n\n" + "-"*100)
    print("Analyzed the image using the prebuilt-layout model")





# Create main and call analyze_image
if __name__ == "__main__":
    analyze_image()    