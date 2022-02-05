package com.jared.golftracker.GolfTracker;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/courses")
public class GolfCourseController {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@GetMapping("/api/courses")
	public List<Map<String, Object>> getCourseList() {
		String sql = "SELECT * from courses";
		jdbc.execute(sql);
		return jdbc.queryForList(sql);
	}
	
	@GetMapping("/api/courses/{courseName}")
	public Map<String, Object> getCourse(@PathVariable String courseName){
		String sql = "SELECT * FROM courses where Course_Name = :course_name";
		MapSqlParameterSource parameters = new MapSqlParameterSource();
	    parameters.addValue("course_name", courseName);
	    NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbc.getDataSource());
	    
	    return namedParameterJdbcTemplate.queryForMap(sql, parameters);
		
	}
	
	@PutMapping("/api/courses/addCourse")
	public Map<String, Object> addCourse(@RequestBody String requestData){
		return null;
		
	}
}
