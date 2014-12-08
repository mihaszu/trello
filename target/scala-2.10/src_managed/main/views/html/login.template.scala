
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>login</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        """),_display_(Seq[Any](/*11.10*/helper/*11.16*/.form(routes.Application.authenticate)/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*15.14*/if(form.hasGlobalErrors)/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*17.22*/form/*17.26*/.globalError.message)),format.raw/*17.46*/("""
                </p>
            """)))})),format.raw/*19.14*/("""
            
            """),_display_(Seq[Any](/*21.14*/if(flash.contains("success"))/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*23.22*/flash/*23.27*/.get("success"))),format.raw/*23.42*/("""
                </p>
            """)))})),format.raw/*25.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*28.78*/form("email")/*28.91*/.value)),format.raw/*28.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))})),format.raw/*37.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/login.scala.html
                    HASH: 1f6f1459530e9cc6611dc213549eab521d649c4a
                    MATRIX: 791->1|916->32|1058->139|1072->145|1125->177|1232->249|1246->255|1303->290|1383->334|1398->340|1445->378|1485->380|1590->449|1623->473|1663->475|1756->532|1769->536|1811->556|1878->591|1941->618|1979->647|2019->649|2113->707|2127->712|2164->727|2231->762|2374->869|2396->882|2424->888|2696->1128
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|39->11|39->11|43->15|43->15|43->15|45->17|45->17|45->17|47->19|49->21|49->21|49->21|51->23|51->23|51->23|53->25|56->28|56->28|56->28|65->37
                    -- GENERATED --
                */
            