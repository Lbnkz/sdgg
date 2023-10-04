package Repositories;

import Entities.Gym;


public interface GymRepository {
    public Gym create(Gym gym);
    public Gym searchGymName(String name);
}
