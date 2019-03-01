package com.example.projetagile.business;
import com.example.projetagile.bean.PromotionEntity;
import com.example.projetagile.bean.PromotionEntityPK;
import com.example.projetagile.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
// impletmentation de classe PromotionBusinessJPA qui implemente interface PromotionBusiness et  redifinition des methodes.

@Component
public class PromotionBusinessJPA   implements  PromotionBusiness{

  private PromotionRepository repos ;


  @Autowired
  public PromotionBusinessJPA(PromotionRepository repos) {

    this.repos = repos;
  }

  @Override
  public PromotionEntity creerPromotion(PromotionEntity promotiontACreer) {
    return repos.save(promotiontACreer);
  }



  public PromotionEntity rechercherParTypeProcessusStage(String processusStage)
  {
    PromotionEntity promoRecherche = repos.findByProcessusStage(processusStage);
    return promoRecherche;


  }

  @Override
  public List<PromotionEntity> recupererTousLesPromotions() {
    return (List<PromotionEntity>) repos.findAll();
  }

  @Override
  public List<PromotionEntity> rechercheSiglePromotion(String siglePromotion) {
    List<PromotionEntity> promoRecherche = repos.findBySiglePromotion(siglePromotion);
    return promoRecherche;
  }

  @Override
  public PromotionEntity rechercherPromotionParId(PromotionEntityPK PK) {
    return repos.findById(PK).orElse(null);
  }
  @Override
  public void supprimerPromotionByID(PromotionEntityPK promotionASuppPK) {

    repos.deleteById(promotionASuppPK);
  }
}

