package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Universite univerite;

    @OneToMany(mappedBy = "foyer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Bloc> blocs;

}
