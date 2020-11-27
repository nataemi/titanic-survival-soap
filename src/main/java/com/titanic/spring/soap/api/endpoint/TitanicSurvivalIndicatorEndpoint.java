package com.titanic.spring.soap.api.endpoint;

import com.titanic.spring.soap.api.service.TitanicSurvivalService;
import com.titanic.spring.soap.api.titanicsurvival.Participant;
import com.titanic.spring.soap.api.titanicsurvival.Survival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TitanicSurvivalIndicatorEndpoint {

	private static final String NAMESPACE = "http://www.titanic.com/spring/soap/api/titanicSurvival";
	@Autowired
	private TitanicSurvivalService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "Participant")
	@ResponsePayload
	public Survival getAproximatedSurvival(@RequestPayload Participant participant) {
		return service.checkSurvival(participant);
	}

}
