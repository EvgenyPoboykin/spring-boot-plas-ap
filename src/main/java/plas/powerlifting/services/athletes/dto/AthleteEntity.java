package plas.powerlifting.services.athletes.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "Athlete")
@Table(name = "athlete")
public class AthleteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    UUID id;
    @Column(name = "profile_image")
    String profileImage;
    @Column(name = "firstname", nullable = false)
    String firstname;
    @Column(name = "lastname", nullable = false)
    String lastname;
    @Column(name = "born", nullable = false)
    LocalDate born;
    @Column(name = "city", nullable = false)
    String city;
    @Column(name = "federation")
    String federation;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedAt;
}
