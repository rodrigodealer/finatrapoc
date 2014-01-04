package com.rodrigodealer.controller

import com.twitter.finatra.test.FlatSpecHelper

/**
 * Created by rodrigo on 1/4/14.
 */
class HomeControllerSpec extends FlatSpecHelper  {
  def app = new HomeController

  "GET /hello/rodrigo" should "respond with hello rodrigo" in {
    get("/hello/rodrigo")
    response.body should equal ("hello rodrigo")
    response.code shouldBe (200)
  }
}
