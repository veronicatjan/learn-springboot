package com.sucsoft.vero.courseapidata.web;

import com.sucsoft.vero.courseapidata.bean.Topic;
import com.sucsoft.vero.courseapidata.service.TopicService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TopicController
 *
 * @author veronicatjan
 * @date 2019/11/20
 */
@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @ApiOperation(value = "API-话题-获取所有话题")
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
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @ApiOperation(value = "API-话题-更新话题")
    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @ApiOperation(value = "API-话题-删除话题")
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
