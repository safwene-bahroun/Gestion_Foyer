package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
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
public class Chambre {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idChambre;

  @Enumerated(EnumType.STRING)
  private TypeChambre typeChambre;

  @Column
  private Long NumeroChambre;

  @ManyToOne(fetch = FetchType.EAGER)
  private Bloc bloc;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Reservation> reservations;

}
