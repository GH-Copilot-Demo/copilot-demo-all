# Python demo

This demo uses [Django](https://www.djangoproject.com/), a Python web framework for creating data-driven websites. The first step in building a Django site is to define a series of models to represent the data. This can be a tedious process, which is where Copilot can really shine. In this demo, you'll show how to create a couple of models and how Copilot streamlines the process.

## Prerequisites

1. In the terminal window, change directories to the `python-app` directory.

    ```bash
    cd App-demos/python-app
    ```

1. If running locally, create and activate a virtual environment.

    ```bash
    python3 -m venv venv
    source venv/bin/activate
    ```

1. Install the required packages.

    ```bash
    pip install -r requirements.txt
    ```

## Running the demo

1. Inside your IDE, open the `App-demos/python-app` directory.
1. Navigate to `conference` and open the `models.py` file.
1. Highlight the fact that with Django the first step is to create models to define the data. Introduce how Copilot can do this for us.
1. Go to the last line in `models.py` and add the following comment:

    ```python
    # Create a class for speaker with name, email and linkedin url
    ```

1. Highlight how Copilot has created a class for us. Explain that Copilot has also created a `__str__` method for us, which is a special method that returns a string representation of the object. This is useful for debugging and logging, and is a common best practice in Django.
1. Press enter to create a new line. Copilot **should** suggest a comment to create a `Talk` model. Select it, and highlight how Copilot saw you create the `Speaker` model and assumed the next item you'd want is for something for the speakers to do - to create a talk.
1. You should notice a line which looks like the following in the `Talk` class:

    ```python
    speaker = models.ForeignKey('Speaker', on_delete=models.CASCADE)
    ```

1. Highlight how this would delete talks if the speaker is deleted, which might not be the behavior we want. Explain you could update the code manually, as it's your code, or you could use Copilot to do it for you.
1. Just before the `__str__` method, ask Copilot to create a new field called `code` with a pattern of 3 letters, a dash, and 3 numbers by creating a comment to describe what you want:

    ```python
    # Create a field called code with a pattern of 3 letters, a dash, and 3 numbers
    ```

1. Highlight how Copilot created the field and used a regular expression, which is often something developers need to look up. With Copilot it was able to do that for us automatically!

## Summary

At the conclusion of the demo, you'll have shown several key features of Copilot:

- Copilot creating code from comments
- Copilot streamlining the creation of tedious code
- How Copilot is able to read both comments and the code you create
- How Copilot can generate regular expressions for you
- The fact that the code Copilot generates is your code, and you can edit it as you see fit
