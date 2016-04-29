package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.recipes.entity.Recipe;
import java.util.List;
import com.recipes.dao.DAO;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/shared/header.jsp");
    _jspx_dependants.add("/shared/navigation.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DAO dao = new DAO();
    String name = request.getParameter("name") != null ? request.getParameter("name").toString() : "";
    String category = request.getParameter("category") != null ? request.getParameter("category").toString() : "";
    String cook_time = request.getParameter("cook_time") != null ? request.getParameter("cook_time").toString() : "";
    String composition = request.getParameter("composition") != null ? request.getParameter("composition").toString() : "";
    List<Recipe> list = dao.searchProduct(name, category, cook_time, composition);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"wp-content/cache/minify/000000/20124/default.include.14af51.css\" media=\"all\" />\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"apple-touch-icon-57x57.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"apple-touch-icon-114x114.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"apple-touch-icon-72x72.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"apple-touch-icon-144x144.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"apple-touch-icon-60x60.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"apple-touch-icon-120x120.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"apple-touch-icon-76x76.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"apple-touch-icon-152x152.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon-196x196.png\" sizes=\"196x196\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon-160x160.png\" sizes=\"160x160\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"mstile-144x144.png\">\n");
      out.write("    <title>Home - My Beauty Tea</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"wp-content/plugins/sitepress-multilingual-cms/res/css/language-selector9aef.css?v=3.1.8.2\" type=\"text/css\" media=\"all\" /><link\n");
      out.write("        rel=\"profile\" href=\"http://gmpg.org/xfn/11\">\n");
      out.write("    <link rel=\"pingback\" href=\"xmlrpc.php\">\n");
      out.write("    <meta name=\"description\" content=\"With My Beauty Tea, your daily cup of tea is your new beauty essential ! Our teas are natural using ingredients such as flowers, fruits and natural flavours for a divine taste !\"/><link\n");
      out.write("        rel=\"canonical\" href=\"index.html\" />\n");
      out.write("    <meta property=\"og:locale\" content=\"en_US\" />\n");
      out.write("    <meta property=\"og:type\" content=\"website\" />\n");
      out.write("    <meta property=\"og:title\" content=\"Home - My Beauty Tea\" />\n");
      out.write("    <meta property=\"og:description\" content=\"With My Beauty Tea, your daily cup of tea is your new beauty essential ! Our teas are natural using ingredients such as flowers, fruits and natural flavours for a divine taste !\" /><meta\n");
      out.write("        property=\"og:url\" content=\"https://mybeautytea.com/\" />\n");
      out.write("    <meta property=\"og:site_name\" content=\"My Beauty Tea\" /><script type='application/ld+json'>{\"@context\":\"http:\\/\\/schema.org\",\"@type\":\"WebSite\",\"url\":\"https:\\/\\/mybeautytea.com\\/\",\"name\":\"My Beauty Tea\",\"potentialAction\":{\"@type\":\"SearchAction\",\"target\":\"https:\\/\\/mybeautytea.com\\/?s={search_term}\",\"query-input\":\"required name=search_term\"}}</script><meta\n");
      out.write("        name=\"google-site-verification\" content=\"4X-c1slp_fxovgADZgLxU7s69aXHSyjQ4YWxphxMWrQ\" /><link\n");
      out.write("        rel=\"alternate\" type=\"application/rss+xml\" title=\"My Beauty Tea &raquo; Feed\" href=\"feed/index.html\" /><link\n");
      out.write("        rel=\"alternate\" type=\"application/rss+xml\" title=\"My Beauty Tea &raquo; Comments Feed\" href=\"comments/feed/index.html\" /><link\n");
      out.write("    rel=\"alternate\" type=\"application/rss+xml\" title=\"My Beauty Tea &raquo; Home Comments Feed\" href=\"home/feed/index.html\" />\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        window._wpemojiSettings = {\"baseUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/72x72\\/\", \"ext\":\".png\", \"source\":{\"concatemoji\":\"https:\\/\\/mybeautytea.com\\/wp-includes\\/js\\/wp-emoji-release.min.js?ver=4.2.2\"}};\n");
      out.write("        !function(a, b, c){function d(a){var c = b.createElement(\"canvas\"), d = c.getContext && c.getContext(\"2d\"); return d && d.fillText?(d.textBaseline = \"top\", d.font = \"600 32px Arial\", \"flag\" === a?(d.fillText(String.fromCharCode(55356, 56812, 55356, 56807), 0, 0), c.toDataURL().length > 3e3):(d.fillText(String.fromCharCode(55357, 56835), 0, 0), 0 !== d.getImageData(16, 16, 1, 1).data[0])):!1}function e(a){var c = b.createElement(\"script\"); c.src = a, c.type = \"text/javascript\", b.getElementsByTagName(\"head\")[0].appendChild(c)}var f, g; c.supports = {simple:d(\"simple\"), flag:d(\"flag\")}, c.DOMReady = !1, c.readyCallback = function(){c.DOMReady = !0}, c.supports.simple && c.supports.flag || (g = function(){c.readyCallback()}, b.addEventListener?(b.addEventListener(\"DOMContentLoaded\", g, !1), a.addEventListener(\"load\", g, !1)):(a.attachEvent(\"onload\", g), b.attachEvent(\"onreadystatechange\", function(){\"complete\" === b.readyState && c.readyCallback()})), f = c.source || {}, f.concatemoji?e(f.concatemoji):f.wpemoji && f.twemoji && (e(f.twemoji), e(f.wpemoji)))}(window, document, window._wpemojiSettings);\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        img.wp-smiley,\n");
      out.write("        img.emoji {\n");
      out.write("            display: inline !important;\n");
      out.write("            border: none !important;\n");
      out.write("            box-shadow: none !important;\n");
      out.write("            height: 1em !important;\n");
      out.write("            width: 1em !important;\n");
      out.write("            margin: 0 .07em !important;\n");
      out.write("            vertical-align: -0.1em !important;\n");
      out.write("            background: none !important;\n");
      out.write("            padding: 0 !important;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script type='text/javascript'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var wpml_browser_redirect_params = {\"pageLanguage\":\"en\", \"languageUrls\":{\"en_US\":\"https:\\/\\/mybeautytea.com\", \"en\":\"https:\\/\\/mybeautytea.com\", \"US\":\"https:\\/\\/mybeautytea.com\", \"fr_FR\":\"https:\\/\\/mybeautytea.com?lang=fr\", \"fr\":\"https:\\/\\/mybeautytea.com?lang=fr\", \"FR\":\"https:\\/\\/mybeautytea.com?lang=fr\"}, \"cookie\":{\"name\":\"_icl_visitor_lang_js\", \"domain\":\"mybeautytea.com\", \"path\":\"\\/\", \"expiration\":24}};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"xmlrpc0db0.php?rsd\" />\n");
      out.write("    <link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"wp-includes/wlwmanifest.xml\" />\n");
      out.write("    <meta name=\"generator\" content=\"WordPress 4.2.2\" />\n");
      out.write("    <meta name=\"generator\" content=\"WooCommerce 2.3.11\" />\n");
      out.write("    <link rel='shortlink' href='index.html' />\n");
      out.write("    <meta name=\"generator\" content=\"WPML ver:3.1.8.2 stt:1,4;0\" />\n");
      out.write("    <link rel=\"alternate\" hreflang=\"en-US\" href=\"index.html\" />\n");
      out.write("    <link rel=\"alternate\" hreflang=\"fr-FR\" href=\"indexe68f.html?lang=fr\" />\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}\n");
      out.write("    </style>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .mc4wp-form input[name=\"_mc4wp_required_but_not_really\"] { display: none !important; }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"/ADARecipesProject/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"/ADARecipesProject/css/dashboard.css\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/holder.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        <script src=\"js/mask.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function(){\n");
      out.write("                Mask.newMask({\n");
      out.write("                    $el: $(\"#cook-time\"),\n");
      out.write("                    mask: \"HH:mm\"\n");
      out.write("                });\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        ");
      out.write("\n");
      out.write("<header id=\"header\" style=\"padding-top: 0px !important;\">\n");
      out.write("\n");
      out.write("    <div id=\"top-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"free-shipping-pink\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"textwidget\">\n");
      out.write("                        <span></span>\n");
      out.write("                        <a href=\"index9829.html?page_id=40\" id=\"btn_free_shipping\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-6\">\n");
      out.write("                    <ul id=\"menu-reseaux-sociaux\" class=\"social-icons\">\n");
      out.write("                        <li id=\"menu-item-30\" class=\"instagram menu-item menu-item-type-custom menu-item-object-custom menu-item-30 menu-name-instagram\">\n");
      out.write("                            <a target=\"_blank\" href=\"http://instagram.com/mybeautytea\"><span>Instagram</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-31\" class=\"facebook menu-item menu-item-type-custom menu-item-object-custom menu-item-31 menu-name-facebook\">\n");
      out.write("                            <a target=\"_blank\" href=\"https://www.facebook.com/mybeautytea\"><span>Facebook</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-1697\" class=\"pinterest menu-item menu-item-type-custom menu-item-object-custom menu-item-1697 menu-name-pinterest\">\n");
      out.write("                            <a target=\"_blank\" href=\"http://www.pinterest.com/mybeautytea\"><span>Pinterest</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-9942\" class=\"twitter menu-item menu-item-type-custom menu-item-object-custom menu-item-9942 menu-name-twitter\">\n");
      out.write("                            <a target=\"_blank\" href=\"https://twitter.com/_mybeautytea\"><span>Twitter</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"free-shipping\" class=\"col-lg-4 col-md-4\">\n");
      out.write("                    <!--                    <div class=\"textwidget\">\n");
      out.write("                                            <span>Free Shipping - ?50$ or more</span>\n");
      out.write("                                            <a href=\"index9829.html?page_id=40\" id=\"btn_free_shipping\">Learn more</a>\n");
      out.write("                                        </div>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-6 register-cart\">\n");
      out.write("                    <ul class=\"meta-nav cart-menu\" role=\"menu\">\n");
      out.write("                        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(session.getAttribute("user_id") == null);
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li>\n");
          out.write("                                <a href=\"login.jsp\"><span>Register</span></a>\n");
          out.write("                            </li>\n");
          out.write("                            <li  >\n");
          out.write("                                <a  href=\"login.jsp\"><span>Login</span></a>\n");
          out.write("                            </li>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("                        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(session.getAttribute("user_id") != null);
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li>\n");
          out.write("                                <a href=\"Logout\"><span>Logout</span></a>\n");
          out.write("                            </li>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"mid-header\" role=\"navigation\" >\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\"> \n");
      out.write("\n");
      out.write("                <a id=\"mobile-logo\" href=\"index.html\" rel=\"home\" class=\"icon icon-logo visible-xs\" title=\"Delicious Meals\"></a> \n");
      out.write("                <a id=\"btn_open_nav\" href=\"#header\" class=\"mobile_toggle\" title=\"Open main navigation\">&#9776;</a> \n");
      out.write("                <a id=\"btn_close_nav\" href=\"#body\" class=\"mobile_toggle\" title=\"Close main navigation\">&#9776;</a> \n");
      out.write("\n");
      out.write("                <nav id=\"main_nav\" role=\"navigation\">\n");
      out.write("                    <div style=\"position: absolute; right: 15%; top: 15px; width: 20%\">\n");
      out.write("                        <form action=\"search.jsp\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Find Recipes\">\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <ul id=\"menu-navigation-principale\" class=\"menu\">\n");
      out.write("                        <li id=\"menu-item-26\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-26 menu-name-shop\">\n");
      out.write("                            <a href=\"index.jsp\">Categories</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-25\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-25 menu-name-about\">\n");
      out.write("                            <a href=\"#\">Cooking Dictionary</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-10946\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-10946 menu-name-press\">\n");
      out.write("                            <a href=\"#\">Statistics</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-29\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-27 current_page_item menu-item-29 menu-name-home\">\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-1723\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1723 menu-name-blog\">\n");
      out.write("                            <a href=\"blog/index.html\">Tips</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-23\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-23 menu-name-contact\">\n");
      out.write("                            <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-87\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-87 menu-name-faq\">\n");
      out.write("                            <a href=\"addRecipe.jsp\">Create Your Own Cookbook</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("</header>");
      out.write("\n");
      out.write("        <div style=\"margin-top: 170px;\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <h4 style=\"margin-bottom: 0px !important;\">Search</h4>\n");
      out.write("                <hr/>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                    <form role=\"form\" id=\"form\" autocomplete=\"off\" action=\"search.jsp\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <label>Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"name\" value=\"");
      out.print(name );
      out.write("\" autocomplete=\"off\" />\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <label>Category</label>\n");
      out.write("                            <select class=\"form-control\" name=\"category\">\n");
      out.write("                                <option value=\"\">Choose Category</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Appetizers")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Appetizers\">Appetizers</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Desserts")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Desserts\">Desserts</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Diet")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Diet\">Diet</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Holiday")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Holiday\">Holiday</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Vegetarian")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Vegetarian\">Vegetarian</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("FastFood")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"FastFood\">Fast Food</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Soups")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Soups\">Soups, Stews and Chili</option>\n");
      out.write("                                <option ");
 if(category.trim().equals("Seafood")){ 
      out.write("selected=\"selected\"");
 } 
      out.write(" value=\"Seafood\">Seafood</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2\">\n");
      out.write("                            <label>Cook time</label>\n");
      out.write("                            <input type=\"text\" id=\"cook-time\" class=\"form-control\" name=\"cook_time\" value=\"");
      out.print(cook_time );
      out.write("\" autocomplete=\"off\"/>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <label>Ingredients</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" autocomplete=\"off\" name=\"ingredients\" value=\"");
      out.print(composition );
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-1\">\n");
      out.write("                            \n");
      out.write("                            <input type=\"submit\" name=\"search\" class=\"btn btn-primary\" style=\"margin-top: 24px;\" value=\"Search\" />\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems(list);
      _jspx_th_c_forEach_0.setVar("recipe");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        <div class=\"col-md-2\" style=\"border: 1px solid #ccc; background-color: #fff; padding-left: 0px !important; padding-right: 0px !important; margin-left: 1%; margin-right: 2%; margin-top: 20px;\">\n");
            out.write("                            <a href=\"recipeDetails.jsp?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"><img style=\"height: 200px;\" src=\"photos/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"img-responsive\" /></a>\n");
            out.write("                            <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\n");
            out.write("                            <div style=\"height: 40px; background-color: #e4e4e4;\">\n");
            out.write("                                <table style=\"height: 40px; border: none; background-color: #e4e4e4\">\n");
            out.write("                                    <tr>\n");
            out.write("                                        <td style=\"padding-top: 0px !important; background-color: #e4e4e4; padding-bottom: 0px !important; border: none;\"><img src=\"images/contact.jpg\" style=\"width: 40px; height: 40px;\" class=\"img-responsive img-circle\" /> </td>\n");
            out.write("                                        <td style=\"padding-top: 0px !important; background-color: #e4e4e4; padding-bottom: 0px !important;\">asda</td>\n");
            out.write("                                    </tr>\n");
            out.write("                                </table>\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script type='text/javascript'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var icl_vars = {\"current_language\": \"en\", \"icl_home\": \"\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
