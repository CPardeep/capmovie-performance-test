package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object StartPage {
  def getStartPage: ChainBuilder = {
    exec(http("Get start page")
      .get("http://localhost:9001/capmovie/start")
      .check(status.is(200))
    )
  }
}
