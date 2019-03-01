package com.example.projetagile.controller;
import com.example.projetagile.bean.CandidatEntity;
import com.example.projetagile.business.CandidatBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// interception des différents URL

@RestController
@RequestMapping("/Candidat")
public class CandidatController {
  private CandidatBusiness business ;

  @Autowired
  public CandidatController(CandidatBusiness business) {
    this.business = business;
  }

  //Récupérer tout les Candidats.

  @RequestMapping(method = RequestMethod.GET)
  public List<CandidatEntity> recupererCandidat() {
    return business.recupererCandidat();
  }


  // Créer Candidat .

  @RequestMapping(method = RequestMethod.POST)
  public CandidatEntity creerCandidat(@RequestBody CandidatEntity candidat) {
    return business.creerCandidat(candidat);
  }

  // Récupérer Candidat avec Numéro
  @RequestMapping(method = RequestMethod.GET, value="/Id/{No}")
  public CandidatEntity recupererCandidatAvecNo(@PathVariable String No) {
    return business.rechercherCandidatNo(No);
  }

  //Récupérer Candidat avec Nom
  @RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
  public List<CandidatEntity> recupererCandidatAvecLeNom(@PathVariable String nom) {
    return business.rechercheNom(nom);
  }

  // Récupérer Candidat par Université.
  @RequestMapping(method = RequestMethod.GET, value="/UnivOrigine/{univOrigine}")
  public List<CandidatEntity> recupererCandidatAveUnivOrigin(@PathVariable String univOrigine) {
    return business.rechercheUniversiteOrigine(univOrigine);
  }

  // Supprimer Candidat avec Id
  @RequestMapping(method = RequestMethod.DELETE, value="/Supprimer/{No}")
  public String suppCandidat(@PathVariable String No) {
    CandidatEntity candidat = recupererCandidatAvecNo (No);
    business.supprimerCandidat(candidat);
    return "Spprimer Avec Succées";
  }


}
