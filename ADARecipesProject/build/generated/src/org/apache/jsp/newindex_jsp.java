package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/shared/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"wp-content/cache/minify/000000/20124/default.include.14af51.css\" media=\"all\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"wp-content/cache/minify/000000/20124/default.include.73474f.js\"></script>\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <header id=\"header\" style=\"padding-top: 0px !important;\">\n");
      out.write("            <div id=\"mid-header\" role=\"navigation\" style=\"top: 0px !important;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\"> \n");
      out.write("                        <a id=\"mobile-logo\" href=\"index.html\" rel=\"home\" class=\"icon icon-logo visible-xs\" title=\"Delicious Meals\"></a> \n");
      out.write("                        <a id=\"btn_open_nav\" href=\"#header\" class=\"mobile_toggle\" title=\"Open main navigation\">&#9776;</a> \n");
      out.write("                        <a id=\"btn_close_nav\" href=\"#body\" class=\"mobile_toggle\" title=\"Close main navigation\">&#9776;</a> \n");
      out.write("                        <nav id=\"main_nav\" role=\"navigation\">\n");
      out.write("                            <ul id=\"menu-navigation-principale\" class=\"menu\">\n");
      out.write("                                <li id=\"menu-item-26\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-26 menu-name-shop\">\n");
      out.write("                                    <a href=\"shop/index.html\">Shop</a>\n");
      out.write("                                    <ul class=\"sub-menu\">\n");
      out.write("                                        <li id=\"menu-item-506\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-506 menu-name-tea-blends\">\n");
      out.write("                                            <a href=\"shop/index.html#goto-cat-tea-blends\">Tea blends</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li id=\"menu-item-1560\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-1560 menu-name-accessories\">\n");
      out.write("                                            <a href=\"shop/index.html#goto-cat-teabags-and-assortments\">Accessories</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-507 menu-name-specialties\">\n");
      out.write("                                            <a href=\"shop/index.html#goto-cat-original-products\">Specialties</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-25\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-25 menu-name-about\">\n");
      out.write("                                    <a href=\"about/index.html\">About</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-10946\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-10946 menu-name-press\">\n");
      out.write("                                    <a href=\"press/index.html\">Press</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-29\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-27 current_page_item menu-item-29 menu-name-home\">\n");
      out.write("                                    <a href=\"index.html\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-1723\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1723 menu-name-blog\">\n");
      out.write("                                    <a href=\"blog/index.html\">Blog</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-87\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-87 menu-name-faq\">\n");
      out.write("                                    <a href=\"faq/index.html\">FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li id=\"menu-item-23\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-23 menu-name-contact\">\n");
      out.write("                                    <a href=\"contact/index.html\">Contact</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul> \n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </header>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("<script type='text/javascript'>\n");
      out.write("/* <![CDATA[ */\n");
      out.write("var icl_vars = {\"current_language\":\"en\",\"icl_home\":\"\"};\n");
      out.write("/* ]]> */\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"wp-content/cache/minify/000000/20124/default.include-footer.d75fd1.js\"></script>\n");
      out.write("    </body>\n");
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
