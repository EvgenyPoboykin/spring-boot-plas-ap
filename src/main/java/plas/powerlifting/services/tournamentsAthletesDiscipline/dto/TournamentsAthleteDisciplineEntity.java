package plas.powerlifting.services.tournamentsAthletesDiscipline.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import plas.powerlifting.services.athletes.dto.AthleteEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "TournamentAthleteDiscipline")
@Table(name = "tournament_athlete_discipline")
public class TournamentsAthleteDisciplineEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    UUID id;
    @Column(name = "tournament_id", nullable = false, updatable = false)
    UUID tournamentId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "athlete_id", nullable = false, updatable = false)
    AthleteEntity athlete;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "discipline")
    DisciplineEnum discipline;
    @Column(name = "attempt_1", nullable = false)
    float attempt1;
    @Column(name = "attempt_2", nullable = false)
    float attempt2;
    @Column(name = "attempt_3", nullable = false)
    float attempt3;
    @Column(name = "attempt_4", nullable = false)
    float attempt4;
    @Column(name = "attempt_5", nullable = false)
    float attempt5;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedAt;
}
