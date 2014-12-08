
package views.html.tasks

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Project,List[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(project: Project, tasks: List[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""


<article  class="tasks" id="tasks">
    """),_display_(Seq[Any](/*5.6*/tasks/*5.11*/.groupBy(_.folder).map/*5.33*/ {/*6.9*/case (folder, tasks) =>/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
            """),_display_(Seq[Any](/*7.14*/views/*7.19*/.html.tasks.folder(folder, tasks))),format.raw/*7.52*/("""
        """)))}})),format.raw/*9.6*/("""
    <a href="#newFolder" class="new newFolder">add a list</a>
</article>

"""))}
    }
    
    def render(project:Project,tasks:List[Task]): play.api.templates.HtmlFormat.Appendable = apply(project,tasks)
    
    def f:((Project,List[Task]) => play.api.templates.HtmlFormat.Appendable) = (project,tasks) => apply(project,tasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/tasks/index.scala.html
                    HASH: 005ffcf2237e4852985a8f878753d3a3d968621f
                    MATRIX: 792->1|923->38|1001->82|1014->87|1044->109|1053->120|1084->143|1123->145|1172->159|1185->164|1239->197|1280->213
                    LINES: 26->1|29->1|33->5|33->5|33->5|33->6|33->6|33->6|34->7|34->7|34->7|35->9
                    -- GENERATED --
                */
            