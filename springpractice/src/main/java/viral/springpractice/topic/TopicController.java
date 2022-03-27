package viral.springpractice.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TopicController {
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics () {
		List <Topic> topicsToReturn = Arrays.asList(new Topic ("Spring", "Spring Framework", "Spring description"),
				new Topic ("JS", "JavaSciprt", "node maker")
				);
		return topicsToReturn;
	}

}
