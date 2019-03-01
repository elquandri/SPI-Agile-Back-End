package com.example.projetagile.business;
import java.util.List;
import com.example.projetagile.bean.CandidatEntity;

// Creation de l'interface Candidat et Déclaration des methodes.
public interface CandidatBusiness {
  CandidatEntity creerCandidat(CandidatEntity candidat);
  List<CandidatEntity> recupererCandidat();
  void supprimerCandidat(CandidatEntity candidat);
  List<CandidatEntity> rechercheNom(String nom);
  List<CandidatEntity> rechercheUniversiteOrigine(String UnivOrigine);
  CandidatEntity rechercherCandidatNo(String No);

}
