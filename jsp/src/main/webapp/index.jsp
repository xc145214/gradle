<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/30
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
  <div>TODO write content</div>

  <%
      String data = "hello world!";
      boolean flag = true;
      if(flag == true){
          out.println("<h1>"+data.toUpperCase()+"</h1>");
      }

  %>
  </body>
</html>
