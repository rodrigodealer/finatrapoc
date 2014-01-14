package com.rodrigodealer.controller

import com.twitter.finatra._
import com.twitter.finatra.ContentType._
import com.rodrigodealer.service.UserService


/**
 * Created by rodrigo on 1/4/14.
 */
class HomeController extends Controller {

  get("/hello/:name") { request =>
    val name = request.routeParams("name");
    render.plain("hello " + name).toFuture
  }

  get("/cities/of/:city") { request =>
    val name = request.routeParams("city");

    var list = UserService.get(name)
    render.json(list).toFuture
  }
}
