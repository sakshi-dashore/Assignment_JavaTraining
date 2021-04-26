<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="AddBookS">Add Book</a> &nbsp; &nbsp;
<a href="ShowAllBook.jsp">Show all Books</a>
	<h3>Add Book</h3>
	<form action="AddBookS" method="get">
	<table border="1" width="2">
		<tr>
		<td>title</td>
		<td><input type="text" name="title" ></td>
		</tr>
		<tr>
		<td>author</td>
		<td><input type="text" name="author" ></td>
		</tr>
		<tr>
		<td>price</td>
		<td><input type="text" name="price" ></td>
		</tr>
		<tr>
		<td>genre</td>
		<td><input type="text" name="genre" ></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="save"></td>
		</tr>
		
	</table>
	</form>

</body>
</html>