package io.javabrains.springbootstsrter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topics> topics =new ArrayList<>(Arrays.asList(
			 new Topics("Spring","Spring FrameWork","Description",null,null),
			 new Topics("Java","Core java","Java Description",null,null),
			 new Topics("Flutter","Flutter FrameWork","Flutter Description",null,null),
			 new Topics("1","Flutter FrameWork","Flutter Description",null,null)
			 ));
	
	public List<Topics>getAllTopics(){
		return topics;
	}
	
	public Topics getTopic(String id) {
	    Optional<Topics> optionalTopic = topics.stream()
	                                           .filter(t -> t.getId().equalsIgnoreCase(id))
	                                           .findAny();
	    // Check if optionalTopic has a value, if yes, return it, otherwise return a Topics object with the error message
	    return optionalTopic.isPresent() ? optionalTopic.get() : new Topics(null, null, null, id + " is not Found",null);
	}

	public void addTopics(Topics topic) {
		topics.add(topic);
		
	}

	public void updateTopics(String id, Topics topic) {
		for(int i=0;i<topics.size();i++) {
			Topics t = topics.get(i);
			if(t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public Topics deleteTopic(String id) {
	    boolean removed = topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
	    Topics deleteMsg;

	    if (removed) {
	        deleteMsg = new Topics(null, null, null, null, "Topic Deleted Successfully");
	    } else {
	        deleteMsg = new Topics(null, null, null, id + " is not Found", null);
	    }

	    return deleteMsg;
	}

	
       
}
