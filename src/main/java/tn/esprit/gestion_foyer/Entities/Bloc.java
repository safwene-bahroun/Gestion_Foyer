package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Bloc {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

 private   Long idBloc ;
  private String nomBloc ;
  private Long  capaciteBloc ;


}
