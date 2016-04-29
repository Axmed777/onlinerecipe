
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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin Create User</title>

    <%@include file="/shared/head.jsp" %>
  </head>

  <body>

    <%@include file="/shared/navbar.jsp" %>

    <div class="container-fluid">
      <div class="row">
        
          <%@include file="/shared/left.jsp" %>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          


          <h2 class="sub-header">Create User</h2>
          <form action="../AdminP?createUser=" method="POST" enctype="multipart/form-data">
              <div class="form-group">
                  <label>Name</label>
                  <input type="text" name="name" class="form-control" />
              </div>
              <div class="form-group">
                  <label>Surname</label>
                  <input type="text" name="surname" class="form-control" />
              </div>
              <div class="form-group">
                  <label>Email</label>
                  <input type="text" name="email" class="form-control" />
              </div>
              <div class="form-group">
                  <label>Password</label>
                  <input type="password" name="password" class="form-control" />
              </div>
              <div class="form-group">
                  <label>Image</label>
                  <input type="file" name="image" class="form-control" />
              </div>
              <div class="form-group">
                  <label>Gender</label>
                  <select name="gender" class="form-control">
                      <option value="M">Male</option>
                      <option value="F">Female</option>
                  </select>
              </div>
              <div class="form-group">
                  <label>Address</label>
                  <textarea name="address" class="form-control" ></textarea>
              </div>
              <div class="form-group">
                  <label>Admin</label>
                  <input type="checkbox" name="admin" class="form-control" />
              </div>
              <div class="form-group">
                  <button class="btn btn-primary" name="createUser">Create</button>
              </div>
          </form>
        </div>
      </div>
    </div>

  </body>
</html>
