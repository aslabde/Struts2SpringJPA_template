<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Book Form</title>
</head>

<body>

	<h2>Add Book</h2>
	<s:form action="/addBook" method="post">
		<s:textfield name="title" label="Title" value="" cols="15" rows="1" />
		<s:textarea name="author" label="Author" value="" />
		<s:textarea name="editor" label="Editor" value="" />
		<s:textarea name="prize" label="Prize" value="" />
		<s:submit />
	</s:form>

</body>
</html>