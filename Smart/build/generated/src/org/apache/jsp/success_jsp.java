package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Help</title>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name = \"format-detection\" content = \"telephone=no\" />\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery-migrate-1.2.1.js\"></script>\n");
      out.write("\t\t<script src=\"js/script.js\"></script>\n");
      out.write("\t\t<script src=\"js/superfish.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.ui.totop.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.equalheights.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.mobilemenu.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t\t<script src=\"js/TMForm.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!--[if lt IE 8]>\n");
      out.write("\t\t\t<div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("\t\t\t\t<a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("\t\t\t\t\t<img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"js/html5shiv.js\"></script>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"\" id=\"top\">\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\t<div class=\"menu_block \">\n");
      out.write("\t\t\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><ul class=\"sf-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"current\"><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"help.jsp\">Help</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul></center>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img style=\"PADDING-LEFT: 150px\" src=\"images/log.png\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img  src=\"images/logo.png\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</header> <style> .displayed {\n");
      out.write("    display: block;\n");
      out.write("    margin-left: auto;\n");
      out.write("    margin-right: auto }p.padding {\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 300px;\n");
      out.write("    margin-top: 115px;\n");
      out.write("    font-size: 25px;} </style>\n");
      out.write("                       \n");
      out.write("                                            <p class=\"padding\">Registered Successfully!!!<br><br>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                      <a href=\"login.jsp\">click here to join us!!</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t <center>  <img  class=\"displayed\" src=\"images/success.png\" alt=\"\"></center>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"c_phone\">\n");
      out.write("\t\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"Post Queries\"></div>\n");
      out.write("\t\t\t\t\t\t<span>Connect with us always!!!</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<div class=\"container_12\">\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\n");
      out.write("\t\t\t\t\t<div class=\"f_phone\"><span></span></div>\n");
      out.write("\t\t\t\t\t<div class=\"socials\">\n");
      out.write("\t\t\t\t\t\t<a href=\"https://twitter.com/Smartstorerepo\" class=\"fa fa-twitter\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.facebook.com/people/Bharath-Shanmugam/100009309315852\" class=\"fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(function (){\n");
      out.write("\t\t\t\t$('#bookingForm').bookingForm({\n");
      out.write("\t\t\t\t\townerEmail: '#'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$('#bookingForm input, #bookingForm textarea').placeholder();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
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
