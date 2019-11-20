package com.sucsoft.vero.courseapidata.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This is a spring business service ~
@Service
public class TopicService {

    private List<Topic> topics =
            new ArrayList<>(Arrays.asList(
                    new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                    new Topic("Java", "Java", "Java Description"),
                    new Topic("Springboot", "Springboot Framework", "Springboot Framework Description")
            ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}