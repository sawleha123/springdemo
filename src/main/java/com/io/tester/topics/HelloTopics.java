package com.io.tester.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTopics {

	@RequestMapping("/topics")
	public String showTopics()
	{
		return "Topics";
	}
}
