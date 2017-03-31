
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/fix3/dsad/conf/routes
// @DATE:Fri Mar 31 18:01:40 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
