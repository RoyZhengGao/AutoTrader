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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Gossip Car</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/skel.min.js\"></script>\r\n");
      out.write("<script src=\"js/skel-panels.min.js\"></script>\r\n");
      out.write("<script src=\"js/init.js\"></script>\r\n");
      out.write("<script src=\"js/select-car.js\"></script>\r\n");
      out.write("<script src=\"js/nprogress.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.fittext.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.lettering.js\"></script>\r\n");
      out.write("<script src=\"js/title.js\"></script>\r\n");
      out.write("<script src=\"http://yandex.st/highlightjs/7.3/highlight.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.textillate.js\"></script>\r\n");
      out.write("<script src=\"js/power-slider.js\"></script>\r\n");
      out.write("<script>hljs.initHighlightingOnLoad();</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){  \r\n");
      out.write("        $(\"#slider\").powerSlider({handle:\"left\"});\r\n");
      out.write("        $(\".code h3 span\").each(function(i){\r\n");
      out.write("        \t$(this).click(function(){\r\n");
      out.write("        \t\t$(this).addClass(\"active\").siblings().removeClass(\"active\");\r\n");
      out.write("        \t\t$(\".code pre\").eq(i).show().siblings(\"pre\").hide();\r\n");
      out.write("        \t})\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/semantic.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/nprogress.css\" />\r\n");
      out.write("<link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/dark.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style1.css\" rel=\"stylesheet\">\r\n");
      out.write("<link >\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.demolist{font-size: 0; *word-spacing: -1px;}\r\n");
      out.write("\t.demolist li{display: inline-block; font-size:14px; border:1px solid #eee; padding:10px; margin-right:10px; *display:inline; *zoom:1; word-spacing: normal; letter-spacing: normal; vertical-align: top;}\r\n");
      out.write("\t.active{background:#eee;}\r\n");
      out.write("\t.hidden{display: none;}\r\n");
      out.write("\t.code{padding:0px;}\r\n");
      out.write("\t.code h3 span{border:1px solid #ddd; margin-left:-1px; padding:10px;display:inline-block; cursor:pointer;}\r\n");
      out.write("\tpre{background:#eee; padding:10px;}\r\n");
      out.write("\t.menu{width:100%; background:#ECECEC; position:fixed; _position:absolute; top:0; left:0; z-index:3;}\r\n");
      out.write("\t.menu ul{width:600px; margin:0 auto;}\r\n");
      out.write("\t.menu ul li{float:left; margin-right:10px; padding:2px 6px;}\r\n");
      out.write("\t.menu ul li.active{background: #fff;}\r\n");
      out.write("\t.menu ul li a{line-height:32px; padding:0 4px;}\r\n");
      out.write("\t.content{ margin:0px;}\r\n");
      out.write("\r\n");
      out.write("\t.slider{height:1080px; width:1920px; margin:20px auto; overflow:hidden; position:relative;}\r\n");
      out.write("\t.sliderbox{position:relative;}\r\n");
      out.write("\t.slidernav{position:absolute; right:4px; bottom:5px; z-index:1;}\r\n");
      out.write("\t.slidernav li{float:left; width:24px;}\r\n");
      out.write("\t.slidernav li a{width:16px; padding:2px 4px; height:12px; background:#fff; color:#000; text-align:center;}\r\n");
      out.write("\t.slidernav li.current a{background:#3B8DD1; color:#fff;}\r\n");
      out.write("\t.slidertext{background:#000; background:rgba(0,0,0,0.6); filter:alpha(opacity=60); position:absolute; left:0; bottom:0; width:100%;}\r\n");
      out.write("\t.slidertext li{display:none; padding-left:20px;}\r\n");
      out.write("\t.slidertext li a{text-align:left; line-height: 30px; height: 30px; color: #fff;}\r\n");
      out.write("\t.slider .prev, .slider .next{position: absolute; top:50%; margin-top:-30px; cursor: pointer; width:61px; height:61px; left:0; background: url(images/ft_icons.png) 0 0 no-repeat;}\r\n");
      out.write("\t.slider .next{right:0; left:auto; background-position: 0 -61px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<noscript>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style-wide.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/semantic.css\" />\r\n");
      out.write("</noscript>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"code\">\r\n");
      out.write("\t\t<pre class=\"hidden\">.slider{height:170px; margin:20px auto; overflow:hidden; position:relative;}\r\n");
      out.write(".sliderbox{position:relative;}\r\n");
      out.write("\t\t</pre>\r\n");
      out.write("\t\t<pre class=\"hidden\">$(\"#slider\").powerSlider({handle:\"left\"});\r\n");
      out.write("\t\t</pre>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form name=\"frm\" action=\"mainaction_excuteSearch\" method=\"post\">\r\n");
      out.write("\t\t\t<div style=\"width:1200px;margin:0 auto;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"decal\" style=\"background:rgba(255,255,255,0)\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"jumbotron\" style=\"padding-top:0px;padding-bottom:10px;background:rgba(255,255,255,0);\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\" style=\" padding-top:0px;padding-bottom:0px;background:rgba(255,255,255,0)\">\r\n");
      out.write("\t\t\t\t  \t\t  <h1 class=\"glow in tlt\">Gossip Car</h1>\r\n");
      out.write("\t\t\t\t  \t\t  <p class=\"tlt\" data-in-effect=\"bounceInDown\">\r\n");
      out.write("\t\t\t\t  \t\t  \tUnderstanding cars through social media\r\n");
      out.write("\t\t\t\t  \t\t  </p>\r\n");
      out.write("\t\t\t  \t\t\t</div>\r\n");
      out.write("\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t  \t\t\r\n");
      out.write("\t\t\t  \t\t\r\n");
      out.write("\t\t\t  \t\t<div class=\"main\" style=\"position:absolute;left:0px; top:0px;z-index:-9999\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"slider\" id=\"slider\" >\r\n");
      out.write("\t\t\t\t\t<ul class=\"sliderbox\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><img src=\"images/slider21.jpg\" alt=\"1\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><img src=\"images/slider22.jpg\" alt=\"2\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><img src=\"images/slider23.jpg\" alt=\"3\"></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ui two column grid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ui fluid form segment\" style=\"background:rgba(255,255,255,0.2)\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"alt\" style=\"font-size: 40px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\tFind <strong>cars</strong> you like:<br />\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<br /> <select onchange=changeselect1(this.value) name=s1\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 350px;margin:0 auto;font-size:25px;font-family:'Source Sans Pro', sans-serif;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected>==Choose Makes==</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Acura'>Acura</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Audi'>Audi</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='BMW'>BMW</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Buick'>Buick</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Cadillac'>Cadillac</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Chevrolet'>Chevrolet</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Chrysler'>Chrysler</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Dodge'>Dodge</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Ferrari'>Ferrari</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Ford'>Ford</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='GMC'>GMC</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Honda'>Honda</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Infiniti'>Infiniti</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Jeep'>Jeep</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Lamborghini'>Lamborghini</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Land Rover'>Land Rover</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Lexus'>Lexus</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Lincoln'>Lincoln</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Mercedes-Benz'>Mercedes-Benz</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='MINI'>MINI</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Mitsubishi'>Mitsubishi</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Nissan'>Nissan</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Porsche'>Porsche</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Subaru'>Subaru</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Tesla'>Tesla</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Toyota'>Toyota</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Volkswagen'>Volkswagen</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value='Volvo'>Volvo</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<select name=s2\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 350px;margin:0 auto;font-size:25px;font-family:'Source Sans Pro', sans-serif;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected style=\"font-family:'Source Sans Pro', sans-serif;\">==Choose Models==</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"button scrolly\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 60px; margin-bottom: 40px; padding:0\" onclick=\"loading()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 style=\"color: #fff;font-size:25px\">Search</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ui fluid form segment\"  style=\"background:rgba(255,255,255,0.2)\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"alt\" style=\"font-size: 40px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Models</strong> you may consider:\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align:center;margin-bottom:20px;padding-top:0px\" id=\"box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/tagcloud.jpg\" style=\"width:450px;height:300px;margin-left:0;margin-top:0px\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
