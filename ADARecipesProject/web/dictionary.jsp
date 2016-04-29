<%@page import="com.recipes.dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/shared/header.jsp" %>
        <% DAO dao = new DAO(); %>
    </head>
    <body> 
        <%@include file="shared/navigation.jsp" %>
        <div style="margin-top: 170px;">
            <div class="col-md-12">
                <h5 style="color: gray">Dictionary</h5>
                <div class="row">
                    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                        <c:forEach items="<%=dao.dictionary()%>" var="word">
                            <div class="col-md-12 col-lg-12">
                                <div class="panel panel-default">
                                    <div class="panel-heading" role="tab" id="${word.getId()}">
                                        <h4 class="panel-title">
                                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapse${word.getId()}" aria-expanded="false" aria-controls="collapseOne">
                                                ${word.getWord()}
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="collapse${word.getId()}" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
                                        <div class="panel-body">
                                            ${word.getAbout()}
                                        </div>
                                    </div>
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
