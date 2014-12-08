
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>boards</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/main.css"))),format.raw/*7.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Projects.index)),format.raw/*17.44*/("""">Boards</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*19.22*/user/*19.26*/.name)),format.raw/*19.31*/(""" <span>("""),_display_(Seq[Any](/*19.40*/user/*19.44*/.email)),format.raw/*19.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*21.31*/routes/*21.37*/.Application.logout())),format.raw/*21.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
      
        <section id="main">

               <ul id="projects">
                        """),_display_(Seq[Any](/*29.26*/views/*29.31*/.html.projects.group(projects))),format.raw/*29.61*/("""
   
                </ul>
            
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.HtmlFormat.Appendable = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/main.scala.html
                    HASH: 9324034c959ae91f9ee34d692d202dbd930a4aab
                    MATRIX: 790->1|933->50|1076->158|1090->164|1143->196|1250->268|1264->274|1320->308|1403->356|1417->362|1479->403|1571->460|1585->466|1652->512|1745->569|1760->575|1825->618|1918->675|1933->681|1996->722|2089->779|2104->785|2159->818|2252->875|2267->881|2318->910|2428->984|2443->990|2480->1005|2577->1066|2590->1070|2617->1075|2662->1084|2675->1088|2703->1094|2804->1159|2819->1165|2862->1186|3064->1352|3078->1357|3130->1387
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|57->29|57->29|57->29
                    -- GENERATED --
                */
            