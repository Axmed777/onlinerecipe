package org.apache.jsp.shared;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
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
      out.write("                        \n");
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
      out.write("                            <a href=\"categories.jsp\">Categories</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-25\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-25 menu-name-about\">\n");
      out.write("                            <a href=\"dictionary.jsp\">Cooking Dictionary</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-10946\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-10946 menu-name-press\">\n");
      out.write("                            <a href=\"addRecipe.jsp\">Add Recipe</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-29\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-27 current_page_item menu-item-29 menu-name-home\">\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-1723\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1723 menu-name-blog\">\n");
      out.write("                            <a href=\"tips.jsp\">Tips</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-23\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-23 menu-name-contact\">\n");
      out.write("                            <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"menu-item-87\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-87 menu-name-faq\">\n");
      out.write("                            <a href=\"createYourOwnBook.jsp\">Create Your Own Cookbook</a>\n");
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
