package com.example.projetagile.controller;
import com.example.projetagile.bean.FormationEntity;
import com.example.projetagile.business.FormationBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// interception des différents URL

@RestController
@RequestMapping("/Formation")

public class FormationController {


  private FormationBusiness business;

  @Autowired
  public FormationController(FormationBusiness business) {
    this.business = business;
  }

  //Récupérer tout les Formations.
  @RequestMapping(method = RequestMethod.GET)
  public List<FormationEntity> recupererToutesLesFormations() {
    return business.recupererToutesLesFormations();
  }

  // Créer Formation .
  @RequestMapping(method = RequestMethod.POST)
  public FormationEntity creerFormation(@RequestBody FormationEntity formationACreer) {
    return business.creerFormation(formationACreer);
  }

  // Mise à jour d'une formation.
  @RequestMapping(method = RequestMethod.PUT)
  public FormationEntity updateFormation(@RequestBody FormationEntity formationAMaj) {
    return business.updateFormation(formationAMaj);
  }

  //Récupérer Formation avec Id
  @RequestMapping(method = RequestMethod.GET, value="/Id/{id}")
  public FormationEntity recupererLaFormationAvecLId(@PathVariable String id) {
    return business.rechercheFormationId(id);
  }

  //Récupérer Formation avec Nom
  @RequestMapping(method = RequestMethod.GET, value="/Nom/{nom}")
  public List<FormationEntity> recupererLaFormationAvecLeNom(@PathVariable String nom) {
    return business.rechercherFormationParNom(nom);
  }

  // Supprimer Formation avec CodeFormation.
  @RequestMapping(method = RequestMethod.DELETE, value="/Supprimer/{id}")
  public String suppFormation(@PathVariable String id) {
    business.supprimerFormationByID(id);
    return "Supprimer avec succeés";
  }

}

