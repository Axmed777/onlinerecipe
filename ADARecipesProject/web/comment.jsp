<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items='<%=request.getAttribute("comments") %>' var="comment">
    
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