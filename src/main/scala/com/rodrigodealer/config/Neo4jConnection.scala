package com.rodrigodealer.config

import org.anormcypher.Neo4jREST

/**
 * Created by rodrigo on 1/12/14.
 */
class Neo4jConnection(hostname: String, port: Int, dataDirectory: String) {

  def getConnection() {
    Neo4jREST.setServer(hostname, port, dataDirectory)
  }
}
