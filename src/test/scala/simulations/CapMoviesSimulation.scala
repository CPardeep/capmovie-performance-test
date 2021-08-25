package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import requests.{HomePage, RegisterMovie}

class CapMoviesSimulation extends Simulation{

  val httpProtocol = http
    .baseUrl("http://localhost:9000/capmovie")
    .inferHtmlResources()

  val scn = scenario("RegisterMovieSimulation")
    .exec(RegisterMovie.getMovieTitlePage)
    .exec(RegisterMovie.submitMovieTitle)
    .exec(RegisterMovie.getMoviePosterPage)
    .exec(RegisterMovie.submitMoviePoster)
    .exec(HomePage.getHomePage)

  val RegisterMovieSimulation: SetUp =
    setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

}
