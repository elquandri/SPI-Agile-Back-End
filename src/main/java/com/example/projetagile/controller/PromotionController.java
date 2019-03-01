package com.example.projetagile.controller;
import com.example.projetagile.bean.PromotionEntity;
import com.example.projetagile.bean.PromotionEntityPK;
import com.example.projetagile.business.PromotionBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// interception des différents URL

@RestController
@RequestMapping("/Promotion")
public class PromotionController {

  private PromotionBusiness business;

  @Autowired
  public PromotionController(PromotionBusiness business) {

    this.business = business;
  }

  //Récupérer tout les Promotions.
  @RequestMapping(method = RequestMethod.GET)
  public List<PromotionEntity> recupererTousLesPromotions() {
    return business.recupererTousLesPromotions();
  }

  // Créer Promotion.
  @RequestMapping(method = RequestMethod.POST)
  public PromotionEntity creerPromotion(@RequestBody PromotionEntity promotiontACreer) {
    return business.creerPromotion(promotiontACreer);

  }

  //Récupérer Promotion avec SiglePromotion.
  @RequestMapping(method = RequestMethod.GET, value="/SiglePromotion/{SiglePromotion}")
  public List<PromotionEntity> recupererPromotionAvecSiglePromo(@PathVariable String SiglePromotion) {
    return business.rechercheSiglePromotion(SiglePromotion);
  }

  //Récupérer Promotion avec ProcessusStage.
  @RequestMapping(method = RequestMethod.GET, value="/ProcessusStage/{processusStage}")
  public PromotionEntity recupererPromotionAvecProcessusStage(@PathVariable String processusStage) {
    return business.rechercherParTypeProcessusStage(processusStage);
  }

  //Récupérer Promotion avec Id(anneUniv,codeFormation).
  @RequestMapping(method = RequestMethod.GET, value="/Id/{anneUniv}/{codeForm}")
  public PromotionEntity recupererPromotionAvecLId(@PathVariable String anneUniv , @PathVariable String codeForm) {
    return business.rechercherPromotionParId(new PromotionEntityPK(anneUniv,codeForm));
  }

  // Supprimer Formation avec avec Id(anneUniv,codeFormation).
  @RequestMapping(method = RequestMethod.DELETE, value="/Supprimer/{codeForm}/{anneUniv}")
  public String suppCandidat(@PathVariable String codeForm , @PathVariable String anneUniv) {
    business.supprimerPromotionByID(new PromotionEntityPK(anneUniv,codeForm));
    return "Spprimer avec succées";
  }

}

