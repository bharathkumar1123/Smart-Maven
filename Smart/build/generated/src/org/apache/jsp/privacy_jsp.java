package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class privacy_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Privacy</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name = \"format-detection\" content = \"telephone=no\" />\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"booking/css/booking.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/camera.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery-migrate-1.2.1.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/script.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/superfish.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.ui.totop.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.equalheights.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.mobilemenu.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/camera.js\"></script>\r\n");
      out.write("\t\t<!--[if (gt IE 9)|!(IE)]><!-->\r\n");
      out.write("\t\t<script src=\"js/jquery.mobile.customized.min.js\"></script>\r\n");
      out.write("\t\t<!--<![endif]-->\r\n");
      out.write("\t\t<script src=\"booking/js/booking.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\tjQuery('#camera_wrap').camera({\r\n");
      out.write("\t\t\t\t\tloader: false,\r\n");
      out.write("\t\t\t\t\tpagination: false ,\r\n");
      out.write("\t\t\t\t\tminHeight: '444',\r\n");
      out.write("\t\t\t\t\tthumbnails: false,\r\n");
      out.write("\t\t\t\t\theight: '28.28125%',\r\n");
      out.write("\t\t\t\t\tcaption: true,\r\n");
      out.write("\t\t\t\t\tnavigation: true,\r\n");
      out.write("\t\t\t\t\tfx: 'mosaic'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!--[if lt IE 8]>\r\n");
      out.write("\t\t\t<div style=' clear: both; text-align:center; position: relative;'>\r\n");
      out.write("\t\t\t\t<a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\r\n");
      out.write("\t\t\t\t\t<img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<![endif]-->\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t<script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"page1\" id=\"top\">\r\n");
      out.write("\t\t<div class=\"main\">\r\n");
      out.write("<!--==============================header=================================-->\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t\t<div class=\"menu_block \">\r\n");
      out.write("\t\t\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<center><ul class=\"sf-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"afterlogin.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"download.jsp\">Download</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"current\"><a href=\"privacy.jsp\">Privacy</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></center>\r\n");
      out.write("\t\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div> ");
 session=request.getSession(false);
                                                                        String a="";
		if(session!=null){
		a=(String)session.getAttribute("name");
		out.print("<style>h4 {text-align: right;}</style>");
		out.print("<h4><b>You have logged in as, "+a+"</h4>");
		}
		else{
			out.print("Please login first");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"afterlogin.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t    <ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img style=\"PADDING-LEFT: 150px\" src=\"images/log.png\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img  src=\"images/logo.png\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            <div class=\"container_12\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"maxheight\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"extra_wrapper\">Privacy policy\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                    This privacy policy has been compiled to better serve those who are concerned with how their 'Personally identifiable information' (PII) is being used online. PII, as used in US privacy law and information security, is information that can be used on its own or with other information to identify, contact, or locate a single person, or to identify an individual in context. Please read our privacy policy carefully to get a clear understanding of how we collect, use, protect or otherwise handle your Personally Identifiable Information in accordance with our website. \r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</header>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"c_phone\">\r\n");
      out.write("\t\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"Post Queries\"></div>\r\n");
      out.write("\t\t\t\t\t\t<span>Connect with us always!!!</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<!--==============================footer=================================-->\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"f_phone\"><span></span></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"socials\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"https://twitter.com/Smartstorerepo\" class=\"fa fa-twitter\"></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.facebook.com/people/Bharath-Shanmugam/100009309315852\" class=\"fa fa-facebook\"></a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(function (){\r\n");
      out.write("\t\t\t\t$('#bookingForm').bookingForm({\r\n");
      out.write("\t\t\t\t\townerEmail: '#'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t$('#bookingForm input, #bookingForm textarea').placeholder();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
