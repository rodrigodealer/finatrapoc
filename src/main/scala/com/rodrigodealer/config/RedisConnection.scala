package com.rodrigodealer.config

import com.redis.RedisClient


/**
 * Created by rodrigo on 1/4/14.
 */
class RedisConnection(var connection: RedisClient) {

  def getConnection:RedisClient = {
    if (connection == null) {
      connection = new RedisClient("localhost", 6379)
    }
    connection
  }



}
