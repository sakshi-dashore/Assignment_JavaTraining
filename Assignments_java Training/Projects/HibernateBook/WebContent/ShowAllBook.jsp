```<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List"
import="com.dao.HibernateDao"
import="com.sd.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <center>
  
        <h2>
         <a href="AddBookS">Add Book</a>
         &nbsp;&nbsp;&nbsp;
         <a href="ShowALLServlet">Show All Books</a>
         
        </h2>
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <% List < Book > listBook = HibernateDao.getAllBook();%>
            <tr>
                <th>ID</th>
                <th>TITLE</th>
                <th>AUTHOR</th>
                <th>PRICE</th>
                <th>GENRE</th>
            </tr>
            <% for( Book book:listBook){%>
		
			<tr>
			<td><%=book.getId()%></td>
			<td><%=book.getTitle()%></td>
			<td><%=book.getAuthor()%></td>
			<td><%=book.getPrice()%></td>
			<td><%=book.getGenre() %></td>
			<%-- 
			<td><a href='EditServlet?id<%=book.getId()%>'>edit</a></td>
			<td><a href='DeleteServlet?id<%=book.getId()%>'>delete</a></td> --%>
			</tr>
		<% } %>

        </table>
    </div> 
	
</body>
</html>