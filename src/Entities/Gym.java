package Entities;

import java.util.Date;
import java.util.UUID;
import javax.persistence.*;



@Entity
@Table(name = "gym")
public class Gym {
    @Id
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;
    
    @Column(name = "name", unique = true)
    private String name;
    
    @Column(name = "phone", unique = true)
    private String phone;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "latitude")
    private Double latitude;
    
    @Column(name = "longitude")
    private Double longitude;
    
    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_criacao;
    
    public Gym(){}

    public Gym(String name, String phone, String description, Double latitude, Double longitude) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.data_criacao = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Date getData_criacao() {
        return data_criacao;
    }
    
    
}
