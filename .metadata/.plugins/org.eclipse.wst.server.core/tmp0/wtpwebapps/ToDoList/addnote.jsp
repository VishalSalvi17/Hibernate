<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<%@include file="all_js_css.jsp"%>
<title>Add Notes</title>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Please fill your Note Details</h1>

		<!-- This is form -->
		<form action="SaveNoteServlet" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Note
					Title</label> <input name="title" required type="text" class="form-control"
					id="title" aria-describedby="emailHelp" placeholder="Enter Here" />

			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Note
					Content</label>
				<textarea name="content" required id="content"
					placeholder="Enter content" class="form-control"
					style="height: 250px;"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add Note</button>
			</div>
		</form>
	</div>
</body>
</html>