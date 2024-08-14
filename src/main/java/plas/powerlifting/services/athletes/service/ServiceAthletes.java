package plas.powerlifting.services.athletes.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import plas.powerlifting.repository.AthletesRepositoryInterface;

@Service
@AllArgsConstructor
public class ServiceAthletes implements ServiceAthletesInterface {
    private final AthletesRepositoryInterface athletesRepository;
}
