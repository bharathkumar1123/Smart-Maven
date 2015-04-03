package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login</title>\n");
      out.write("<style>\n");
      out.write("    *{ FONT-SIZE: 20pt; FONT-FAMILY: verdana; }\n");
      out.write("    b { FONT-WEIGHT: bold; }\n");
      out.write("    .listtitle { BACKGROUND: #425984; COLOR: #EEEEEE; white-space: nowrap; }\n");
      out.write("    td.list { BACKGROUND: #EEEEEE; white-space: nowrap; }\n");
      out.write("    ul {white-space: nowrap;}\n");
      out.write("    ul, li {list-style: none; display: inline;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<ul>\n");
      out.write("\t\t\t\t<li><img style=\"PADDING-LEFT: 150px\" src=\"log.png\" alt=\"\"></li>\n");
      out.write("\t\t\t\t<li><img  src=\"logo.png\" alt=\"\"></li>\n");
      out.write("</ul><br /><br />\n");
      out.write("\n");
      out.write("<table cellspacing=1 cellpadding=5>\n");
      out.write("<tr>\n");
      out.write("    <td class=listtitle colspan=2>Admin Login</td>\n");
      out.write("</tr>\n");
      out.write("<form action=\"login\" method=\"POST\" name=\"form\">\n");
      out.write("<input type=hidden name=referer value=\"/\">\n");
      out.write("<input type=hidden name=FAIL_URL value=\"http://www.yourdomain.com/login_failed.html\">\n");
      out.write("<input type=hidden name=LOGOUT_URL value=\"http://www.yourdomain.com/logged_out.html\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td class=list align=right>Username:</td><td class=list><input type=text name=username></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td class=list align=right>Password:</td><td class=list><input type=password name=password></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td class=listtitle align=right colspan=2><input type=submit value='Login'></td>\n");
      out.write("</tr>\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("</center>\n");
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
