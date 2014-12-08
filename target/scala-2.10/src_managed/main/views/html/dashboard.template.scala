
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],List[Task],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], todoTasks: List[Task], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main(projects, user)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    
    <article  class="tasks">
        """),_display_(Seq[Any](/*6.10*/todoTasks/*6.19*/.groupBy(_.project).map/*6.42*/ {/*7.13*/case (project, tasks) =>/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""
                <div class="folder" data-folder-id=""""),_display_(Seq[Any](/*8.54*/project/*8.61*/.id)),format.raw/*8.64*/("""">
                    <header>
                        <h3><a href="#"""),_display_(Seq[Any](/*10.40*/routes/*10.46*/.Tasks.index(project.id))),format.raw/*10.70*/("""">"""),_display_(Seq[Any](/*10.73*/project/*10.80*/.name)),format.raw/*10.85*/("""</a></h3>
                        <span class="loader">Loading</span>
                    </header>
                    <ul class="list">
                        """),_display_(Seq[Any](/*14.26*/tasks/*14.31*/.map/*14.35*/ { task =>_display_(Seq[Any](format.raw/*14.45*/("""
                            """),_display_(Seq[Any](/*15.30*/views/*15.35*/.html.tasks.item(task, isEditable = false))),format.raw/*15.77*/("""
                        """)))})),format.raw/*16.26*/("""
                    </ul>
                </div>
            """)))}})),format.raw/*20.10*/("""
    </article>
    
""")))})),format.raw/*23.2*/("""

"""))}
    }
    
    def render(projects:List[Project],todoTasks:List[Task],user:User): play.api.templates.HtmlFormat.Appendable = apply(projects,todoTasks,user)
    
    def f:((List[Project],List[Task],User) => play.api.templates.HtmlFormat.Appendable) = (projects,todoTasks,user) => apply(projects,todoTasks,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/dashboard.scala.html
                    HASH: 86888c11dd34810e5c9315c2f280de52690ab4fc
                    MATRIX: 801->1|955->61|992->64|1020->84|1058->85|1137->129|1154->138|1185->161|1195->176|1227->200|1266->202|1355->256|1370->263|1394->266|1501->337|1516->343|1562->367|1601->370|1617->377|1644->382|1843->545|1857->550|1870->554|1918->564|1984->594|1998->599|2062->641|2120->667|2216->740|2269->762
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|37->10|37->10|37->10|37->10|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|46->20|49->23
                    -- GENERATED --
                */
            