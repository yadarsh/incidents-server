package com.dash.incidents.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dash.incidents.repository.IncidentRepository;
import com.dash.incidents.ws.model.Incident;

@Service
public class IncidentServiceImpl implements IncidentService {

	@Autowired
	private IncidentRepository incidentRepository;

	@Override
	public Collection<Incident> getAllIncidents() {
		Collection<Incident> incidents = incidentRepository.findAll();
		return incidents;
	}

}
