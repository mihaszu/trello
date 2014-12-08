
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Task,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(task: Task, isEditable: Boolean = true):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-task-id=""""),_display_(Seq[Any](/*3.20*/task/*3.24*/.id)),format.raw/*3.27*/("""">
    
    
    <h4>"""),_display_(Seq[Any](/*6.10*/task/*6.14*/.title)),format.raw/*6.20*/("""</h4>
    
   """),_display_(Seq[Any](/*8.5*/if(task.dueDate != null)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""
        <time datetime=""""),_display_(Seq[Any](/*9.26*/task/*9.30*/.dueDate)),format.raw/*9.38*/("""">"""),_display_(Seq[Any](/*9.41*/task/*9.45*/.dueDate.format("MMM dd yyyy"))),format.raw/*9.75*/("""</time>
    """)))})),format.raw/*10.6*/("""
    
    """),_display_(Seq[Any](/*12.6*/if(task.assignedTo != null && task.assignedTo.email != null)/*12.66*/ {_display_(Seq[Any](format.raw/*12.68*/("""
        <span class="assignedTo">"""),_display_(Seq[Any](/*13.35*/task/*13.39*/.assignedTo.email)),format.raw/*13.56*/("""</span>
    """)))})),format.raw/*14.6*/("""
    
    """),_display_(Seq[Any](/*16.6*/if(task.description!=null)/*16.32*/{_display_(Seq[Any](format.raw/*16.33*/("""
     	<span>"""),_display_(Seq[Any](/*17.14*/task/*17.18*/.description)),format.raw/*17.30*/("""</span>  
    """)))})),format.raw/*18.6*/("""
    
   
    
</li>
"""))}
    }
    
    def render(task:Task,isEditable:Boolean): play.api.templates.HtmlFormat.Appendable = apply(task,isEditable)
    
    def f:((Task,Boolean) => play.api.templates.HtmlFormat.Appendable) = (task,isEditable) => apply(task,isEditable)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:54:50 CET 2014
                    SOURCE: C:/playy/trello/app/views/tasks/item.scala.html
                    HASH: e0ec9c0c35e8137b3378901639eb0718118471ed
                    MATRIX: 785->1|919->41|975->62|987->66|1011->69|1068->91|1080->95|1107->101|1156->116|1188->140|1227->142|1288->168|1300->172|1329->180|1367->183|1379->187|1430->217|1474->230|1520->241|1589->301|1629->303|1700->338|1713->342|1752->359|1796->372|1842->383|1877->409|1916->410|1966->424|1979->428|2013->440|2059->455
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18
                    -- GENERATED --
                */
            