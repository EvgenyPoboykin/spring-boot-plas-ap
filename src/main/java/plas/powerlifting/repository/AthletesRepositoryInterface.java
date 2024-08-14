package plas.powerlifting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import plas.powerlifting.services.athletes.dto.AthleteEntity;

import java.util.UUID;

public interface AthletesRepositoryInterface extends JpaRepository<AthleteEntity, UUID> {
}
