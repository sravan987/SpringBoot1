package com.sprinboot1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.sprinboot1.hello.Topic;

@Service
public class TopicService {
	
		List<Topic>topics=new ArrayList<>(Arrays.asList(new Topic("spring","SPringBoot","StandloneApplication"),
				new Topic("java","SPringMvc","EEApplication"),

				new Topic("php","SPringIOC","Depandency Injection")

));
		
		
		public List<Topic> getAllTopic(){
			return topics;
		}
		
		
		public Topic getTopic(String id) {
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

		public void addTopic(Topic topic) {
			// TODO Auto-generated method stub
			topics.add(topic);

		}


		public void updateTopic(Topic topic, String id) {
			// TODO Auto-generated method stub
			
			for(int i=0;i<topics.size();i++) {
				Topic t=topics.get(i);
				if(t.getId().equals(id))
				{
					topics.set(i, topic);
					return;
				}
			}
			
			
		}
		
		
		

}
