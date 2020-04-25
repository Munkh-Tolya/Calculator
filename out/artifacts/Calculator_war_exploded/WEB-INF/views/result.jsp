<%--
  Created by IntelliJ IDEA.
  User: munkh
  Date: 4/22/2020
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Result1</title>
</head>
<body>
<form action="calc2" method="post">
    <input type = "text" name = "add1" size = "2"  value = "<c:out value = "${Result.add1}" />" />+
    <input type = "text" name = "add2" value = "<c:out value = "${Result.add2}" />" size = "2"/>=<input type = "text" name = "sum" value = "<c:out value = "${Result.sum}" />"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "<c:out value = "${Result.mult1}" />" size = "2"/>*
    <input type = "text" name = "mult2" value = "<c:out value = "${Result.mult2}" />"  size = "2"/>=<input type = "text" name = "product" value = "<c:out value = "${Result.product}" />"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>
</body>
</html>