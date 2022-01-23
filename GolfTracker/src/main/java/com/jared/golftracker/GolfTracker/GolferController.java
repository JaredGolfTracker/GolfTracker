package com.jared.golftracker.GolfTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/golfer")
public class GolferController {

	@GetMapping
	public String getUserName() {
		return "Bob";
	}
}
