package com.rodrigodealer.controller

import com.twitter.finatra.test.FlatSpecHelper
import com.twitter.finatra.FinatraServer
import com.rodrigodealer.server.AppServer.App

/**
 * Created by rodrigo on 1/4/14.
 */
class HomeControllerSpec extends FlatSpecHelper  {
  def app = new HomeController

  "GET /hello/rodrigo" should "respond with hello rodrigo" in {
    get("/hello/rodrigo")
    response.body should equal ("hello rodrigo")
    response.code should equal (200)
  }

  def server: FinatraServer = App
}
