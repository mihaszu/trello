
package views.html.projects

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
object group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Project],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

<li data-group=""""),_display_(Seq[Any](/*3.18*/group)),format.raw/*3.23*/("""">
	
    <ul>
        """),_display_(Seq[Any](/*6.10*/projects/*6.18*/.map/*6.22*/ { project =>_display_(Seq[Any](format.raw/*6.35*/("""
            """),_display_(Seq[Any](/*7.14*/views/*7.19*/.html.projects.item(project))),format.raw/*7.47*/("""
        """)))})),format.raw/*8.10*/("""
    </ul>
    <button class="newProject">New board</button>
</li>
"""))}
    }
    
    def render(projects:List[Project]): play.api.templates.HtmlFormat.Appendable = apply(projects)
    
    def f:((List[Project]) => play.api.templates.HtmlFormat.Appendable) = (projects) => apply(projects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/projects/group.scala.html
                    HASH: c8d9b26a159e355cfed3d3959935bb31314702e6
                    MATRIX: 790->1|909->26|963->45|989->50|1047->73|1063->81|1075->85|1125->98|1174->112|1187->117|1236->145|1277->155
                    LINES: 26->1|29->1|31->3|31->3|34->6|34->6|34->6|34->6|35->7|35->7|35->7|36->8
                    -- GENERATED --
                */
            