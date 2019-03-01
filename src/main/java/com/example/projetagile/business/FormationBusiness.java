package com.example.projetagile.business;
import com.example.projetagile.bean.FormationEntity;
import java.util.List;

// Creation de l'interface FormationBusiness et Déclaration des methodes.
public interface FormationBusiness {
  FormationEntity creerFormation(FormationEntity formationACreer);

  List<FormationEntity> recupererToutesLesFormations();
  List<FormationEntity> rechercherFormationParNom(String nom);
  FormationEntity rechercheFormationId(String id);

  void supprimerFormationByID(String codeFormation);

  FormationEntity updateFormation(FormationEntity formationMaj);

}

