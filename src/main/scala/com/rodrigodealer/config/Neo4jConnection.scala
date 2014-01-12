package com.rodrigodealer.config

import org.anormcypher.Neo4jREST

/**
 * Created by rodrigo on 1/12/14.
 */
class Neo4jConnection {

  def getConnection() {
    Neo4jREST.setServer("localhost", 7474, "/db/data/")
  }
}
