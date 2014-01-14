package com.rodrigodealer.service

import com.rodrigodealer.model.User
import org.anormcypher.Cypher

/**
 * Created by rodrigo on 1/12/14.
 */
object UserService  {


  def store(user: User) {


    val result = Cypher("""
          CREATE (berlin { name:'Berlin', type: 'City' })-[:IS_CITY_OF]->(germany { name:'Germany', type: 'Country' }),
          (paris { name:'Paris', type: 'City' })-[:IS_CITY_OF]->(France { name:'France',type: 'Country' }),
          (monaco { name:'Monaco', type: 'City' })-[:IS_CITY_OF]->(France { name:'France',type: 'Country' });
                        """).execute()

    val req = Cypher("start n=node(*) return n.name")
    val stream = req()

    System.out.print(stream.map(row => {row[String]("n.name")}).toList)
  }

  def get(city: String):List[String] = {

    var query = s"""start n=node(*)
                          WHERE (n)-[:IS_CITY_OF]-({ name:'$city' })
                          RETURN n.name as name """
    val result = Cypher(query)

    val countries = result.apply().map(row =>
      row[String]("name")
    )
    countries.toList
  }

}
