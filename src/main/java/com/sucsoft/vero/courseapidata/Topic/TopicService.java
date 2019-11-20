package com.sucsoft.vero.courseapidata.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This is a spring business service ~

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        // return topics;

        /* Since the findAll() is an Iterable,
        * we need to convert it to list
        * forEach(topics::add) will add for each of the element
        * in interable will be added to the list topics*/
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Topic topics;
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    /*the save() can be used for both add and update method
    * as the Topic object has id info which is enough
    * for CrudRepository to update.
    * if exist -> update, if not -> add */
    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
