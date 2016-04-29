
<%@page import="com.recipes.entity.Dictionary"%>
<%@page import="com.recipes.dao.DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test='<%=session.getAttribute("admin") == null %>'>
    <c:redirect url="login.jsp" />
</c:if>
<c:if test='<%=session.getAttribute("admin").toString().equals("0") %>'>
    <c:redirect url="login.jsp" />
</c:if>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      <% DAO dao = new DAO(); %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin Dictionary</title>

    <%@include file="/shared/head.jsp" %>
  </head>

  <body>

    <%@include file="/shared/navbar.jsp" %>

    <div class="container-fluid">
      <div class="row">
        
          <%@include file="/shared/left.jsp" %>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          


          <h2 class="sub-header">Dictionary</h2>
         <a style="margin-bottom: 4px;" class="btn btn-primary pull-right" href="createWord.jsp">Create Word</a>
         
          <table class="table table-bordered table-hover">
              <tr>
                <th>id</th>
                <th>word</th>
                <th>About</th>
                <th>Actions</th>
              </tr>
              <% for(Dictionary d : dao.dictionary()){ %>
              <tr>
                  <td><%=d.getId()%></td>
                  <td><%=d.getWord()%></td>
                  <td><%=d.getAbout()%></td>
                  <td>
                    <a href="../AdminP?deleteDictionary=<%=d.getId() %>" onclick='return confirm("Are you sure?")' class="btn btn-danger">Delete</a>
                  </td>
              </tr>
              <% } %>
          </table>
        </div>
      </div>
    </div>

  </body>
</html>