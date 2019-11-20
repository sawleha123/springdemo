package com.io.tester.topics;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping("/topicsList")
	public List<Topics> showAllTopics()
	{
		return Arrays.asList(new Topics(1, "Java"),new Topics(2, ".Net"),new Topics(3, "Python"));
	}
	
}
