package plas.powerlifting.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import plas.powerlifting.api.ControllerTournamentsInterface;
import plas.powerlifting.services.tournaments.service.ServiceTournamentsInterface;

@AllArgsConstructor
@RestController
public class ControllerTournaments implements ControllerTournamentsInterface {
    private final ServiceTournamentsInterface serviceTournaments;
}
