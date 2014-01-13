package com.rodrigodealer.config

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.mock.MockitoSugar

/**
 * Created by rodrigo on 1/12/14.
 */
class Neo4jConnectionSpec extends FlatSpec with ShouldMatchers with MockitoSugar {

  "getConnection" should "connect to Neo4j" in {
    val neo4jConnection = new Neo4jConnection("hostname", 7474, "data/");
    neo4jConnection.getConnection();
  }
}
