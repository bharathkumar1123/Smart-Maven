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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]> <html class=\"lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7]> <html class=\"lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8]> <html class=\"lt-ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html lang=\"en\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("  <title>Sign up</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/superfish.css\">\n");
      out.write("  <!--[if lt IE 9]><script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\n");
      out.write("<script>\n");
      out.write("function validateForm() {\n");
      out.write("    var x = document.forms[\"myForm\"][\"email\"].value;\n");
      out.write("    var y = document.forms[\"myForm\"][\"password\"].value;\n");
      out.write("    var filter = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("\n");
      out.write("    if (!filter.test(x)) {\n");
      out.write("    alert('Enter valid Email Id!!');\n");
      out.write("    x.focus;\n");
      out.write("    return false;\n");
      out.write(" }   \n");
      out.write("    else if((x)==null || (x)== \"\")\n");
      out.write("    {\n");
      out.write("       alert(\"Enter Email id!!\");\n");
      out.write("       return false;\n");
      out.write("    }\n");
      out.write("    else if((y)==null || (y)== \"\")\n");
      out.write("    {\n");
      out.write("       alert(\"Enter Password!!\");\n");
      out.write("       return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("\t\t\t\t<div class=\"menu_block \">\n");
      out.write("\t\t\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><ul class=\"sf-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"current\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"help.jsp\">Help</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul><center>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img style=\"PADDING-LEFT: 200px\" src=\"images/log.png\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img  src=\"images/logo.png\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></a>\n");
      out.write("\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</header>\n");
      out.write("<center>\n");
      out.write("<br><br><h2>&nbsp &nbsp &nbsp &nbsp SIGN IN</h2>\n");
      out.write("  <form name=\"myForm\" method=\"post\" action=\"login\" class=\"login\" onsubmit=\"return validateForm();\">\n");
      out.write("    <p>\n");
      out.write("      <label for=\"login\">Email:</label>\n");
      out.write("      <input type=\"text\" name=\"email\" id=\"email\" >\n");
      out.write("      \n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("      <label for=\"password\">Key:</label>\n");
      out.write("      <input type=\"password\" name=\"password\" id=\"password\" >\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p class=\"login-submit\">\n");
      out.write("      <button type=\"submit\" class=\"login-button\">Login</button>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("   \n");
      out.write("  </form>\n");
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
