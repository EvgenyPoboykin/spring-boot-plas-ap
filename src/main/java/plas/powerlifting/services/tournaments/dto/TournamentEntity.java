package plas.powerlifting.services.tournaments.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "Tournament")
@Table(name = "tournament")
public class TournamentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    UUID id;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "is_closed", nullable = false, updatable = false)
    Boolean isClosed;
    @Column(name = "formula", nullable = false)
    String formula;
    @Column(name = "attempts", nullable = false)
    int attempts;
    @Column(name = "squat", nullable = false)
    Boolean squat;
    @Column(name = "bench_press", nullable = false)
    Boolean benchPress;
    @Column(name = "dead_lift", nullable = false)
    Boolean deadLift;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedAt;
}
