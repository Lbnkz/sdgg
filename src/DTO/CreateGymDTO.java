package DTO;


public class CreateGymDTO {
    private final String name;
    private final String phone;
    private final String description;
    private final Double latitude;
    private final Double longitude;

    public CreateGymDTO(String name, String phone, String description, Double latitude, Double longitude) {
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
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

    
}
