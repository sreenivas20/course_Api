package io.javabrains.springbootstsrter.topic;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicServices;
	
	 @RequestMapping("/topics") 
	 public List<Topics> getAllTopics() {
		 return topicServices.getAllTopics();
	 }
	@RequestMapping("/topics/{id}") 
    public Topics getTopic(@PathVariable String id) {
		return topicServices.getTopic(id); 
	 }
	@PostMapping(value = "/topics")
	public Topics addTopic(@RequestBody Topics topic) {
		topicServices.addTopics(topic);
		System.out.println(topic.toString());
		return topicServices.getTopic(topic.getId());
	}
	
	@PutMapping(value = "/topics/{id}")
	public Topics updateTopic(@RequestBody Topics topic,@PathVariable String id) {
		topicServices.updateTopics(id,topic);
		return topicServices.getTopic(topic.getId());
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}") 
    public Topics deleteTopic(@PathVariable String id) {
		
		return topicServices.deleteTopic(id); 
	 }
	
	 
}

