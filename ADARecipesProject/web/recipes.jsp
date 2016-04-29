<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.recipes.dao.DAO"%>
<% DAO dao = new DAO(); %>
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

    <title>Recipes</title>

    <%@include file="/shared/head.jsp" %>
  </head>

  <body>

      <%@include file="/shared/navbar_main.jsp" %>

    <div class="container-fluid">
      <div class="row">
        
          <%@include file="/shared/left_main.jsp" %>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Dashboard</h1>

          <div class="row placeholders">
              <c:forEach items="<%=dao.recipeList() %>" var="recipe">
                <div class="col-xs-6 col-sm-3 placeholder">
                    <a href='Recipes?id=<c:out value="${recipe.getId()}"/>'><img src="<c:out value="photos/${recipe.getImage()}"/>" style="width: 150px; height: 150px;" class="img-responsive" alt="Generic placeholder thumbnail"></a>
                  <h4><c:out value="${recipe.getTitle()}"/></h4>
                  <span class="text-muted"><c:out value="${recipe.getCategory()}"/></span>
                </div>
              </c:forEach>
          </div>

         
        </div>
      </div>
    </div>

  </body>
</html>
