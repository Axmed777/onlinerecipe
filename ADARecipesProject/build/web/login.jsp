<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/shared/header.jsp" %>
    </head>
    <body> 
        <%@include file="shared/navigation.jsp" %>
        <div style="margin-top: 170px;">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-5">
                        <h3>Login</h3>
                        <hr/>
                        <c:if test='<%=request.getParameter("error")!=null %>'>
                            <span style="color: red">Invalid username or password</span>
                        </c:if>
                        <form action="Login?login=" method="post" class="form-signin">
                            <table style="width: 100%; background-color: transparent;" >
                                <tr>
                                    <td style="width: 40%; background-color: #fff; border: none">Email Address</td>
                                    <td style="background-color: #fff;border: none"><input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required ></td>
                                </tr>
                                <tr>
                                    <td style="background-color: #fff;border: none">Password</td>
                                    <td style="background-color: #fff;border: none"><input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required></td>
                                </tr>
                                <tr>
                                    <td style="background-color: #fff;border: none"><button style="background-color: #c0a16b; border-color: #c0a16b" class="btn btn-primary">Login</button> <input type="checkbox" name="remember_me" />  Remember me</td>
                                    <td style="background-color: #fff;border: none"></td>
                                </tr>
                            </table>
                            
                            

                            
                        </form><!-- /form -->
                    </div>
                    <div class="col-md-7">
                        <h3>Register</h3>
                        <hr/>
                        <c:if test='<%=request.getParameter("success")!=null %>'>
                            <span style="color: green">You are registered successfully. Please Login</span>
                        </c:if>
                            <form action="Login?register=" method="post" class="form-signin">
                            <table style="width: 100%; background-color: transparent;" >
                                <tr >
                                    <td style="width: 20%; background-color: #fff; border: none">Name *</td>
                                    <td style="background-color: #fff;border: none"><input type="text" id="inputName" name="name" class="form-control" placeholder="Name" required ></td>
                                </tr>
                                <tr >
                                    <td style="width: 20%; background-color: #fff; border: none">Surname *</td>
                                    <td style="background-color: #fff;border: none"><input type="text" id="inputSurname" name="surname" class="form-control" placeholder="Surname" required></td>
                                </tr>
                                <tr >
                                    <td style="width: 20%; background-color: #fff; border: none">Email address *</td>
                                    <td style="background-color: #fff;border: none"><input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required ></td>
                                </tr>
                                <tr>
                                    <td style="background-color: #fff;border: none">Password *</td>
                                    <td style="background-color: #fff;border: none"><input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required></td>
                                </tr>
                                <tr>
                                    <td style="background-color: #fff;border: none"><button style="background-color: #c0a16b; border-color: #c0a16b" class="btn btn-primary">Register</button> </td>
                                    <td style="background-color: #fff;border: none"></td>
                                </tr>
                            </table>
                        </form><!-- /form -->
                    </div>
                    
                </div>
            </div>
        </div>
<script type='text/javascript'>
/* <![CDATA[ */
var icl_vars = {"current_language":"en","icl_home":""};
/* ]]> */
</script>

    </body>
</html>