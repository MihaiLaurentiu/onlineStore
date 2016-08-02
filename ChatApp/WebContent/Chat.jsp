<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>chat Server</title>
</head>
<body>

<form action = "ChatServlet" method="post">
Aici sunt mesajele dvs:<br/>
<button type="button" onclick="alert(TODO - Send logout to server );">[x]</button>
<br />
<textarea name="chatSession" rows="10" cols="16" readonly></textarea>
<hr/>
<textarea name="message" rows="3" cols="16"></textarea>
<button type="button" onclick="alert('TODO - Get message from server!');">REFRESH</button>
<button type="submit">SEND</button>

</form>

</body>
</html>