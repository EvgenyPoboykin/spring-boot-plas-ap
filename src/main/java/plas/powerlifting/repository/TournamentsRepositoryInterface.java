package plas.powerlifting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plas.powerlifting.services.tournaments.dto.TournamentEntity;

import java.util.UUID;

@Repository
public interface TournamentsRepositoryInterface extends JpaRepository<TournamentEntity, UUID> {
}
