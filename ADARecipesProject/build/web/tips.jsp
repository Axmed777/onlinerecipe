<%@page import="com.recipes.dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/shared/header.jsp" %>
        <% DAO dao = new DAO();%>
        <style>
            .starter-template {
                padding: 40px 15px;
                text-align: center;
            }

            .content-wrapper {
                position: relative;
                padding: 2em; 
            }

            .floated-quote {
                float: none;
            }

            blockquote {
                border: none;
                margin: 1.5em 10px;
                padding: 0.5em 10px;
                quotes: "\201C""\201D""\2018""\2019";
            }
            blockquote:before,
            blockquote:after {
                color: #ccc;
                font-size: 4em;
                line-height: 0.1em;
                margin-right: 0.25em;
            }
            blockquote:before {
                content: open-quote;
                vertical-align: -0.4em;
            }
            blockquote:after {
                content: close-quote;
                vertical-align: -0.6em;
            }
            blockquote p {
                display: inline;
            }



        </style>

    </head>
    <body> 
        <%@include file="shared/navigation.jsp" %>
        <div style="margin-top: 170px;">
            <div class="col-md-12">
                <h5 style="color: gray">Tips</h5>
                <div class="container">


                    <div class="content-wrapper">
                        <c:forEach items="<%=dao.tips() %>" var="tip">
                        <div class="col-md-6 col-lg-6">
                            <aside class="floated-quote">
                                <blockquote>
                                    <p>
                                        ${tip.getTips()}
                                    </p>
                                    <c:if test="${not empty tip.getFrom()}">
                                    <footer>${tip.getFrom()}</footer>
                                    </c:if>
                                </blockquote>
                            </aside>
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
