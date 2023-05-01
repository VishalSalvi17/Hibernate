<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>TODO List : Home Page</title>
<%@include file="all_js_css.jsp"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
	integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<div class="card py-5">
		<img alt="" class = "img-fluid mx-auto" width=200px src="img/notebook.webp" >
		<!-- <i class="fa-solid fa-envelope"></i>-->
		<br>
		<h1 class = "text-primary text-center">Notes fly so much faster than words. </h1>
		<br>
		<div class="container text-center">
			<button class="btn btn-outline-primary text-center"><a href = "addnote.jsp">Let's go!!</a></button>
		</div>
		
		</div>
	</div>
</body>
</html>