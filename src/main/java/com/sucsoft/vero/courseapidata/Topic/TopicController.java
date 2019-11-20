package com.sucsoft.vero.courseapidata.Topic;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    //Declare that this needs dependency injection
    @Autowired
    private TopicService topicService;

    @ApiOperation(value = "API-话题-获取所有话题")
//    @RequestMapping("/topics")
    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @ApiOperation(value = "API-话题-获取某个话题")
    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @ApiOperation(value = "API-话题-添加话题")
//    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @ApiOperation(value = "API-话题-更新话题")
//    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @ApiOperation(value = "API-话题-删除话题")
//    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
