package com.rodrigodealer.server

import com.twitter.finatra.FinatraServer
import com.rodrigodealer.controller.HomeController

/**
 * Created by rodrigo on 1/4/14.
 */
object AppServer {

  object App extends FinatraServer {
    register(new HomeController())
  }

  def main(args: Array[String]) = {
    App.start()
  }

}
