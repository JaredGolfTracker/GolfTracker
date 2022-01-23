package com.jared.golftracker.GolfTracker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/courses")
public class GolfCourseController {
	@GetMapping
	public List<String> getCourseList() {
		List<String> list = new ArrayList<>();
		list.add("Southridge");
		list.add("Riverdale Dunes");
		return list;
	}
}
