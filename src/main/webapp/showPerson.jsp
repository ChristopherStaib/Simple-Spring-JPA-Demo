<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8"> 
<title>Simple Web App - Lookup</title>
</head>
<body>
    Found: <br>
    ${person}
    <br>
    <h1>Would you like to update this person?</h1>
    
    <form action="updatePerson">
        <label for="id">id</label><br> 
        <input type="text" name="id" value="${person.id}" readonly><br>
        <label for="id">name</label><br> 
        <input type="text" name="name" placeholder="${person.name}"><br><br>
        <input type="submit"><br>
    </form>
    <br>
    <br>
    <h1>Would you like to delete this person?</h1>
    <form action="deletePerson">
        <input type="submit" value="Yes"><br>
        <input type="hidden" name="id" value="${person.id}" readonly><br><br>
    </form>
    <form action="/">
    <br>
    <br>
    <input type="submit" value="Home">
    </form>
</body>

</html>