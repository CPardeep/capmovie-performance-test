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
      .check(status.is(200))
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
      .check(status.is(200))
    )
  }

  def getMoviePlot: ChainBuilder = {
    exec(http("Submit movie plot")
      .get("/movie-plot/")
      .check(status.is(200))
    )
  }

  def submitMoviePlot: ChainBuilder = {
    exec(http("Submit movie plot")
      .post("/movie-plot/")
      .formParam("plot", "TestPlot")
      .check(status.is(200))
    )
  }
}
