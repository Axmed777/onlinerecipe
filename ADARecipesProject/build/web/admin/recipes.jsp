
<%@page import="com.recipes.entity.Recipe"%>
<%@page import="com.recipes.dao.DAO"%>
<%@page import="com.recipes.entity.User"%>
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

    <title>Admin Users</title>

    <%@include file="/shared/head.jsp" %>
  </head>

  <body>

    <%@include file="/shared/navbar.jsp" %>

    <div class="container-fluid">
      <div class="row">
        
          <%@include file="/shared/left.jsp" %>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          


          <h2 class="sub-header">Waiting Recipes</h2>
         
         
          <table class="table table-bordered table-hover">
              <tr>
                <th>Image</th>
                <th>Title</th>
                <th>About</th>
                <th>Actions</th>
              </tr>
              <% for(Recipe u : dao.waitingRecipeList()){ %>
              <tr>
                  <td><img src="../photos/<%=u.getImage() %>" width="50" height="50" class="img-thumbnail"/></td>
                  <td><%=u.getTitle()%></td>
                  <td><%=u.getArticle()%></td>
                  <td>
                      <a href="../AdminP?approveRecipe=<%=u.getId() %>" onclick='return confirm("Are you sure?")' class="btn btn-success">Approve</a>
                      <a href="../AdminP?deleteRecipe=<%=u.getId() %>" onclick='return confirm("Are you sure?")' class="btn btn-danger">Delete</a>
                  </td>
              </tr>
              <% } %>
          </table>
        </div>
      </div>
    </div>

  </body>
</html>
