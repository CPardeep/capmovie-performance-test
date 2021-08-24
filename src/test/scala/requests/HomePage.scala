package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object HomePage {
  def getHomePage: ChainBuilder = {
    exec(http("Get home page")
      .get("/home")
      .check(status.is(200))
    )
  }
}
