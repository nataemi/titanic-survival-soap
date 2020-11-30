package com.titanic.spring.soap.api.service;


import com.titanic.spring.soap.api.titanicsurvival.ParticipantRequest;
import com.titanic.spring.soap.api.titanicsurvival.Survival;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitanicSurvivalService {

	public Survival checkSurvival(ParticipantRequest participant) {
		Survival survival = new Survival();
		List<String> causeOfDeath = survival.getCauseOfDeath();

		if (participant.getAge() > 16 && "M".equals(participant.getGender())) {
			causeOfDeath.add("Adult men usually didnt survive");
		}
		if (participant.getAmountOfChildren() > 2) {
			causeOfDeath.add("People with many children usually didnt survive");
		}

		if (causeOfDeath.size() > 0) {
			survival.setWouldSurvive(false);
		} else {
			survival.setWouldSurvive(true);
			causeOfDeath.clear();
		}
		return survival;

	}

}
