package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object MoviePage {
  def getMoviePage: ChainBuilder = {
    exec(http("Get movie page")
      .get("http://localhost:9001/capmovie/movie/MOV0001")
      .check(status.is(200)))
  }
}
