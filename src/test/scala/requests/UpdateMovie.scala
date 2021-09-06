package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object UpdateMovie {

  def getOneMoviePage: ChainBuilder = {
    exec(http("Get movie title update page")
      .get("http://localhost:9001/capmovie/movie/MOV0001")
      .check(status.is(200))
    )
  }

  def getMovieTitlePage: ChainBuilder = {
    exec(http("Get movie title update page")
      .get("update/MOV0001/title")
      .check(status.is(200))
    )
  }
  def submitMovieTitle: ChainBuilder = {
    exec(http("Submit movie title update")
      .post("update/MOV0001/title")
      .formParam("title", "testTitle")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieGenresPage: ChainBuilder = {
    exec(http("Get movie genres update page")
      .get("update/MOV0001/genre")
      .check(status.is(200))
    )
  }
  def submitMovieGenresPage: ChainBuilder = {
    exec(http("Submit movie genres update page")
      .post("update/MOV0001/genre")
      .formParam("genres", "TestGenre")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }
  def getMovieGenresConfPage: ChainBuilder = {
    exec(http("Get movie genres update confirmation page")
      .get("update/MOV0001/genre/confirmation")
      .check(status.is(200))
    )
  }
  def removeMovieGenre: ChainBuilder = {
    exec(http("remove update Movie Genre")
      .get("update/MOV0001/cast/TestGenre")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getAgeRatingPage: ChainBuilder = {
    exec(http("Get update age rating page")
      .get("update/MOV0001/age-rating")
      .check(status.is(200))
    )
  }
  def submitAgeRating: ChainBuilder = {
    exec(http("Submit update age rating")
      .post("update/MOV0001/age-rating")
      .formParam("rated", "PG")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePlot: ChainBuilder = {
    exec(http("Get movie update plot")
      .get("update/MOV0001/plot")
      .check(status.is(200))
    )
  }
  def submitMoviePlot: ChainBuilder = {
    exec(http("Submit movie update plot")
      .post("update/MOV0001/plot")
      .formParam("plot", "testPlot")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMoviePoster: ChainBuilder = {
    exec(http("Get movie poster update page ")
      .get("update/MOV0001/poster")
      .check(status.is(200))
    )
  }
  def submitMoviePoster: ChainBuilder = {
    exec(http("submit movie poster update page ")
      .post("update/MOV0001/poster")
      .formParam("poster", "testPoster")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

  def getMovieCastPage: ChainBuilder = {
    exec(http("Get update movie cast page")
      .get("update/MOV0001/cast")
      .check(status.is(200))
    )
  }
  def submitMovieCast: ChainBuilder = {
    exec(http("Submit update movie cast")
      .post("update/MOV0001/cast")
      .formParam("cast", "testCast")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }
  def getMovieCastConfPage: ChainBuilder = {
    exec(http("Get update movie cast confirmation page")
      .get("update/MOV0001/cast/confirmation")
      .check(status.is(200))
    )
  }
  def removeMovieCast: ChainBuilder = {
    exec(http("remove Movie Cast")
      .get("update/MOV0001/cast/testCast")
      .disableFollowRedirect
      .check(status.is(303))
    )
  }

}