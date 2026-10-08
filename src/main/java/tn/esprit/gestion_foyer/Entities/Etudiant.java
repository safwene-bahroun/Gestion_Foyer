package tn.esprit.gestion_foyer.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  idEtudiant  ;
   private String nomEtudiant ;
   private String prenomEtudiant ;
   private Long  cin ;
   private String ecole ;
   @JsonFormat (pattern= "YYYY-MM-DD")
   private Date dateNaissance ;



}
