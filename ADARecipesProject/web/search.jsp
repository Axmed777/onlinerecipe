<%@page import="com.recipes.entity.Recipe"%>
<%@page import="java.util.List"%>
<%@page import="com.recipes.dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DAO dao = new DAO();
    String name = request.getParameter("name") != null ? request.getParameter("name").toString() : "";
    String category = request.getParameter("category") != null ? request.getParameter("category").toString() : "";
    String cook_time = request.getParameter("cook_time") != null ? request.getParameter("cook_time").toString() : "";
    String composition = request.getParameter("ingredients") != null ? request.getParameter("ingredients").toString() : "";
    List<Recipe> list = dao.searchProduct(name, category, cook_time, composition);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/shared/header.jsp" %>
        <script src="js/mask.js"></script>
        <script>
            $(function(){
                Mask.newMask({
                    $el: $("#cook-time"),
                    mask: "HH:mm"
                });
            })
        </script>
    </head>
    <body> 
        <%@include file="shared/navigation.jsp" %>
        <div style="margin-top: 170px;">

            <div class="col-md-12">
                <h4 style="margin-bottom: 0px !important;">Search</h4>
                <hr/>

                <div class="row">
                    <div class="col-md-12">
                    <form role="form" id="form" autocomplete="off" action="search.jsp">
                        <div class="col-md-3">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name" value="<%=name %>" autocomplete="off" />

                        </div>
                        <div class="col-md-3">
                            <label>Category</label>
                            <select class="form-control" name="category">
                                <option value="">Choose Category</option>
                                <option <% if(category.trim().equals("Diabetic")){ %>selected="selected"<% } %> value="Diabetic">Diabetic</option>
                                <option <% if(category.trim().equals("Dessert")){ %>selected="selected"<% } %> value="Dessert">Dessert</option>
                                <option <% if(category.trim().equals("Diet")){ %>selected="selected"<% } %> value="Diet">Diet</option>
                                <option <% if(category.trim().equals("Holiday")){ %>selected="selected"<% } %> value="Holiday">Holiday</option>
                                <option <% if(category.trim().equals("Vegetarian")){ %>selected="selected"<% } %> value="Vegetarian">Vegetarian</option>
                                <option <% if(category.trim().equals("Beverages")){ %>selected="selected"<% } %> value="Beverages">Beverages</option>
                                <option <% if(category.trim().equals("Soups")){ %>selected="selected"<% } %> value="Soups">Soups, Stews and Chili</option>
                                <option <% if(category.trim().equals("Seafood")){ %>selected="selected"<% } %> value="Seafood">Seafood</option>
                            </select>
                        </div>
                        <div class="col-md-2">
                            <label>Cook time</label>
                            <input type="text" id="cook-time" class="form-control" name="cook_time" value="<%=cook_time %>" autocomplete="off"/>
                        </div> 
                        <div class="col-md-3">
                            <label>Ingredients</label>
                            <input type="text" class="form-control" autocomplete="off" name="ingredients" value="<%=composition %>" />
                        </div>
                        <div class="col-md-1">
                            
                            <input type="submit" name="search" class="btn btn-primary" style="margin-top: 24px;" value="Search" />
                        </div>
                    </form>
                    </div>
                </div>

            </div>
        </form>
        <div class="col-md-12">
            <br/>
            <div class="row">
                <div class="col-md-12">
                    <c:forEach items='<%=list%>' var="recipe">
                        <div class="col-md-2 text-center" style="border: 1px solid #ccc; background-color: #fff; padding-left: 0px !important; padding-right: 0px !important; margin-left: 1%; margin-right: 2%; margin-top: 20px;">
                            <a href="recipeDetails.jsp?id=${recipe.getId()}"><img style="height: 200px;" src="photos/${recipe.getImage()}" class="img-responsive" /></a>
                            <h4><a href="recipeDetails.jsp?id=${recipe.getId()}">${recipe.getTitle()}</a></h4>
                            <div style="height: 40px; background-color: #e4e4e4;">
                                <table style="height: 40px; border: none; background-color: #e4e4e4">
                                    <tr>
                                        <td style="padding-top: 0px !important; background-color: #e4e4e4; padding-bottom: 0px !important; border: none;"><img src="images/contact.jpg" style="width: 40px; height: 40px;" class="img-responsive img-circle" /> </td>
                                        <td style="padding-top: 0px !important; background-color: #e4e4e4; padding-bottom: 0px !important;">asda</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </div>
    <script type='text/javascript'>
        /* <![CDATA[ */
        var icl_vars = {"current_language": "en", "icl_home": ""};
        /* ]]> */
    </script>

</body>
</html>
