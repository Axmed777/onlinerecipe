<%@page import="com.recipes.dao.DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test='<%=session.getAttribute("user_id") == null%>'>
    <c:redirect url="login.jsp" />
</c:if>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% DAO d = new DAO(); %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Create Your Own Book</title>

        <%@include file="/shared/header.jsp" %>
        <script src="js/jquery-ui.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/tag-it.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/mask.js"></script>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
        <link href="css/jquery.tagit.css" rel="stylesheet" type="text/css">
        <link href="css/select2.min.css" rel="stylesheet" type="text/css">
        <script src="js/select2.min.js" type="text/javascript" charset="utf-8"></script>
        <script type="text/javascript">
            $(function(){
                $('.select2').select2();
            });
            
        </script>
    </head>

    <body>

        <%@include file="/shared/navigation.jsp" %>

        <div style="margin-top: 150px;">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-7 ">
                        <c:if test='<%=request.getParameter("success") != null%>'>
                            <div class="alert alert-success alert-dismissible fade in" role="alert"> 
                                <strong>Your order sent</strong>
                            </div>
                        </c:if>
                        <form action="OwnBook?insert=" method="POST" >
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>My Favorite Category</label>
                                        <select class="form-control" name="category">
                                            <option value="">Choose Category</option>
                                            <option value="Appetizers">Appetizers</option>
                                            <option value="Desserts">Desserts</option>
                                            <option value="Diet">Diet</option>
                                            <option value="Holiday">Holiday</option>
                                            <option value="Vegetarian">Vegetarian</option>
                                            <option value="FastFood">Fast Food</option>
                                            <option value="Soups">Soups, Stews and Chili</option>
                                            <option value="Seafood">Seafood</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Post Index</label>
                                        <input type="text" class="form-control" name="post" />
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label>Address</label>
                                <textarea name="address" class="form-control"></textarea>
                            </div>
                            
                            <div class="form-group">
                                <label>Phone Number</label>
                                <input type="number" class="form-control" name="phone" />
                            </div>
                            
                            <div class="form-group">
                                <label>My Favorite Recipes</label>
                                <select class="select2" multiple="multiple" name="recipes" style="width: 100%">
                                    <c:forEach items="<%=d.recipeList() %>" var="recipe">
                                        <option value="${recipe.getTitle()}">${recipe.getTitle()}</option>
                                    </c:forEach>
                                    
                                    
                                </select>
                            </div>
                            
                            <div class="form-group">
                                <button class="btn btn-primary pull-right">Save Recipe</button>
                            </div>
                        </form>


                    </div>
                    <div class="col-md-5 col-sm-5">
                        <img src="images/foodbook.png" class="img-responsive" />
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
