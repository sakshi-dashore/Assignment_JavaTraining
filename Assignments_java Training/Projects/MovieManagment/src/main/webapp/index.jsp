<html>
<body>
	<h1>Insert Movies</h1>
	<form action="insertMovie" method="get">
		<pre>
		Movie Name  : <input type="text" name="movieName"> 
		Movie Genre : <input type="text" name="genre"> 
					  <input type="submit" value="Insert Movie">
		
		</pre>
	</form>
	<hr>
	<h1>Update Movies</h1>
	<form action="updateMovie" method="post">
		<pre>
		Movie Name  : <input type="text" name="movieName"> 
		Movie Genre : <input type="text" name="genre"> 
					  <input type="submit" value="Update Movie">
		
		</pre>
	</form>
	<hr>
	<a href="getAllMovies">Get All Movies</a>
</body>
</html>
