package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-compatible\" content = \"IE-edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel =\"stylesheet\" type =\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <script src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type = text/javascript src=\"bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Bakery Shop</title>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("  /* Make the image fully responsive */\n");
      out.write("  .carousel-inner img {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 400px;\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   \n");
      out.write(" \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style = \"background-color: #DEDEDE\">\n");
      out.write("        <!-- Start Nagigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-sm navbar-dark bg-danger pl-5 fixed-top\">\n");
      out.write("    <a href=\"index.jsp\" class=\"navbar-brand\">Online Bakery Shop</a>\n");
      out.write("    <span class=\"navbar-text\">Cheap And Best</span>\n");
      out.write("    <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#myMenu\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myMenu\">\n");
      out.write("      <ul class=\"navbar-nav pl-5 custom-nav\">\n");
      out.write("        <li class=\"nav-item\"><a href=\"index.jsp\" class=\"nav-link\">Home</a></li>\n");
      out.write("        <li class=\"nav-item\"><a href=\"login.jsp\" class=\"nav-link\">Login</a></li>\n");
      out.write("        <li class=\"nav-item\"><a href=\"team.html\" class=\"nav-link\">Team</a></li>\n");
      out.write("        <li class=\"nav-item\"><a href=\"contact.jsp\" class=\"nav-link\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav> <!-- End Navigation -->\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"3\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"4\"></li>\n");
      out.write("  </ul>\n");
      out.write("  \n");
      out.write("  <!-- The slideshow -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"myimages/1.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"myimages/2.jpg\" alt=\"Chicago\" width=\"1100\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"myimages/3.jpg\" alt=\"New York\" width=\"1100\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img src=\"myimages/4.jpg\" alt=\"New York\" width=\"1100\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img src=\"myimages/5.jpg\" alt=\"New York\" width=\"1100\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"container\" style = \"margin-top : 60px\">\n");
      out.write("      <div class = row>\n");
      out.write("          <div class = col-sm-3>\n");
      out.write("  \n");
      out.write("  <h2 class = text-center style = \"font-family : Monotype Corsiva ; color : red\">Breads</h2>          \n");
      out.write("  <a href = \"giftbycategory.jsp?category=b\"><img src=\"myimages/breads.jpg\" class=\"img-thumbnail\" alt=\"Breads\" style = \"width:304px; height : 236px\"> </a>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <div class = col-sm-3>\n");
      out.write("  <h2 class = text-center style = \"font-family : Monotype Corsiva ; color : red\">Cakes</h2>          \n");
      out.write("  <a href = \"giftbycategory.jsp?category=c\"><img src=\"myimages/cakes.jpg\" class=\"img-thumbnail\" alt=\"Cakes\" style = \"width:304px; height : 236px\"> </a>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("                  <div class = col-sm-3>\n");
      out.write("  <h2 class = text-center style = \"font-family : Monotype Corsiva ; color : red\">Pastries</h2>          \n");
      out.write("  <a href = \"giftbycategory.jsp?category=p\"><img src=\"myimages/pastries.jpg\" class=\"img-thumbnail\" alt=\"Pastries\" style = \"width:304px; height : 236px\"> </a>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("          <div class = col-sm-3>\n");
      out.write("  <h2 class = text-center style = \"font-family : Monotype Corsiva ; color : red\">Cookies</h2>          \n");
      out.write("  <a href = \"giftbycategory.jsp?category=coo\"><img src=\"myimages/cookies.jpg\" class=\"img-thumbnail\" alt=\"cookies\" style = \"width:304px; height : 236px\"> </a>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("          \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
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
