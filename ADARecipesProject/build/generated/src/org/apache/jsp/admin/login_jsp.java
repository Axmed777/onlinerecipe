package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/shared/head.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"/ADARecipesProject/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"/ADARecipesProject/css/dashboard.css\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/holder.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/ADARecipesProject/js/ie10-viewport-bug-workaround.js\"></script>");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            /*\n");
      out.write(" * Specific styles of signin component\n");
      out.write(" */\n");
      out.write("            /*\n");
      out.write("             * General styles\n");
      out.write("             */\n");
      out.write("            body, html {\n");
      out.write("                height: 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-image: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-container.card {\n");
      out.write("                max-width: 350px;\n");
      out.write("                padding: 40px 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("                cursor: default;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             * Card component\n");
      out.write("             */\n");
      out.write("            .card {\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                /* just in case there no content*/\n");
      out.write("                padding: 20px 25px 30px;\n");
      out.write("                margin: 0 auto 25px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                /* shadows and rounded borders */\n");
      out.write("                -moz-border-radius: 2px;\n");
      out.write("                -webkit-border-radius: 2px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-img-card {\n");
      out.write("                width: 96px;\n");
      out.write("                height: 96px;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                display: block;\n");
      out.write("                -moz-border-radius: 50%;\n");
      out.write("                -webkit-border-radius: 50%;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             * Form styles\n");
      out.write("             */\n");
      out.write("            .profile-name-card {\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 10px 0 0;\n");
      out.write("                min-height: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .reauth-email {\n");
      out.write("                display: block;\n");
      out.write("                color: #404040;\n");
      out.write("                line-height: 2;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                text-overflow: ellipsis;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin #inputEmail,\n");
      out.write("            .form-signin #inputPassword {\n");
      out.write("                direction: ltr;\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin input[type=email],\n");
      out.write("            .form-signin input[type=password],\n");
      out.write("            .form-signin input[type=text],\n");
      out.write("            .form-signin button {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                z-index: 1;\n");
      out.write("                position: relative;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin .form-control:focus {\n");
      out.write("                border-color: rgb(104, 145, 162);\n");
      out.write("                outline: 0;\n");
      out.write("                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\n");
      out.write("                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn.btn-signin {\n");
      out.write("                /*background-color: #4d90fe; */\n");
      out.write("                background-color: rgb(104, 145, 162);\n");
      out.write("                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/\n");
      out.write("                padding: 0px;\n");
      out.write("                font-weight: 700;\n");
      out.write("                font-size: 14px;\n");
      out.write("                height: 36px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: none;\n");
      out.write("                -o-transition: all 0.218s;\n");
      out.write("                -moz-transition: all 0.218s;\n");
      out.write("                -webkit-transition: all 0.218s;\n");
      out.write("                transition: all 0.218s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn.btn-signin:hover,\n");
      out.write("            .btn.btn-signin:active,\n");
      out.write("            .btn.btn-signin:focus {\n");
      out.write("                background-color: rgb(12, 97, 33);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .forgot-password {\n");
      out.write("                color: rgb(104, 145, 162);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .forgot-password:hover,\n");
      out.write("            .forgot-password:active,\n");
      out.write("            .forgot-password:focus{\n");
      out.write("                color: rgb(12, 97, 33);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // DOM ready\n");
      out.write("\n");
      out.write("                // Test data\n");
      out.write("                /*\n");
      out.write("                 * To test the script you should discomment the function\n");
      out.write("                 * testLocalStorageData and refresh the page. The function\n");
      out.write("                 * will load some test data and the loadProfile\n");
      out.write("                 * will do the changes in the UI\n");
      out.write("                 */\n");
      out.write("                // testLocalStorageData();\n");
      out.write("                // Load profile if it exits\n");
      out.write("                loadProfile();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * Function that gets the data of the profile in case\n");
      out.write("             * thar it has already saved in localstorage. Only the\n");
      out.write("             * UI will be update in case that all data is available\n");
      out.write("             *\n");
      out.write("             * A not existing key in localstorage return null\n");
      out.write("             *\n");
      out.write("             */\n");
      out.write("            function getLocalProfile(callback) {\n");
      out.write("                var profileImgSrc = localStorage.getItem(\"PROFILE_IMG_SRC\");\n");
      out.write("                var profileName = localStorage.getItem(\"PROFILE_NAME\");\n");
      out.write("                var profileReAuthEmail = localStorage.getItem(\"PROFILE_REAUTH_EMAIL\");\n");
      out.write("\n");
      out.write("                if (profileName !== null\n");
      out.write("                        && profileReAuthEmail !== null\n");
      out.write("                        && profileImgSrc !== null) {\n");
      out.write("                    callback(profileImgSrc, profileName, profileReAuthEmail);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * Main function that load the profile if exists\n");
      out.write("             * in localstorage\n");
      out.write("             */\n");
      out.write("            function loadProfile() {\n");
      out.write("                if (!supportsHTML5Storage()) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                // we have to provide to the callback the basic\n");
      out.write("                // information to set the profile\n");
      out.write("                getLocalProfile(function (profileImgSrc, profileName, profileReAuthEmail) {\n");
      out.write("                    //changes in the UI\n");
      out.write("                    $(\"#profile-img\").attr(\"src\", profileImgSrc);\n");
      out.write("                    $(\"#profile-name\").html(profileName);\n");
      out.write("                    $(\"#reauth-email\").html(profileReAuthEmail);\n");
      out.write("                    $(\"#inputEmail\").hide();\n");
      out.write("                    $(\"#remember\").hide();\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * function that checks if the browser supports HTML5\n");
      out.write("             * local storage\n");
      out.write("             *\n");
      out.write("             * @returns {boolean}\n");
      out.write("             */\n");
      out.write("            function supportsHTML5Storage() {\n");
      out.write("                try {\n");
      out.write("                    return 'localStorage' in window && window['localStorage'] !== null;\n");
      out.write("                } catch (e) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * Test data. This data will be safe by the web app\n");
      out.write("             * in the first successful login of a auth user.\n");
      out.write("             * To Test the scripts, delete the localstorage data\n");
      out.write("             * and comment this call.\n");
      out.write("             *\n");
      out.write("             * @returns {boolean}\n");
      out.write("             */\n");
      out.write("            function testLocalStorageData() {\n");
      out.write("                if (!supportsHTML5Storage()) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                localStorage.setItem(\"PROFILE_IMG_SRC\", \"//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120\");\n");
      out.write("                localStorage.setItem(\"PROFILE_NAME\", \"César Izquierdo Tello\");\n");
      out.write("                localStorage.setItem(\"PROFILE_REAUTH_EMAIL\", \"oneaccount@gmail.com\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-container\">\n");
      out.write("                <!-- <img class=\"profile-img-card\" src=\"//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120\" alt=\"\" /> -->\n");
      out.write("                <img id=\"profile-img\" class=\"profile-img-card\" src=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\" />\n");
      out.write("                <p id=\"profile-name\" class=\"profile-name-card\"></p>\n");
      out.write("                <form action=\"../Login\" method=\"post\" class=\"form-signin\">\n");
      out.write("                    <span id=\"reauth-email\" class=\"reauth-email\"></span>\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(request.getAttribute("error") != null);
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"alert alert-danger alert-dismissible fade in\" role=\"alert\"> \n");
          out.write("                            <strong>");
          out.print(request.getAttribute("error").toString() );
          out.write("</strong>\n");
          out.write("                        </div>\n");
          out.write("                    ");
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
      out.write("                    <input type=\"email\" id=\"inputEmail\" name=\"email\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("                    <input type=\"password\" id=\"inputPassword\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block btn-signin\" name=\"login\" type=\"submit\">Sign in</button>\n");
      out.write("                </form><!-- /form -->\n");
      out.write("                <a href=\"#\" class=\"forgot-password\">\n");
      out.write("                    Forgot the password?\n");
      out.write("                </a>\n");
      out.write("            </div><!-- /card-container -->\n");
      out.write("        </div><!-- /container -->\n");
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
