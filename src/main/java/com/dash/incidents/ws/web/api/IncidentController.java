package com.dash.incidents.ws.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dash.incidents.ws.model.Incident;
import com.dash.incidents.ws.service.IncidentService;

@RestController
public class IncidentController {

	@Autowired
	private IncidentService incidentService;

	@RequestMapping(value="/api/incidents", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Incident>> getIncidents(){

		Collection<Incident> incidents = incidentService.getAllIncidents();
		return new ResponseEntity<Collection<Incident>>(incidents, HttpStatus.OK);
	}
}
