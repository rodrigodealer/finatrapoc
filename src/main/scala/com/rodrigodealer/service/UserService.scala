package com.rodrigodealer.service

import com.rodrigodealer.model.User
import org.neo4j._
import org.neo4j.graphdb._
import org.neo4j.graphdb.Traverser._
import eu.fakod.neo4jscala._
import org.anormcypher.{Neo4jREST, Cypher}
import eu.fakod.neo4jscala.Cypher

/**
 * Created by rodrigo on 1/12/14.
 */
object UserService  {


  def store(user: User) {

    val result = Cypher("""
  create (germany {name:"Germany", population:81726000, type:"Country", code:"DEU"}),
         (france {name:"France", population:65436552, type:"Country", code:"FRA", indepYear:1790}),
         (monaco {name:"Monaco", population:32000, type:"Country", code:"MCO"});
                        """).execute()

    val req = Cypher("start n=node(*) return n.name")
    val stream = req()

    System.out.print(stream.map(row => {row[String]("n.name")}).toList)
  }

}
