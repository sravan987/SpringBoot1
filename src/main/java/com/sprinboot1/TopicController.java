package com.sprinboot1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot1.hello.Topic;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")

	public List<Topic>getAllTopics() {
		return topicservice.getAllTopic();
		
		
	}
	 
	//returning the single id
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	//adding the data POST request
	
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		System.out.println(topic);
		topicservice.addTopic(topic);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics{id}")
	public void addTopic(@RequestBody Topic topic,@PathVariable String id) {
		System.out.println(topic);
		topicservice.updateTopic(topic,id);
		
	}
	


	

}
