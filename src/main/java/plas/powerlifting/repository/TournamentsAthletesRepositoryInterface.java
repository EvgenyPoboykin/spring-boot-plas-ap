package plas.powerlifting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import plas.powerlifting.services.tournamentsAthletes.dto.TournamentsAthleteEntity;

import java.util.UUID;

public interface TournamentsAthletesRepositoryInterface extends JpaRepository<TournamentsAthleteEntity, UUID> {
}
