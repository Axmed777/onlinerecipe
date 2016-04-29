<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test='<%=session.getAttribute("user_id") == null%>'>
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

        <title>Add Recipe</title>

        <%@include file="/shared/header.jsp" %>
        <script src="js/jquery-ui.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/tag-it.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="js/mask.js"></script>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
        <link href="css/jquery.tagit.css" rel="stylesheet" type="text/css">
        <script>
            $(function () {
                 $("#myTags").tagit();
                $("#img-button").click(function () {
                    $("#input-file").click();
                });

                $("#input-file").change(function () {
                    var ext = $('#input-file').val().split('.').pop().toLowerCase();
                    if ($.inArray(ext, ['bmp', 'png', 'jpg', 'jpeg']) === -1) {
                        alert('invalid extension!');
                        $('#image').val('');

                    } else {
                        readURL(this);
                    }
                });

                Mask.newMask({
                    $el: $("#clock1"),
                    mask: "HH:mm"
                });

                Mask.newMask({
                    $el: $("#clock2"),
                    mask: "HH:mm"
                });

                Mask.newMask({
                    $el: $("#clock3"),
                    mask: "HH:mm"
                });

                function readURL(input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            $('#preview-image').attr('src', e.target.result);
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }
            }
            );
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
                                <strong>Recipe Successfully Added</strong>
                            </div>
                        </c:if>
                        <form action="Recipes?insert=" method="POST" enctype="multipart/form-data" >
                            <div class="row">
                                <div class="col-md-9">
                                    <div class="form-group">
                                        <label>Category</label>
                                        <select class="form-control" name="category">
                                            <option value="">Choose Category</option>
                                            <option value="Diabetic">Diabetic</option>
                                            <option value="Dessert">Dessert</option>
                                            <option value="Diet">Diet</option>
                                            <option value="Holiday">Holiday</option>
                                            <option value="Vegetarian">Vegetarian</option>
                                            <option value="Beverages">Beverages</option>
                                            <option value="Soups">Soups, Stews and Chili</option>
                                            <option value="Seafood">Seafood</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Title</label>
                                        <input type="text" class="form-control" name="title" />
                                    </div>
                                </div>
                                <div class="col-md-3">

                                    <img id="preview-image" src="images/recipe.jpg" width="120" height="" class="img-thumbnail img-responsive"/>
                                    <button id="img-button" type="button" style="width: 120px;" class="btn btn-success" >Select Image</button>
                                    <div class="form-group" style="display: none">
                                        <label>Image</label>
                                        <input id="input-file" type="file" class="form-control" name="image" />
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label>About</label>
                                <textarea name="article" class="form-control"></textarea>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>Prep Time</label>
                                        <input id="clock1" class="form-control clock" type="text" name="prep_time" />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>Cook Time</label>
                                        <input id="clock2" class="form-control clock" type="text" name="cook_time" />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label>Total Time</label>
                                        <input id="clock3" class="form-control" type="text" name="total_time" />
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Prepare Rules</label>
                                <textarea class="form-control" rows="4" name="prepareRules"></textarea>
                            </div>
                            <div class="form-group">
                                <label>Composition</label>
                                <ul id="myTags"></ul>
                            </div>
                            <div class="form-group">
                                <button class="btn btn-primary pull-right">Save Recipe</button>
                            </div>
                        </form>


                    </div>
                    <div class="col-md-5 col-sm-5">
                        <img src="images/contact.jpg" class="img-responsive pull-right" />
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
