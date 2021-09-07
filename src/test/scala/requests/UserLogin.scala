package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object UserLogin {
  def getLogin: ChainBuilder = {
    exec(http("Get Login Page")
      .get("/login")
      .check(status.is(200))
    )
  }

  def submitLogin: ChainBuilder = {
    exec(http("Submit login details")
      .post("/login")
      .formParam("id", "USER0001")
      .formParam("password", "PASS")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }
}
