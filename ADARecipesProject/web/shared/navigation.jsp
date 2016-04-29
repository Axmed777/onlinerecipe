<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header id="header" style="padding-top: 0px !important;">

    <div id="top-header">
        <div class="container">
            <div class="row">
                <div id="free-shipping-pink" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="textwidget">
                        <span></span>
                        <a href="index9829.html?page_id=40" id="btn_free_shipping"></a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-6">
                    <ul id="menu-reseaux-sociaux" class="social-icons">
                        <li id="menu-item-30" class="instagram menu-item menu-item-type-custom menu-item-object-custom menu-item-30 menu-name-instagram">
                            <a target="_blank" href="http://instagram.com/mybeautytea"><span>Instagram</span></a>
                        </li>
                        <li id="menu-item-31" class="facebook menu-item menu-item-type-custom menu-item-object-custom menu-item-31 menu-name-facebook">
                            <a target="_blank" href="https://www.facebook.com/mybeautytea"><span>Facebook</span></a>
                        </li>
                        <li id="menu-item-1697" class="pinterest menu-item menu-item-type-custom menu-item-object-custom menu-item-1697 menu-name-pinterest">
                            <a target="_blank" href="http://www.pinterest.com/mybeautytea"><span>Pinterest</span></a>
                        </li>
                        
                    </ul>

                </div>
                <div id="free-shipping" class="col-lg-4 col-md-4">
                    <!--                    <div class="textwidget">
                                            <span>Free Shipping - ?50$ or more</span>
                                            <a href="index9829.html?page_id=40" id="btn_free_shipping">Learn more</a>
                                        </div>-->
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-6 register-cart">
                    <ul class="meta-nav cart-menu" role="menu">
                        <c:if test='<%=session.getAttribute("user_id") == null%>'>
                            <li>
                                <a href="login.jsp"><span>Register</span></a>
                            </li>
                            <li  >
                                <a  href="login.jsp"><span>Login</span></a>
                            </li>
                        </c:if>
                        <c:if test='<%=session.getAttribute("user_id") != null%>'>
                            <li>
                                <a href="Logout"><span>Logout</span></a>
                            </li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div id="mid-header" role="navigation" >

        <div class="container">

            <div class="row"> 

                <a id="mobile-logo" href="index.html" rel="home" class="icon icon-logo visible-xs" title="Delicious Meals"></a> 
                <a id="btn_open_nav" href="#header" class="mobile_toggle" title="Open main navigation">&#9776;</a> 
                <a id="btn_close_nav" href="#body" class="mobile_toggle" title="Close main navigation">&#9776;</a> 

                <nav id="main_nav" role="navigation">
                    <div style="position: absolute; right: 15%; top: 15px; width: 20%">
                        <form action="search.jsp">
                            <div class="input-group">
                                <input type="text" name="name" class="form-control" placeholder="Find Recipes">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                                </span>
                            </div>
                        </form>
                    </div>
                    <ul id="menu-navigation-principale" class="menu">
                        <li id="menu-item-26" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-26 menu-name-shop">
                            <a href="categories.jsp">Categories</a>
                        </li>
                        <li id="menu-item-25" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-25 menu-name-about">
                            <a href="dictionary.jsp">Cooking Dictionary</a>
                        </li>
                        <li id="menu-item-10946" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-10946 menu-name-press">
                            <a href="addRecipe.jsp">Add Recipe</a>
                        </li>
                        <li id="menu-item-29" class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-27 current_page_item menu-item-29 menu-name-home">
                            <a href="index.jsp">Home</a>
                        </li>
                        <li id="menu-item-1723" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-1723 menu-name-blog">
                            <a href="tips.jsp">Tips</a>
                        </li>
                        <li id="menu-item-23" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-23 menu-name-contact">
                            <a href="contact.jsp">Contact</a>
                        </li>
                        <li id="menu-item-87" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-87 menu-name-faq">
                            <a href="createYourOwnBook.jsp">Create Your Own Cookbook</a>
                        </li>
                    </ul>

                </nav>

            </div>

        </div>
    </div> 
</header>