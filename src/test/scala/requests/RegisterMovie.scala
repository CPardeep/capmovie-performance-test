package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object RegisterMovie {


  def getMovieTitlePage: ChainBuilder = {
    exec(http("Get movie title page")
      .get("/movie-title/")
      .check(status.is(200))
    )
  }

  def submitMovieTitle: ChainBuilder = {
    exec(http("Submit movie title")
      .post("/movie-title/")
      .formParam("title", "TestTitle")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePosterPage: ChainBuilder = {
    exec(http("Get movie poster page")
      .get("/movie-poster")
      .check(status.is(200))
    )
  }

  def submitMoviePoster: ChainBuilder = {
    exec(http("Submit movie poster")
      .post("/movie-poster/")
      .formParam("poster", "TestPoster")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePlot: ChainBuilder = {
    exec(http("get movie plot")
      .get("/movie-plot/")
      .check(status.is(200))
    )
  }

  def submitMoviePlot: ChainBuilder = {
    exec(http("Submit movie plot")
      .post("/movie-plot/")
      .formParam("plot", "TestPlot")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getLogin: ChainBuilder = {
    exec(http("Get Login Page")
      .get("/login/")
      .check(status.is(200))
    )
  }

  def submitLogin: ChainBuilder = {
    exec(http("Submit login details")
      .post("/login/")
      .formParam("id", "ADMIN0001")
      .formParam("password", "PASS")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieGenresPage: ChainBuilder = {
    exec(http("Get movie genres page")
      .get("/movie-genres/")
      .check(status.is(200))
    )
  }

  def submitMovieGenres: ChainBuilder = {
    exec(http("Submit movie genre")
      .post("/movie-genres/")
      .formParam("genres", "testGenre")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }
  def getMovieGenresConfPage: ChainBuilder = {
    exec(http("Get movie genres confirmation page")
      .get("/movie-genres/confirmation")
      .check(status.is(200))
    )
  }
}
