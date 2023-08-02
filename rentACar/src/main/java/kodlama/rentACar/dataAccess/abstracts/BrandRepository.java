package kodlama.rentACar.dataAccess.abstracts;

import kodlama.rentACar.entitites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import kodlama.rentACar.*;

import java.util.List;


@Repository
@EnableJpaRepositories ("kodlama.rentACar.*")
@ComponentScan ("kodlama.rentACar.*")
@EntityScan ("kodlama.rentACar.*")
public interface BrandRepository extends JpaRepository<Brand,Integer> {



}
