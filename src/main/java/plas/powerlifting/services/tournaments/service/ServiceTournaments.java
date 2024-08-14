package plas.powerlifting.services.tournaments.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import plas.powerlifting.repository.TournamentsRepositoryInterface;
import plas.powerlifting.services.tournamentsAthletes.service.ServiceTournamentsAthletesInterface;

@Service
@AllArgsConstructor
public class ServiceTournaments implements  ServiceTournamentsInterface{
    private final TournamentsRepositoryInterface tournamentsRepository;
    private final ServiceTournamentsAthletesInterface tournamentsAthletes;
}
