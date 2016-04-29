<%@page import="java.util.Date"%>
<%@page import="com.recipes.entity.Likes"%>
<%@page import="com.recipes.dao.DAO"%>
<% DAO d = new DAO();
    Likes l = new Likes();
    l.setRecipe_id(Integer.parseInt(request.getParameter("recipe").toString()));
    l.setUser_id(Integer.parseInt(session.getAttribute("user_id").toString()));
   if(!d.insertLike(l)){
  %>
  <a href="javascript:void(0)" class="like pull-right"><span style="font-size: 18px; color: gray" class="glyphicon glyphicon-heart" aria-hidden="true"></span></a>
  <%
   }else{
  %>
<a href="javascript:void(0)" class="like pull-right"><span style="font-size: 18px; color: red" class="glyphicon glyphicon-heart" aria-hidden="true"></span></a>
  <% } %>