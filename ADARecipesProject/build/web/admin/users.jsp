
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
          


          <h2 class="sub-header">User List</h2>
          <a style="margin-bottom: 4px;" class="btn btn-primary pull-right" href="createUser.jsp">Create User</a>
         
          <table class="table table-bordered table-hover">
              <tr>
                <th>Image</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Email</th>
                <th>Register date</th>
                <th>Actions</th>
              </tr>
              <% for(User u : dao.users()){ %>
              <tr>
                  <td><img src="../<%=u.getImage() %>" width="50" height="50" class="img-thumbnail"/></td>
                  <td><%=u.getFirstname() %></td>
                  <td><%=u.getLastname()%></td>
                  <td><%=u.getEmail()%></td>
                  <td><%=u.getRegistr_date()%></td>
                  <td><a href="../AdminP?id=<%=u.getId() %>&delete=" onclick='return confirm("Are you sure?")' class="btn btn-danger">Delete</a></td>
              </tr>
              <% } %>
          </table>
        </div>
      </div>
    </div>

  </body>
</html>
