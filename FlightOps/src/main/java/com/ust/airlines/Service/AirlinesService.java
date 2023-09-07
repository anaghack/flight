package com.ust.airlines.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.airlines.Entity.AirlinesEntity;
import com.ust.airlines.Repository.AirlinesRepo;

@Service
public class AirlinesService {


	private final AirlinesRepo airlineRepository;

	    private final String jsonUrl = "https://cdn.jsdelivr.net/gh/besrourms/airlines@latest/airlines.json";

	 

	    @Autowired

	    public AirlinesService(AirlinesRepo airlineRepository) {

	        this.airlineRepository = airlineRepository;

	    }

	 

	    public void fetchAndSaveAirlines() {

	        // Use RestTemplate to fetch JSON data from the URL

	        RestTemplate restTemplate = new RestTemplate();

	        AirlinesEntity[] airlines = restTemplate.getForObject(jsonUrl, AirlinesEntity[].class);

	 

	        // Save the fetched data to the database

	        for (AirlinesEntity airline : airlines) {

	            airlineRepository.save(airline);

	        }

	    }
}
