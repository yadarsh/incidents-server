package com.dash.incidents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dash.incidents.ws.model.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {


}
