package com.ust.airlines.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.airlines.Service.AirlinesService;


@RestController

@RequestMapping("/api/airlines")

public class AirlinesController {


	    private final AirlinesService airlineService;

	 

	    @Autowired

	    public AirlinesController(AirlinesService airlineService) {

	        this.airlineService = airlineService;

	    }

	 

	    @GetMapping("/fetch")

	    public String fetchAndSaveAirlines() {

	        airlineService.fetchAndSaveAirlines();

	        return "Data fetched and saved to the database.";

	    }

	}



