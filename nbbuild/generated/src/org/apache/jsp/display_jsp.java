package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("<script src=\"js/barchart.js\"></script>\r\n");
      out.write("<script src=\"js/semantic.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.lightbox-0.5.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.lightbox-0.5.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/semantic.css\" />\r\n");
      out.write("<noscript>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style-wide.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/semantic.css\" />\r\n");
      out.write("</noscript>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function() {\r\n");
      out.write("    \t $('#gallery a').lightBox();\r\n");
      out.write("    });\r\n");
      out.write("    !function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=\"https://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");\r\n");
      out.write("\tfunction star(){\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t var param1 = parseInt(document.getElementById(\"posValue\").value); \r\n");
      out.write("\t\t var param2 = parseInt(document.getElementById(\"negValue\").value); \r\n");
      out.write("\t\t var param3 = parseInt(document.getElementById(\"heatValue\").value);\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t var starNum =  Math.round(parseInt(document.getElementById(\"scoreValue\").value-10)/10);\r\n");
      out.write("\t\t var tweets = document.getElementsByTagName('div');\r\n");
      out.write("\t\t var tweetsScore = document.getElementsByName('tweetValue');\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(starNum>=5){\r\n");
      out.write("\t\t\t starNum=5;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t document.getElementById('score').innerHTML='Rating: '+starNum;\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(starNum==5){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon active'; \r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   \t else if(starNum==4){\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon'; \r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   \t else if(starNum==3){\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon'; \r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   \t else if(starNum==2){\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon';  \r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   \t else if(starNum==1){\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon active';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon';  \r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   \telse{\r\n");
      out.write("\t   \t\tdocument.getElementById('star1').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star2').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star3').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star4').className='icon';\r\n");
      out.write("\t   \t\tdocument.getElementById('star5').className='icon'; \r\n");
      out.write("\t   \t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t for(var i=0;i<5;i++){\r\n");
      out.write("\t\t\t if(parseInt(tweetsScore[i].value)==0){\r\n");
      out.write("\t\t\t\t tweets[34+i].className=\"12u red ui message\";\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else if(parseInt(tweetsScore[i].value)==4){\r\n");
      out.write("\t\t\t\t tweets[34+i].className=\"12u green ui message\";\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"star()\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div id=\"header\" class=\"skel-panels-fixed\">\r\n");
      out.write("\t\t<div class=\"top\" >\r\n");
      out.write("\t\t\t<div style=\"text-align:center\"><a href=\"index.jsp\"><img src=\"images/banner2.jpg\" style=\"width:300px\"></img></a></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t<ul>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<li><div style=\"font-size:30px;text-align:center\">");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("</div></li>\r\n");
      out.write("\t\t\t\t<li><div style=\"font-size:18px;text-align:center\">");
      if (_jspx_meth_s_property_1(_jspx_page_context))
        return;
      out.write("</div></li>\r\n");
      out.write("\t\t\t\t<li><div style=\"text-align:center\"><a id=\"aaaa\" href=\"https://twitter.com/share?text=@GossipCar: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" score:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjectScore}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" heat:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjectHotLevel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"twitter-share-button\" data-lang=\"en\" >Tweet</a></div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Nav -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"#portfolio\" id=\"portfolio-link\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"skel-panels-ignoreHref\" ><span style=\"font-size:25px;font-color:black;\">Gallery&nbsp;&nbsp;<i class=\"photo icon\"></i></span></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#about\" id=\"about-link\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"skel-panels-ignoreHref\"><span style=\"font-size:25px;font-color:black\">Sentimental Analysis&nbsp;&nbsp;<i class=\"edit icon\"></i></span></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact\" id=\"contact-link\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"skel-panels-ignoreHref\"><span style=\"font-size:25px;font-color:black\">Hot Tweets&nbsp;&nbsp;<i class=\"twitter icon\"></i></span></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<div id=\"rating\" style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t<span style=\"color:#fff;font-size:25px\"  id=\"score\">Rating:</span><br/>\r\n");
      out.write("\t\t\t\t\t<div class=\"ui large star rating\" style=\"display:inline-block\">\r\n");
      out.write("\t\t\t\t\t  <i id=\"star1\" class=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t  <i id=\"star2\" class=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t  <i id=\"star3\" class=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t  <i id=\"star4\" class=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t  <i id=\"star5\" class=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<strong style=\"color:#fff\"></strong>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"scoreValue\" id=\"scoreValue\" value=\"");
      if (_jspx_meth_s_property_2(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<span style=\"color:#fff;font-size:25px\">Hot Level:&nbsp;");
      if (_jspx_meth_s_property_3(_jspx_page_context))
        return;
      out.write("</span><br/>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"heatValue\" id=\"heatValue\" value=\"");
      if (_jspx_meth_s_property_4(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<div style=\"margin-left:125px\" id=\"gaugechart_div\" style=\"height:100px;width:100px\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<!-- Portfolio -->\r\n");
      out.write("\t\t<section id=\"portfolio\" class=\"two\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t<span style=\"font-size:40px\">Gallery</span>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t<div id=\"gallery\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_5(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_6(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_7(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_8(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_9(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_10(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_11(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_12(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_13(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_14(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t\t<article class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=");
      if (_jspx_meth_s_property_15(_jspx_page_context))
        return;
      out.write(" class=\"image full\"><img src=");
      if (_jspx_meth_s_property_16(_jspx_page_context))
        return;
      out.write(" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p style=\"text-align:right\"><a href=\"#\">More...</a></p>\r\n");
      out.write("\t\t\t\t<p style=\"text-align:right\">*Source: Flickr</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Hot Tweets -->\r\n");
      out.write("\t\t<section id=\"about\" class=\"three\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t<span style=\"font-size:40px\">Sentimental Analysis</span>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ui two column grid\" style=\"display: block\" >\r\n");
      out.write("\t\t\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"column\">\r\n");
      out.write("\t\t\t\t\t      <div class=\"ui raised segment\" style=\"width:700px\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"ui red ribbon label\" style=\"font-size:20px\">Sentiment by Percent</div>\r\n");
      out.write("\t\t\t\t\t        \t<div id=\"piechart_div\" style=\"width:500px; height: 350px;\"></div>\r\n");
      out.write("\t\t\t\t\t        \t<input type=\"hidden\" name=\"negValue\" id=\"negValue\" value=\"");
      if (_jspx_meth_s_property_17(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"posValue\" id=\"posValue\" value=\"");
      if (_jspx_meth_s_property_18(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t       \t<div class=\"ui red ribbon label\" style=\"font-size:20px\">Sentiment by Count</div>\r\n");
      out.write("\t\t\t\t\t        \t<div id=\"barchart_div\" style=\"width:550px; height: 280px;margin-bottom:10px;\"></div>\t\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"column\" >\r\n");
      out.write("\t\t\t\t\t      <div class=\"ui raised segment\" style=\"margin-left:40px;width:700px\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"ui red ribbon label\" style=\"font-size:20px\">Heat Map</div>\r\n");
      out.write("\t\t\t\t\t        \t<div id=\"geochart_div\" style=\"margin-left:0px;margin-top:100px;margin-bottom:150px;height: 450px;\"></div>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Contact -->\r\n");
      out.write("\t\t<section id=\"contact\" class=\"four\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t<span style=\"font-size:40px\">Hot Tweets</span>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t<div class=\"ui two column grid\" style=\"display: block\" >\r\n");
      out.write("\t\t\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"column\">\r\n");
      out.write("\t\t\t\t\t      <div class=\"ui raised segment\" style=\"width:700px\">\r\n");
      out.write("\t\t\t\t\t      \t\t<span style=\"font-colr:#888;font-size:25px\"><i class=\"thumbs up large blue outline icon\"></i>Positive</span>\r\n");
      out.write("\t\t\t\t\t        \t");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"column\" >\r\n");
      out.write("\t\t\t\t\t      <div class=\"ui raised segment\" style=\"margin-left:40px;width:700px\">\r\n");
      out.write("\t\t\t\t\t      \t\t<span style=\"font-colr:#888;font-size:25px\"><i class=\"thumbs down large red outline icon\"></i>Negative</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_iterator_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t        \t\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p style=\"text-align:right\"><a href=\"#\">More...</a></p>\r\n");
      out.write("\t\t\t\t<p style=\"text-align:right\">*Source: Twitter</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Copyright -->\r\n");
      out.write("\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t<p>&copy; 2014 Seagull Consulting. <br/>All rights reserved.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("s1");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent(null);
    _jspx_th_s_property_1.setValue("s2");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent(null);
    _jspx_th_s_property_2.setValue("subjectScore");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent(null);
    _jspx_th_s_property_3.setValue("subjectHotLevel");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent(null);
    _jspx_th_s_property_4.setValue("subjectHotLevel");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_property_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent(null);
    _jspx_th_s_property_5.setValue("photoUrls[0]");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_property_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent(null);
    _jspx_th_s_property_6.setValue("photoUrls[0]");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_property_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent(null);
    _jspx_th_s_property_7.setValue("photoUrls[1]");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_property_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent(null);
    _jspx_th_s_property_8.setValue("photoUrls[1]");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_property_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent(null);
    _jspx_th_s_property_9.setValue("photoUrls[2]");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }

  private boolean _jspx_meth_s_property_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_10 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_10.setPageContext(_jspx_page_context);
    _jspx_th_s_property_10.setParent(null);
    _jspx_th_s_property_10.setValue("photoUrls[2]");
    int _jspx_eval_s_property_10 = _jspx_th_s_property_10.doStartTag();
    if (_jspx_th_s_property_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
    return false;
  }

  private boolean _jspx_meth_s_property_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_11 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_11.setPageContext(_jspx_page_context);
    _jspx_th_s_property_11.setParent(null);
    _jspx_th_s_property_11.setValue("photoUrls[3]");
    int _jspx_eval_s_property_11 = _jspx_th_s_property_11.doStartTag();
    if (_jspx_th_s_property_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
    return false;
  }

  private boolean _jspx_meth_s_property_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_12 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_12.setPageContext(_jspx_page_context);
    _jspx_th_s_property_12.setParent(null);
    _jspx_th_s_property_12.setValue("photoUrls[3]");
    int _jspx_eval_s_property_12 = _jspx_th_s_property_12.doStartTag();
    if (_jspx_th_s_property_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
    return false;
  }

  private boolean _jspx_meth_s_property_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_13 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_13.setPageContext(_jspx_page_context);
    _jspx_th_s_property_13.setParent(null);
    _jspx_th_s_property_13.setValue("photoUrls[4]");
    int _jspx_eval_s_property_13 = _jspx_th_s_property_13.doStartTag();
    if (_jspx_th_s_property_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
    return false;
  }

  private boolean _jspx_meth_s_property_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_14 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_14.setPageContext(_jspx_page_context);
    _jspx_th_s_property_14.setParent(null);
    _jspx_th_s_property_14.setValue("photoUrls[4]");
    int _jspx_eval_s_property_14 = _jspx_th_s_property_14.doStartTag();
    if (_jspx_th_s_property_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
    return false;
  }

  private boolean _jspx_meth_s_property_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_15 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_15.setPageContext(_jspx_page_context);
    _jspx_th_s_property_15.setParent(null);
    _jspx_th_s_property_15.setValue("photoUrls[5]");
    int _jspx_eval_s_property_15 = _jspx_th_s_property_15.doStartTag();
    if (_jspx_th_s_property_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
    return false;
  }

  private boolean _jspx_meth_s_property_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_16 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_16.setPageContext(_jspx_page_context);
    _jspx_th_s_property_16.setParent(null);
    _jspx_th_s_property_16.setValue("photoUrls[5]");
    int _jspx_eval_s_property_16 = _jspx_th_s_property_16.doStartTag();
    if (_jspx_th_s_property_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
    return false;
  }

  private boolean _jspx_meth_s_property_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_17 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_17.setPageContext(_jspx_page_context);
    _jspx_th_s_property_17.setParent(null);
    _jspx_th_s_property_17.setValue("attitudeSplit[0]");
    int _jspx_eval_s_property_17 = _jspx_th_s_property_17.doStartTag();
    if (_jspx_th_s_property_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
    return false;
  }

  private boolean _jspx_meth_s_property_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_18 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_18.setPageContext(_jspx_page_context);
    _jspx_th_s_property_18.setParent(null);
    _jspx_th_s_property_18.setValue("attitudeSplit[2]");
    int _jspx_eval_s_property_18 = _jspx_th_s_property_18.doStartTag();
    if (_jspx_th_s_property_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("top5GoodStatus");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"ui blue message\" style=\"font-size:22px\">");
        if (_jspx_meth_s_property_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_19 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_19.setPageContext(_jspx_page_context);
    _jspx_th_s_property_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_19.setValue("text");
    int _jspx_eval_s_property_19 = _jspx_th_s_property_19.doStartTag();
    if (_jspx_th_s_property_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent(null);
    _jspx_th_s_iterator_1.setValue("top5BadStatus");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"ui red message\" style=\"font-size:22px\">");
        if (_jspx_meth_s_property_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_1);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_1);
    return false;
  }

  private boolean _jspx_meth_s_property_20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_20 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_20.setPageContext(_jspx_page_context);
    _jspx_th_s_property_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_20.setValue("text");
    int _jspx_eval_s_property_20 = _jspx_th_s_property_20.doStartTag();
    if (_jspx_th_s_property_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
    return false;
  }
}
