package kodlama.rentACar.entitites.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="brands")//Bazı durumlarda annotations sırası önemlidir.
@Data
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
public class Brand {
    @Id   //primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

}
