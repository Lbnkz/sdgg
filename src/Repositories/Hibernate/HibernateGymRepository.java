package Repositories.Hibernate;

import Entities.Gym;
import Repositories.GymRepository;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class HibernateGymRepository implements GymRepository {

    private final EntityManager entityManager;

    public HibernateGymRepository() {
        this.entityManager = JpaManager.getEntityManager();
    }
    
    @Override
    public Gym create(Gym gym) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(gym);
            this.entityManager.getTransaction().commit();
            return gym;
        } catch(Exception e){
            return null;
        }
    }

    @Override
    public Gym searchGymName(String name) {
        try {
            TypedQuery<Gym> query = this.entityManager.createQuery("SELECT u FROM Gym AS u WHERE u.name = :name", Gym.class);
            query.setParameter("name", name);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
