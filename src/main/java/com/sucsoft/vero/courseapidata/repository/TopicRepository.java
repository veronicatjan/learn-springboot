package com.sucsoft.vero.courseapidata.repository;

//This is a data service.

import com.sucsoft.vero.courseapidata.bean.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * CourseApiDataApplication
 * Data layer implementations like Getting all entities,
 * Getting particular entity, updating entity
 * or deleting entities are already implemented by
 * CrudRepository
 * So all we have to do is implement the special methods needed,
 * like searching for an entity, etc.
 * CrudRepository is a generic type, so generic type info is required
 * 1st generic : which entity class you're working with (ex.Topic)
 * 2nd generic : what's the type of Primary key or ID that this entity class has (ex. String)
 * @author veronicatjan
 * @date 2019/11/20
 */

public interface TopicRepository extends CrudRepository<Topic, String>{

}
