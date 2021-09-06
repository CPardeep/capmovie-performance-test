package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import requests._

class CapMovieUpdateSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:9000/capmovie/")
    .inferHtmlResources()

  val scn: ScenarioBuilder = scenario("UpdateMovieSimulation")
    .exec(RegisterMovie.getLogin)
    .exec(RegisterMovie.submitLogin)
    .exec(HomePage.getHomePage)
    .exec(UpdateMovie.getOneMoviePage)
    .exec(UpdateMovie.getMovieTitlePage)
    .exec(UpdateMovie.submitMovieTitle)
    .exec(UpdateMovie.getMovieGenresPage)
    .exec(UpdateMovie.submitMovieGenresPage)
    .exec(UpdateMovie.getMovieGenresConfPage)
    .exec(UpdateMovie.removeMovieGenre)
    .exec(UpdateMovie.getAgeRatingPage)
    .exec(UpdateMovie.submitAgeRating)
    .exec(UpdateMovie.getMoviePlot)
    .exec(UpdateMovie.submitMoviePlot)
    .exec(UpdateMovie.getMoviePoster)
    .exec(UpdateMovie.submitMoviePoster)
    .exec(UpdateMovie.getMovieCastPage)
    .exec(UpdateMovie.submitMovieCast)
    .exec(UpdateMovie.getMovieCastConfPage)
    .exec(UpdateMovie.removeMovieCast)

  val UpdateMovieSimulation: SetUp =
    setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))
}
