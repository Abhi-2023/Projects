package com.Abhi.WatchlistApp.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RatingService {
	
	String apiUrl =  "http://www.omdbapi.com/?i=tt3896198&apikey=ecf1e276&t=";
	public String getMoveString(String title) {
		// TODO Auto-generated method stub
		try {
			RestTemplate template = new RestTemplate();
			ResponseEntity<ObjectNode> response = template.getForEntity(apiUrl + title, ObjectNode.class);
			ObjectNode jsObjectNode = response.getBody();
			return jsObjectNode.path("imdbRating").asText();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Either the movie name is not available or api is down " + e.getMessage());
			return null;
		}

	}
}
