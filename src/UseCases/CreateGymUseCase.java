package UseCases;

import DTO.CreateGymDTO;
import Entities.Gym;
import Repositories.GymRepository;


public class CreateGymUseCase {
    private final GymRepository gymRepository;

    public CreateGymUseCase(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }
    
    
   public Gym execute(CreateGymDTO gymDTO) throws Exception {
        Gym gym = this.gymRepository.searchGymName(gymDTO.getName());
        if(gym != null){
            throw new Exception("Usuario ja existe");
        }
       
       
        return null;
    }
}
