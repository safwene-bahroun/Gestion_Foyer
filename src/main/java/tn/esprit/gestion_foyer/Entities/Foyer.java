package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idFoyer ;
    private String  nomFoyer ;
    private  Long capaciteFoyer ;
    @OneToOne(cascade =CascadeType.ALL,mappedBy = "foyer")
    private Universite univerite;


}
