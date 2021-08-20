package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object RegisterMovie {
  def getMovieNamePage: ChainBuilder = {
    exec(http("Get movie name page")
      .get("/movie-name/")
      .check(status.is(200))
    )
  }

  def submitMovieName: ChainBuilder = {
    exec(http("Submit movie name")
      .post("/movie-name/")
      .formParam("name", "TestName")
      .check(status.is(200))
    )
  }
}
