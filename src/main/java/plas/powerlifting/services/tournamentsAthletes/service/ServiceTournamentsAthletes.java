package plas.powerlifting.services.tournamentsAthletes.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import plas.powerlifting.repository.TournamentsAthletesRepositoryInterface;

@Service
@AllArgsConstructor
public class ServiceTournamentsAthletes implements ServiceTournamentsAthletesInterface {
    private final TournamentsAthletesRepositoryInterface tournamentsAthletesRepository;
}
