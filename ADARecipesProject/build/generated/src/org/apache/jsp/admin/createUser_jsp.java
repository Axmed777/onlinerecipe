package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/shared/head.jsp");
    _jspx_dependants.add("/shared/navbar.jsp");
    _jspx_dependants.add("/shared/left.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
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

      out.write('\n');
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(session.getAttribute("user_id") == null );
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write('\n');
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Admin Create User</title>\n");
      out.write("\n");
      out.write("    ");
      out.write("<link rel=\"stylesheet\" href=\"/ADARecipesProject/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"/ADARecipesProject/css/dashboard.css\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/holder.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie10-viewport-bug-workaround.js\"></script>");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Admin Panel</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("            <li><a href=\"#\">Settings</a></li>\n");
      out.write("            <li><a href=\"#\">Profile</a></li>\n");
      out.write("            <li><a href=\"../Logout\">Log Out</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <form class=\"navbar-form navbar-right\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        \n");
      out.write("          ");
      out.write("<div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li><a href=\"admin.jsp\">Overview <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li><a href=\"users.jsp\">Users</a></li>\n");
      out.write("            <li><a href=\"#\">Analytics</a></li>\n");
      out.write("            <li><a href=\"#\">Export</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li><a href=\"\">Nav item</a></li>\n");
      out.write("            <li><a href=\"\">Nav item again</a></li>\n");
      out.write("            <li><a href=\"\">One more nav</a></li>\n");
      out.write("            <li><a href=\"\">Another nav item</a></li>\n");
      out.write("            <li><a href=\"\">More navigation</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li><a href=\"\">Nav item again</a></li>\n");
      out.write("            <li><a href=\"\">One more nav</a></li>\n");
      out.write("            <li><a href=\"\">Another nav item</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("          \n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("          <h2 class=\"sub-header\">Create User</h2>\n");
      out.write("          <form action=\"../Admin?createUser=\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Name</label>\n");
      out.write("                  <input type=\"text\" name=\"name\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Surname</label>\n");
      out.write("                  <input type=\"text\" name=\"surname\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Email</label>\n");
      out.write("                  <input type=\"text\" name=\"email\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Password</label>\n");
      out.write("                  <input type=\"password\" name=\"password\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Image</label>\n");
      out.write("                  <input type=\"file\" name=\"image\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Gender</label>\n");
      out.write("                  <select name=\"gender\" class=\"form-control\">\n");
      out.write("                      <option value=\"M\">Male</option>\n");
      out.write("                      <option value=\"F\">Female</option>\n");
      out.write("                  </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Address</label>\n");
      out.write("                  <textarea name=\"address\" class=\"form-control\" ></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Admin</label>\n");
      out.write("                  <input type=\"checkbox\" name=\"admin\" class=\"form-control\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <button class=\"btn btn-primary\" name=\"createUser\">Create</button>\n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
