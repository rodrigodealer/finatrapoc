package com.rodrigodealer.service

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import com.rodrigodealer.model.User

/**
 * Created by rodrigo on 1/12/14.
 */
class UserServiceSpec extends FlatSpec with ShouldMatchers {

  "UserService" should "create a node" in {
    var user = new User("Rodrigo", "rodrigodealer", "123456");
    UserService.store(user);
  }
}
