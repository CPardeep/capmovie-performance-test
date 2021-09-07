package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import requests._

class CapMoviesUserSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:9001/capmovie")
    .inferHtmlResources()

  val scn: ScenarioBuilder = scenario("CapMovieUserJourneySimulation")
    .exec(HomePage.getHomePage)
    .exec(UserLogin.getLogin)
    .exec(UserLogin.submitLogin)


  val CapMovieUserJourneySimulation: SetUp =
    setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

}
