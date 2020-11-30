package com.titanic.spring.soap.api.endpoint;

import com.titanic.spring.soap.api.service.TitanicSurvivalService;
import com.titanic.spring.soap.api.titanicsurvival.ParticipantRequest;
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

	@PayloadRoot(namespace = NAMESPACE, localPart = "ParticipantRequest")
	@ResponsePayload
	public Survival getAproximatedSurvival(@RequestPayload ParticipantRequest participant) {
		return service.checkSurvival(participant);
	}

}
