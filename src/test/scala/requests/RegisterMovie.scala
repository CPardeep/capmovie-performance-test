package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object RegisterMovie {


  def getMovieTitlePage: ChainBuilder = {
    exec(http("Get movie title page")
      .get("/movie-title/false")
      .check(status.is(200))
    )
  }

  def submitMovieTitle: ChainBuilder = {
    exec(http("Submit movie title")
      .post("/movie-title/false")
      .formParam("title", "TestTitle")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePosterPage: ChainBuilder = {
    exec(http("Get movie poster page")
      .get("/movie-poster/false")
      .check(status.is(200))
    )
  }

  def submitMoviePoster: ChainBuilder = {
    exec(http("Submit movie poster")
      .post("/movie-poster/false")
      .formParam("poster",
        "https://m.media-amazon.com/images/M/MV5BMTMzMDcxMjgyNl5BMl5BanBnXkFtZTcwOTgxNjg4Mg@@._V1_SY1000_SX677_AL_.jpg")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePlot: ChainBuilder = {
    exec(http("get movie plot")
      .get("/movie-plot/false")
      .check(status.is(200))
    )
  }

  def submitMoviePlot: ChainBuilder = {
    exec(http("Submit movie plot")
      .post("/movie-plot/false")
      .formParam("plot", "TestPlot")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getLogin: ChainBuilder = {
    exec(http("Get Login Page")
      .get("/login")
      .check(status.is(200))
    )
  }

  def submitLogin: ChainBuilder = {
    exec(http("Submit login details")
      .post("/login")
      .formParam("id", "ADMIN0001")
      .formParam("password", "PASS")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieGenresPage: ChainBuilder = {
    exec(http("Get movie genres page")
      .get("/movie-genres/false")
      .check(status.is(200))
    )
  }

  def submitMovieGenres: ChainBuilder = {
    exec(http("Submit movie genre")
      .post("/movie-genres/false")
      .formParam("genres", "testGenre")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieGenresConfPage: ChainBuilder = {
    exec(http("Get movie genres confirmation page")
      .get("/movie-genres/confirmation/false")
      .check(status.is(200))
    )
  }

  def removeMovieGenre: ChainBuilder = {
    exec(http("remove Movie Genre")
      .get("/movie-genres/confirmation/testGenre/false")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieCastPage: ChainBuilder = {
    exec(http("Get movie cast page")
      .get("/movie-cast")
      .check(status.is(200))
    )
  }

  def submitMovieCast: ChainBuilder = {
    exec(http("Submit movie cast")
      .post("/movie-cast")
      .formParam("cast", "testCast")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def removeMovieCast: ChainBuilder = {
    exec(http("remove Movie Cast")
      .get("/movie-cast/confirmation/testCast")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieCastConfPage: ChainBuilder = {
    exec(http("Get movie cast confirmation page")
      .get("/movie-cast/confirmation")
      .check(status.is(200))
    )
  }

  def getMovieSummaryPage: ChainBuilder = {
    exec(http("Get movie summary page")
      .get("/summary/false")
      .check(status.is(200))
    )
  }

  def getMovieTitleChangeLink: ChainBuilder = {
    exec(http("Get movie title change link")
      .get("/movie-title/true")
      .check(status.is(200))
      )
  }

  def submitUpdatedMovieTitle: ChainBuilder = {
    exec(http("submit updated movie title")
      .post("/movie-title/true")
      .formParam("title", "TestTitle1")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def submitMovieSummaryPage: ChainBuilder = {
    exec(http("submit movie")
      .get("/submit")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getSubmissionConfPage: ChainBuilder = {
    exec(http("get movie submission confirmation")
      .get("/confirmation")
      .disableFollowRedirect
      .check(status.is(200))
    )
  }

}
