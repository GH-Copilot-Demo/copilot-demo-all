
## Demo Flow

1. Open the index.html file [blank file] or add a new file with .html extension
2. Open the main.css file [blank file] or add a new file with .css extension
3. Use any of the following prompt to demo the Copilot support for HTML and CSS 
4. Use ```<!-- comments -->``` to indicate the comments or prompts in HTML and ```/* comments */``` to indicate the comments or prompts in CSS

Note: 
- if the suggestions are not aligned, start typing HTML tag or css class based on the requirement to get better suggestions
- [open Copilot](https://docs.github.com/en/copilot/getting-started-with-github-copilot/getting-started-with-github-copilot-in-visual-studio-code#seeing-multiple-suggestions-in-a-new-tab) to see the suggestions


## Demo Script

- HTML file with inline Javascript
Once you start with script tag, Copilot start providing recommendations for Javascript

    ```
    <head>       
        <script 
    </head>

     After completing the script block, try to add a new script block

        define a function to get the current date
        define a function to get the current time 
    ```

   Add a code block to html using below prompt
 
  ```
  add a table with 3 columns and 5 rows capturing employee details
  ```
  
- CSS classes

    ```
    define a style for the body background
    red and white gradient color
    make it work for all browsers
    ```

- Integrate the CSS and HTML files
   - add link to the CSS file inside the head tag of html file

    ```
    <head>
    <link rel="stylesheet" href="main.css" >
    </head>
    ```
   - Open HTML file from the browser and see the changes
