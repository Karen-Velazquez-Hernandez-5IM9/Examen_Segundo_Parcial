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
      response.setContentType("text/html; charset=ISO-8859-1");
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

if(request.getParameter("registro") != null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("registro.jsp");
        return;
      }
      out.write("    \n");

  return;
}
else if(request.getParameter("login") != null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("jsp/login.jsp");
        return;
      }
      out.write("    \n");

  return;
}
else if(request.getParameter("invitado") != null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("jsp/invitado.jsp");
        return;
      }
      out.write("    \n");

  return;
}

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("  <head><title>Edusite Home</title></head>\n");
      out.write("  <body>\n");
      out.write("    <form action=\"index.jsp\">\n");
      out.write("        <input type=\"submit\" name=\"registro\" value=\"Crear Cuenta\">\n");
      out.write("        <input type=\"submit\" name=\"login\" value=\"Iniciar Sesion\">\n");
      out.write("        <input type=\"submit\" name=\"invitado\" value=\"Acceder como invitado\">\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
