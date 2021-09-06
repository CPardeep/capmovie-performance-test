package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import requests.{AgeRating, HomePage, MoviePage, RegisterMovie, StartPage}


class CapMoviesSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:9000/capmovie")
    .inferHtmlResources()

  val scn: ScenarioBuilder = scenario("RegisterMovieSimulation")
    .exec(HomePage.getHomePage)
    .exec(MoviePage.getMoviePage)
    .exec(RegisterMovie.getLogin)
    .exec(RegisterMovie.submitLogin)
    .exec(StartPage.getStartPage)
    .exec(HomePage.getHomePage)
    .exec(RegisterMovie.getMovieTitlePage)
    .exec(RegisterMovie.submitMovieTitle)
    .exec(RegisterMovie.getMoviePlot)
    .exec(RegisterMovie.submitMoviePlot)
    .exec(RegisterMovie.getMoviePosterPage)
    .exec(RegisterMovie.submitMoviePoster)
    .exec(AgeRating.getAgeRatingPage)
    .exec(AgeRating.submitAgeRating)
    .exec(RegisterMovie.getMovieGenresPage)
    .exec(RegisterMovie.submitMovieGenres)
    .exec(RegisterMovie.getMovieGenresConfPage)
    .exec(RegisterMovie.removeMovieGenre)
    .exec(RegisterMovie.getMovieGenresPage)
    .exec(RegisterMovie.submitMovieGenres)
    .exec(RegisterMovie.getMovieCastPage)
    .exec(RegisterMovie.submitMovieCast)
    .exec(RegisterMovie.getMovieCastConfPage)
    .exec(RegisterMovie.getMovieSummaryPage)
    .exec(RegisterMovie.submitMovieSummaryPage)
    .exec(RegisterMovie.getSubmissionConfPage)


  val RegisterMovieSimulation: SetUp =
    setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

}

