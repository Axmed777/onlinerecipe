package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Admin Panel</title>\n");
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
      out.write("          <h1 class=\"page-header\">Dashboard</h1>\n");
      out.write("\n");
      out.write("          <div class=\"row placeholders\">\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <h2 class=\"sub-header\">Section title</h2>\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>#</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,001</td>\n");
      out.write("                  <td>Lorem</td>\n");
      out.write("                  <td>ipsum</td>\n");
      out.write("                  <td>dolor</td>\n");
      out.write("                  <td>sit</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,002</td>\n");
      out.write("                  <td>amet</td>\n");
      out.write("                  <td>consectetur</td>\n");
      out.write("                  <td>adipiscing</td>\n");
      out.write("                  <td>elit</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,003</td>\n");
      out.write("                  <td>Integer</td>\n");
      out.write("                  <td>nec</td>\n");
      out.write("                  <td>odio</td>\n");
      out.write("                  <td>Praesent</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,003</td>\n");
      out.write("                  <td>libero</td>\n");
      out.write("                  <td>Sed</td>\n");
      out.write("                  <td>cursus</td>\n");
      out.write("                  <td>ante</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,004</td>\n");
      out.write("                  <td>dapibus</td>\n");
      out.write("                  <td>diam</td>\n");
      out.write("                  <td>Sed</td>\n");
      out.write("                  <td>nisi</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,005</td>\n");
      out.write("                  <td>Nulla</td>\n");
      out.write("                  <td>quis</td>\n");
      out.write("                  <td>sem</td>\n");
      out.write("                  <td>at</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,006</td>\n");
      out.write("                  <td>nibh</td>\n");
      out.write("                  <td>elementum</td>\n");
      out.write("                  <td>imperdiet</td>\n");
      out.write("                  <td>Duis</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,007</td>\n");
      out.write("                  <td>sagittis</td>\n");
      out.write("                  <td>ipsum</td>\n");
      out.write("                  <td>Praesent</td>\n");
      out.write("                  <td>mauris</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,008</td>\n");
      out.write("                  <td>Fusce</td>\n");
      out.write("                  <td>nec</td>\n");
      out.write("                  <td>tellus</td>\n");
      out.write("                  <td>sed</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,009</td>\n");
      out.write("                  <td>augue</td>\n");
      out.write("                  <td>semper</td>\n");
      out.write("                  <td>porta</td>\n");
      out.write("                  <td>Mauris</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,010</td>\n");
      out.write("                  <td>massa</td>\n");
      out.write("                  <td>Vestibulum</td>\n");
      out.write("                  <td>lacinia</td>\n");
      out.write("                  <td>arcu</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,011</td>\n");
      out.write("                  <td>eget</td>\n");
      out.write("                  <td>nulla</td>\n");
      out.write("                  <td>Class</td>\n");
      out.write("                  <td>aptent</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,012</td>\n");
      out.write("                  <td>taciti</td>\n");
      out.write("                  <td>sociosqu</td>\n");
      out.write("                  <td>ad</td>\n");
      out.write("                  <td>litora</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,013</td>\n");
      out.write("                  <td>torquent</td>\n");
      out.write("                  <td>per</td>\n");
      out.write("                  <td>conubia</td>\n");
      out.write("                  <td>nostra</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,014</td>\n");
      out.write("                  <td>per</td>\n");
      out.write("                  <td>inceptos</td>\n");
      out.write("                  <td>himenaeos</td>\n");
      out.write("                  <td>Curabitur</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,015</td>\n");
      out.write("                  <td>sodales</td>\n");
      out.write("                  <td>ligula</td>\n");
      out.write("                  <td>in</td>\n");
      out.write("                  <td>libero</td>\n");
      out.write("                </tr>\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
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
