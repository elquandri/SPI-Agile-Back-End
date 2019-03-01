package com.example.projetagile.business;
import com.example.projetagile.bean.EnseignantEntity;
import java.util.List;

// Creation de l'interface EnseignantBusiness et Déclaration des methodes.
public interface EnseignantBusiness {

  EnseignantEntity creerEnseignant(EnseignantEntity enseignantACreer);

  List<EnseignantEntity> rechercheEnseignantParNom(String nom);

  List<EnseignantEntity> recupererTousLesEnseignants();

  EnseignantEntity rechercherEnseignantParNo(int no);

  void supprimerEnseignantByNo(int no);

  EnseignantEntity rechercherParEmailUbo(String email);
}
