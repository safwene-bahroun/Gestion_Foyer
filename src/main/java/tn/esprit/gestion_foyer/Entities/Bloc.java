package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bloc {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idBloc;
   private String nomBloc;
   private Long capaciteBloc;

   @ManyToOne(fetch = FetchType.EAGER)
   private Foyer foyer;

   @OneToMany(mappedBy = "bloc", fetch = FetchType.EAGER, cascade = jakarta.persistence.CascadeType.ALL)
   private Set<Chambre> chambres;

}
