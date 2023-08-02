package kodlama.rentACar.webApi.controllers;


import kodlama.rentACar.business.abstracts.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.rentACar.entitites.concretes.Brand;
import java.util.List;


@RestController
@RequestMapping("/api/brands")
public class BrandsContoller {

    @Autowired
    private BrandService brandService;

    public BrandsContoller() {
    }

    public BrandsContoller(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
