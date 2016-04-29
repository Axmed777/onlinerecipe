<%@page import="com.recipes.entity.UserComment"%>
<%@page import="com.recipes.entity.Recipe"%>
<%@page import="java.util.List"%>
<%@page import="com.recipes.dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DAO dao = new DAO();
    Recipe r = dao.findRecipe(Integer.parseInt(request.getParameter("id")));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/shared/header.jsp" %>
        <title><%=r.getTitle()%></title>
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/comments.css">
        <link rel="stylesheet" type="text/css" href="css/details.css">
        <script>
            $(function () {
                $(document).on("click", ".like", function () {
                    $.ajax({
                        url: "like.jsp",
                        data: {
                            recipe: <%=request.getParameter("id")%>
                        },
                        success: function (data) {
                            $("#update-like").html(data);
                        },
                        error: function (error) {

                        }
                    });
                });
                
                $("#btnComment").click(function(){
                    if($("#comment").val().trim() === ""){
                        $("#comment").css('border', '1px solid red');
                        return false;
                    }else{
                        $("#comment").css('border', '');
                    }
                    $.ajax({
                        url: "Comment",
                        data: {
                            recipe: <%=request.getParameter("id")%>,
                            comment: $("#comment").val()
                        },
                        success: function (data) {
                            $("#comment").val("");
                            $("#commentList").html(data);
                        },
                        error: function () {

                        }
                    });
                });
            });
        </script>
    </head>
    <body> 
        <%@include file="shared/navigation.jsp" %>
        <div style="margin-top: 170px;"></div>

        <div class="container">
            <div class="row">


                <div class="col-md-10 blogShort">
                    <h1><%=r.getTitle()%></h1>
                    <img src="photos/<%=r.getImage()%>" alt="post img" style="max-width: 40%" class="pull-left img-responsive postImg img-thumbnail margin10">
                    <article>
                        <p><b>Category</b>: <%=r.getCategory()%> | <b>Posted By</b>: <%=dao.findUsersByRecipe(r.getId()).getFirstname()%> | <b>Date</b>: <%=r.getInsert_date().split(" ")[0]%></p>
                        
                        <h3>What you need...</h3>
                        <p>
                            <%=r.getArticle()%>
                        </p>

                        <h3>Ingredients</h3>
                        <p>
                            <% for (String comp : r.getComposition().split(",")) {%>
                            <span class="label label-success" ><%=comp%></span>
                            <% }%>

                        </p>
                        <h3>Directions</h3>

                        <p>
                            <%=r.getPrepared_rules()%>
                        </p>
                        <p><b>Prepare Time</b>: <%=r.getPrep_time() %> | <b>Cook Time</b>: <%=r.getCook_time() %> | <b>Total Time</b>: <%=r.getTotal_time() %></p>



                        <c:if test='<%=session.getAttribute("user_id") != null%>'>
                            <div id="update-like">
                                <c:choose>
                                    <c:when test='<%=dao.checkLikeWithConnection(Integer.parseInt(session.getAttribute("user_id").toString()), Integer.parseInt(request.getParameter("id")))%>'>
                                        <a href="javascript:void(0)" class="like pull-right"><span style="font-size: 18px; color: red" class="glyphicon glyphicon-heart" aria-hidden="true"></span></a>
                                        </c:when>
                                        <c:otherwise>
                                        <a href="javascript:void(0)" class="like pull-right"><span style="font-size: 18px; color: gray" class="glyphicon glyphicon-heart" aria-hidden="true"></span></a>
                                        </c:otherwise>
                                    </c:choose>
                            </div>
                        </c:if>
                    </article>

                </div>

                            <% List<UserComment> comments =  dao.userComment(Integer.parseInt(request.getParameter("id"))); %>
                        <div id="commentList">
                            <c:forEach items='<%=comments %>' var="comment">
                                <div class="col-sm-8">
                                    <div class="panel panel-white post panel-shadow">
                                        <div class="post-heading">
                                            <div class="pull-left image">
                                                <img src="${comment.getImage()}" class="img-circle avatar" alt="user profile image">
                                            </div>
                                            <div class="pull-left meta">
                                                <div class="title h5">
                                                    <a href="javascript: void(0)"><b>${comment.getFirstname()} ${comment.getLastname()}</b></a>
                                                </div>
                                                <h6 class="text-muted time">${comment.getInsert_date()}</h6>
                                            </div>
                                        </div> 
                                        <div class="post-description"> 
                                            <p>${comment.getComment()}</p>
                                        </div>
                                    </div>
                                </div> 
                            </c:forEach>
                        </div>
                        
                 
<c:if test='<%=session.getAttribute("user_id") != null%>'>
                <div class="col-md-8 col-lg-8">
                            <div class="widget-area no-padding blank">
                                <div class="status-upload">
                                    <form>
                                        <textarea name="comment" id="comment" placeholder="Comment Here..." ></textarea>
                                        
                                        <button type="button" id="btnComment" class="btn btn-success green">Comment</button>
                                    </form>
                                </div><!-- Status Upload  -->
                            </div><!-- Widget Area -->
                        </div>
</c:if>
            </div>
        </div>



        <script type='text/javascript'>
            /* <![CDATA[ */
            var icl_vars = {"current_language": "en", "icl_home": ""};
            /* ]]> */
        </script>

    </body>
</html>
