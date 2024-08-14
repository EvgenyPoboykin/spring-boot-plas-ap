package plas.powerlifting.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import plas.powerlifting.api.ControllerAthletesInterface;
import plas.powerlifting.services.athletes.service.ServiceAthletesInterface;

@AllArgsConstructor
@RestController
public class ControllerAthletes implements ControllerAthletesInterface {
    private final ServiceAthletesInterface serviceAthletes;
}
