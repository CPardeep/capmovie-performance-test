package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object AgeRating {
  def getAgeRatingPage: ChainBuilder = {
    exec(http("Get age rating page")
      .get("/age-rating/false")
      .check(status.is(200))
    )
  }

  def submitAgeRating: ChainBuilder = {
    exec(http("Submit age rating")
      .post("/age-rating/false")
      .formParam("rated", "U")
      .check(status.is(200))
    )
  }


}
