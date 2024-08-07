
# A series of Copilot Demos for the famous BookstoreV3 demo
A series of demos to showcase how to use Copilot with the famous BookstoreV3 demo
## Demo 1: Adding more books into the list of books in the store
*Context: Currently there are 6 books that are initially in the database of books to begin with. This short demo will allow you the demonstration of generative powers of Copilot that not only aids in inserting new items into the array, but is suggesting real books. Last but not the least, this demo has an optional section of testing where one can amend tests to be passing with a newly added books into the list.*

### Steps:

0. [Optional] Create a new branch called nb (new-books)
```
git branch nb
git checkout nb
```
1. Open the file ```src/main/webapp/static/books.html:63``` for editing and add the following
```
// add a new book to the list about agile
books.add(new Book("Ken Schwaber","Agile Project Management with Scrum", "agile.jpg"));
// add a new book to the list about git
books.add(new Book("Scott Chacon”,”Pro “Git, “git.jpg"));
```
2. Add 2 images [git.pg and agile.pg] referred above to the repo, a simple online search will find you covers for books generated, 
3. At this point you can commit changes into the branch and push
```
git add -a
git commit -m"Added 2 new books"
git push
```
4. [Optional] You can generate a pull request with newest changes on the branch. this will then fail on an GitHb Action check for tests, go back to the Codespace/Editor and amend the following in the file ```src/test/java/com/github/demo/service/BookServiceTestJava:25```
```
// make sure we have 8 books in the list
assertEquals("list length should be 8", 8, books.size());
```
5. [Optional] You can merge into the mainline

## Demo 2: Adding more books into the list of books in the store
*Context: Currently there is a main page listing of all books present in the store and let's imagine there would be a promotion running every day for a random Book of a Day. In this demo. Will create a bunch of backend and frontend code to allow for a display of a Random Book at the top of the page. In this demo we see some versatility of the Copilot working with both backend and frontend of the code.*


0. [Optional] Create a new branch called nb (random-book)
```
git branch rb
git checkout rb
```
1. First, we will be editing the signature functions of the BookDatabase service in the file ```src/main/java/service/BookDatabase.java:12``` We write a comment and experience a suggestion
```
// get a random book
Book getRandomBook() throws BookServiceException;
```
2. We then go ahead and implement this function in BookDatabaseImpl in the file ```src/main/java/service/BookDatabaseImpl.java:106``` We start by writting @Override on that line and wait for Copilot suggestion
```
@Override
    public Book getRandomBook() throws BookServiceException {
        Book book = null;

        if (!isValid()) {
            throw new BookServiceException("Database connection is not valid, check logs for failure details.");
        }

        try {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM books ORDER BY RANDOM() LIMIT 1");
            if (rs.next()) {
                book = new Book(
                    rs.getString("author"),
                    rs.getString("title"),
                    rs.getString("image")
                );
            }
        } catch (SQLException e) {
            logger.error("Failed to obtain random book", e);
            throw new BookServiceException(e);
        }
        return book;
    }
```
We can talk here about copying the style of the above function and changing SQL intelligently, as well as about returning one instance of the Book object rather than a list of them.
3. Next, we edit BookService.java to surface access to the DB in the file: ```src/main/java/service/BookService.java:27```. We start by writting a comment and let Copilot do it's thing. 
```
// get a random book
public Book getRandomBook() throws BookServiceException {
        return this.booksDatabase.getRandomBook();
}
```
4. Last step in the backend is to pass this newly obtained random book into our frontend and we do that in file ```src/main/java/servlet/BookServlet.java:69``` and ```src/main/java/servlet/BookServlet.java:71``` like below respectively. 
```
Book randomBook = bookService.getRandomBook();
ctx.setVariable("randomBook", randomBook);
```

Notice here, how again, copilot is using existing context of the file.

5. Now we move onto frontend, where we go and edit file ```src/main/webapp/static/books.html:65``` We input a HTML prompt and slightly tweak it till we get a presentable result.
```
<!-- create a info message box with a random book displaying author and title -->
    <div class="col-sm-12 col-md-10 col-md-offset-1">
      <div class="alert alert-info" role="alert">
        <strong>Info!</strong> You can buy the book <strong th:text="${randomBook.title}"></strong> by <strong
          th:text="${randomBook.author}"></strong> for only $13.99.
      </div>
    </div>
```
6. At this point you can commit changes into the branch and push
```
git add -a
git commit -m"Added a random book widget to the homepage"
git push
```
7. [Optional] You can generate a pull request with newest changes on the branch and merge.

## More demos with CopilotX coming soon
