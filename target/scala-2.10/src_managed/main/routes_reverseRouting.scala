// @SOURCE:C:/playy/trello/conf/routes
// @HASH:a84e90d8ee60ad1754914bd63ed366fcdcbd8b5b
// @DATE:Thu Dec 04 16:54:35 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete(task:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                

// @LINE:34
def renameFolder(project:Long, folder:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                

// @LINE:32
def addFolder(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks/folder")
}
                                                

// @LINE:33
def deleteFolder(project:Long, folder:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                

// @LINE:29
def update(task:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                

// @LINE:27
def index(project:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks")
}
                                                

// @LINE:28
def add(project:Long, folder:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                
    
}
                          

// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:21
def rename(project:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                

// @LINE:23
def addUser(project:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/team")
}
                                                

// @LINE:14
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projects")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:37
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.delete",
   """
      function(task) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                        

// @LINE:34
def renameFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.renameFolder",
   """
      function(project,folder) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        

// @LINE:32
def addFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.addFolder",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/folder"})
      }
   """
)
                        

// @LINE:33
def deleteFolder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.deleteFolder",
   """
      function(project,folder) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        

// @LINE:29
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.update",
   """
      function(task) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                        

// @LINE:27
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.index",
   """
      function(project) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks"})
      }
   """
)
                        

// @LINE:28
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.add",
   """
      function(project,folder) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:21
def rename : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.rename",
   """
      function(project) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                        

// @LINE:23
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.addUser",
   """
      function(project) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/team"})
      }
   """
)
                        

// @LINE:14
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:37
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    

// @LINE:30
def delete(task:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """tasks/$task<[^/]+>""")
)
                      

// @LINE:34
def renameFolder(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String]), "PUT", """""", _prefix + """project/$project<[^/]+>/tasks/folder""")
)
                      

// @LINE:32
def addFolder(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.addFolder(), HandlerDef(this, "controllers.Tasks", "addFolder", Seq(), "POST", """""", _prefix + """tasks/folder""")
)
                      

// @LINE:33
def deleteFolder(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """projects/$project<[^/]+>/tasks/folder""")
)
                      

// @LINE:29
def update(task:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """tasks/$task<[^/]+>""")
)
                      

// @LINE:27
def index(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long]), "GET", """ Tasks""", _prefix + """projects/$project<[^/]+>/tasks""")
)
                      

// @LINE:28
def add(project:Long, folder:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """projects/$project<[^/]+>/tasks""")
)
                      
    
}
                          

// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:6
class ReverseProjects {
    

// @LINE:21
def rename(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]), "PUT", """DELETE  /projects/:project                  controllers.Projects.delete(project: Long)""", _prefix + """projects/$project<[^/]+>""")
)
                      

// @LINE:23
def addUser(project:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long]), "POST", """""", _prefix + """projects/$project<[^/]+>/team""")
)
                      

// @LINE:14
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Seq(), "POST", """ Projects""", _prefix + """projects""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Seq(), "GET", """ The home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /public path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:37
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          
}
        
    