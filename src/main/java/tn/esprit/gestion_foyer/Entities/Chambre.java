package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Chambre {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long   idChambre ;

  @Enumerated(EnumType.STRING)
  private TypeChambre typeChambre ;

  @Column()
  private Long NumeroChambre ;


}
