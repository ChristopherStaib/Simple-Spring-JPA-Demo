<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8"> 
<title>Simple Web App - Home</title>
</head>
<body>
    <h1>Add a Person</h1>
    <form action="addPerson">
        <label for="id">id</label><br> 
        <input type="text" name="id"><br>
        <label for="name">name</label><br> 
        <input type="text" name="name"><br><br>
        <input type="submit"><br>
    </form>
    <br>
    <br>
    <h1>Lookup a Person By ID</h1>
    <form action="getPerson">
        <label for="id">id</label><br> 
        <input type="text" name="id"><br><br>
        <input type="submit"><br>
    </form>
    <br>
    <br>
    <h1>Lookup a Person By Name</h1>
    <form action="findPerson">
        <label for="name">name</label><br> 
        <input type="text" name="name"><br><br>
        <input type="submit"><br>
    </form>
</body>

</html>