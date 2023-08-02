package kodlama.rentACar.business.concretes;

import kodlama.rentACar.business.abstracts.BrandService;
import kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.rentACar.entitites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager() {
    }


    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //İş kuralları
        return brandRepository.findAll();
        //return List.of(new Brand(1,"test"));
    }
}
