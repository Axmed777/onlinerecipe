<%@page import="com.recipes.entity.Recipe"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.recipes.dao.DAO"%>
<% DAO dao = new DAO();
   Recipe r = dao.findRecipe(Integer.parseInt(request.getParameter("id")));
%>
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

    <title><%=r.getTitle()%></title>

    <%@include file="/shared/head.jsp" %>
  </head>

  <body>

      <%@include file="/shared/navbar_main.jsp" %>

    <div class="container-fluid">
      <div class="row">
        
          <%@include file="/shared/left_main.jsp" %>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header"><%=r.getTitle()%> <span class='pull-right' style="font-size: 18px;"><%=r.getInsert_date().split(" ")[0] %></span></h1>

          <div class="row" >
              
              <div class="col-xs-9 col-sm-9 " style="margin-left: 15%" >
                    <img src="photos/<%=r.getImage()%>" class="img-responsive"  />
                    <h5>Category: <%=r.getCategory() %> | Posted By: <%=dao.findUsersByRecipe(r.getId()).getFirstname() %>
                        <a class="btn btn-xs btn-warning pull-right"><span class="glyphicon glyphicon-thumbs-down" aria-hidden="true"></span></a>
                        <a class="btn btn-xs btn-primary pull-right"><span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span></a>
                    </h5>
                    
                    
                    <hr/>
              </div>
                    
              <div class="col-xs-8 col-sm-8 " >
                  
                  <h3>About</h3>
                  <p><%=r.getArticle() %></p>
                  
                  <h3>Composition</h3>
                  <p><%=r.getComposition()%></p>
                  
                  <h3>Prepare Rules</h3>
                  <p><%=r.getPrepared_rules() %></p>
              </div>
          </div>

         
        </div>
      </div>
    </div>

  </body>
</html>
