<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/requests.js"></script>
<script>$(function(){ 	CDI.Requests.init(); });</script>
</head>
<body>
<h2>CDI Testing</h2>
	<div>
		<form method="get" id="echoForm" action="rest/CdiWebService/echo">
			<button type="submit">ECHO</button>
		</form>
		<div id="echoResults">Results:<span id="echoResponse"></span></div>
	</div>
</body>
</html>
