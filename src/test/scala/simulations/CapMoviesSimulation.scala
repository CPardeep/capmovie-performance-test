package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import requests.{HomePage, RegisterMovie}

class CapMoviesSimulation extends Simulation{

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:9000/capmovie")
    .inferHtmlResources()

  val scn: ScenarioBuilder = scenario("RegisterMovieSimulation")
    .exec(RegisterMovie.getMovieTitlePage)
    .exec(RegisterMovie.submitMovieTitle)
    .exec(RegisterMovie.getMoviePosterPage)
    .exec(RegisterMovie.submitMoviePoster)
    .exec(RegisterMovie.getMoviePlot)
    .exec(RegisterMovie.submitMoviePlot)
    .exec(HomePage.getHomePage)

  val RegisterMovieSimulation: SetUp =
    setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

}
