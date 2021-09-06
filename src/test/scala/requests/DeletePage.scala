package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object DeletePage {
  def getDeleteAreYouSurePage: ChainBuilder = {
    exec(http("get delete are you sure page")
      .get("http://localhost:9001/capmovie/delete/MOV0001")
      .check(status.is(200)))
  }

  def getDeleteConfirmation: ChainBuilder = {
    exec(http("get delete confirmation")
      .get("http://localhost:9001/capmovie/delete/confirmed/MOV0001")
      .check(status.is(200)))
  }
}
