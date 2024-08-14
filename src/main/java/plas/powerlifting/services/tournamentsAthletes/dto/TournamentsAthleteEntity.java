package plas.powerlifting.services.tournamentsAthletes.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import plas.powerlifting.services.athletes.dto.AthleteEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "TournamentAthlete")
@Table(name = "tournament_athlete")
public class TournamentsAthleteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    UUID id;
    @Column(name = "tournament_id", nullable = false, updatable = false)
    UUID tournamentId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "athlete_id", nullable = false, updatable = false)
    AthleteEntity athlete;
    @Column(name = "profile_image")
    String profileImage;
    @Column(name = "self_weight", nullable = false)
    float selfWeight;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedAt;
}
