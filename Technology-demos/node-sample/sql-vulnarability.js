// verify username and password from database
// If correct, then return true
// If incorrect, then return false

var db=require('./mysql/dbConnection.js');

function verifyUser(req, res){
    