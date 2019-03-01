package com.example.projetagile.controller;
import com.example.projetagile.bean.EnseignantEntity;
import com.example.projetagile.business.EnseignantBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// interception des différents URL

@RestController
@RequestMapping("/Enseignant")
public class EnseignantController {


  private EnseignantBusiness bussiness ;

  @Autowired
  public EnseignantController(EnseignantBusiness bussiness) {
    this.bussiness = bussiness;
  }

  //Récupérer tout les Enseignants.
  @RequestMapping(method = RequestMethod.GET)
  public List<EnseignantEntity> recupererTousLesEnseignants() {
    return bussiness.recupererTousLesEnseignants();
  }

  // Créer Enseignant .
  @RequestMapping(method = RequestMethod.POST)
  public EnseignantEntity creerEnseignant(@RequestBody EnseignantEntity enseignantACreer) {
    return bussiness.creerEnseignant(enseignantACreer);
  }

  // Récupérer Enseignant avec Numéro.
  @RequestMapping(method = RequestMethod.DELETE, value="/Supprimer/{noEnseignant}")
  public String suppEnseignant(@PathVariable int noEnseignant) {
    bussiness.supprimerEnseignantByNo(noEnseignant);
    return "Spprimer avec succées";
  }

  //Récupérer Candidat avec Nom
  @RequestMapping(method = RequestMethod.GET, value="/Nom/{nom}")
  public List<EnseignantEntity> recupererEnseignantNom(@PathVariable String nom) {
    return bussiness.rechercheEnseignantParNom(nom);
  }

  // Supprimer Enseignant avec Id.
  @RequestMapping(method = RequestMethod.GET, value="/NoEn/{noEnseignant}")
  public EnseignantEntity recupererEnseignantNo(@PathVariable int noEnseignant) {
    return bussiness.rechercherEnseignantParNo(noEnseignant);
  }

  // Récupérer Enseignant par EmailPersonel.
  @RequestMapping(method = RequestMethod.GET, value="/EmailUbo/{email}")
  public EnseignantEntity recupererEnseignantEmailUbo(@PathVariable String email) {
    return bussiness.rechercherParEmailUbo(email);
  }
}