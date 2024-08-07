## Demo Flow

1. Open the demo.js file [blank file] or add a new file with .js extension
2. Use any of the following prompt to demo the Copilot support for Node/JavaScript
3. Use // to indicate the comments or prompts

Note: 
- if the suggestions are not aligned, start typing function or var based on the requirement to get better suggestions
- [open Copilot](https://docs.github.com/en/copilot/getting-started-with-github-copilot/getting-started-with-github-copilot-in-visual-studio-code#seeing-multiple-suggestions-in-a-new-tab) to see the suggestions


## Demo Script


- SQL Injection Detection Sample [*may or may not work; feature is in evolving state*]

    ```
    // verify username and password from database
    // If correct, then return true
    // If incorrect, then return false

    var db=require('./mysql/dbConnection.js');

    function verifyUser(req, res){
    ```

- Node sample: Get the current date and time
    - Use the following prompt
        ```
        define a function to get the current date and time
        ```
    - Once the function is ready, prompt for the calling function

        ```
        define a calling function to call the getDateTime function
        ```
    - Now, add the line to invoke calling function
    - Open the terminal and execute using ``` node index.js ```

- Node sample: Contextual suggestion
    - Open sub.js and use the following prompt
        ```
        define a module to add two numbers
        ```
    - Open index.js and use the following prompt
        ```
        invoke the add function
        ```
    - Uncomment the code, if require
    - Open the terminal and execute using ``` node index.js ```
