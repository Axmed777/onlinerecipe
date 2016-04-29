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
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
        <img src="slider/slider1.jpg" alt="...">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
        <img src="slider/slider2.jpg" alt="...">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
        <img src="slider/slider3.jpg" alt="...">
      <div class="carousel-caption">
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
                <h5 style="color: gray">All Categories</h5>
                <div class="row">
                    <div class="grid">
					<figure class="effect-sarah">
						<img src="category/appetizers.png" alt="img13"/>
						<figcaption>
							<h2><span>Diabetic</span></h2>
							<a href="search.jsp?category=Diabetic">View more</a>
						</figcaption>			
					</figure>
					<figure class="effect-sarah">
						<img src="category/diet.jpg" alt="img20"/>
						<figcaption>
							<h2><span>Diet</span></h2>
							<a href="search.jsp?category=Diet">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
						<img src="category/holiday.png" alt="img20"/>
						<figcaption>
							<h2><span>Holiday</span></h2>
							<a href="search.jsp?category=Holiday">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
						<img src="category/vegetarian.png" alt="img20"/>
						<figcaption>
							<h2><span>Vegetarian</span></h2>
							<a href="search.jsp?category=Vegetarian">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
						<img src="category/dessert.png" alt="img20"/>
						<figcaption>
							<h2><span>Dessert</span></h2>
							
							<a href="search.jsp?category=Dessert">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
                                            <img src="category/fastfood.jpg" alt="img20"/>
						<figcaption>
							<h2><span>Beverages</span></h2>
							
							<a href="search.jsp?category=Beverages">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
                                            <img src="category/soups.png" alt="img20"/>
						<figcaption>
							<h2><span>Soups, Stews and Chili</span></h2>
							
							<a href="search.jsp?category=Soups">View more</a>
						</figcaption>			
					</figure>
                                        <figure class="effect-sarah">
                                            <img src="category/seafood.png" alt="img20"/>
						<figcaption>
							<h2><span>Seafood</span></h2>
							
							<a href="search.jsp?category=Seafood">View more</a>
						</figcaption>			
					</figure>
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
