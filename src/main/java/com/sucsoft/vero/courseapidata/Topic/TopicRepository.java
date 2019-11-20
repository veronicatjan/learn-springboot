package com.sucsoft.vero.courseapidata.Topic;

//This is a data service.

import org.springframework.data.repository.CrudRepository;

/* Data layer implementations like Getting all entities,
* Getting particular entity, updating entity
* or deleting entities are already implemented by
* CrudRepository
* So all we have to do is implement the special methods needed,
* like searching for an entity, etc.
*/


//CrudRepository is a generic type, so generic type info is required
//1st generic : which entity class you're working with (Topic)
//2nd generic : what's the type of Primary key or ID that this entity class has (String)
public interface TopicRepository extends CrudRepository<Topic, String>{

}
