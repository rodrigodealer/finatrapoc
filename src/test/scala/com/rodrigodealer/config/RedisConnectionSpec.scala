package com.rodrigodealer.config

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import com.redis.RedisClient


/**
 * Created by rodrigo.oliveira on 1/6/14.
 */
class RedisConnectionSpec extends FlatSpec with ShouldMatchers with MockitoSugar {

  "getConnection" should "not connect" in {
    val mockRedisClient = mock[RedisClient]
    when(mockRedisClient.connected).thenReturn(false);

    val redisConnection = new RedisConnection(mockRedisClient);
    var connection = redisConnection.getConnection
    connection.connected should be(false)
  }

  "getConnection" should "connect" in {
    val mockRedisClient = mock[RedisClient]
    when(mockRedisClient.connected).thenReturn(true);

    val redisConnection = new RedisConnection(mockRedisClient);
    var connection = redisConnection.getConnection
    connection.connected should be(true)

  }

}
