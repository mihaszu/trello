
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
object folder extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(folder: String, tasks: List[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<div class="folder" data-folder-id=""""),_display_(Seq[Any](/*3.38*/folder)),format.raw/*3.44*/("""">
    <header>
 		<h3>"""),_display_(Seq[Any](/*5.9*/folder)),format.raw/*5.15*/("""</h3>
        <dl class="options">
            <dt>Options</dt>
            <dd>
            <a class="deleteAllTasks" href="#">Remove all tasks</a>
                <a class="deleteFolder" href="#">Delete folder</a>
            </dd>
        </dl>

    </header>
    <ul class="list">
        """),_display_(Seq[Any](/*16.10*/tasks/*16.15*/.map/*16.19*/ { task =>_display_(Seq[Any](format.raw/*16.29*/("""
            """),_display_(Seq[Any](/*17.14*/views/*17.19*/.html.tasks.item( task ))),format.raw/*17.43*/("""
        """)))})),format.raw/*18.10*/("""
    </ul>
    <form class="addTask">
        <input type="hidden" name="folder" value=""""),_display_(Seq[Any](/*21.52*/folder)),format.raw/*21.58*/("""" />
        <input type="text" name="taskBody" placeholder="New task..." />
        <input type="text" name="dueDate" class="dueDate" placeholder="Due date: mm/dd/yy" />
        <input type="text" name="description" class="description" placeholder="description" />
        <div class="assignedTo">
            <input type="text" name="assignedTo" placeholder="Assign to..." />
        </div>
        <input type="submit" />
    </form>
</div>

"""))}
    }
    
    def render(folder:String,tasks:List[Task]): play.api.templates.HtmlFormat.Appendable = apply(folder,tasks)
    
    def f:((String,List[Task]) => play.api.templates.HtmlFormat.Appendable) = (folder,tasks) => apply(folder,tasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/tasks/folder.scala.html
                    HASH: a7ef6fb56200d19e830a02340aada8cddb206b9c
                    MATRIX: 792->1|921->36|995->75|1022->81|1080->105|1107->111|1437->405|1451->410|1464->414|1512->424|1562->438|1576->443|1622->467|1664->477|1789->566|1817->572
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|49->21|49->21
                    -- GENERATED --
                */
            