package com.example.projetagile.business;
import com.example.projetagile.bean.PromotionEntity;
import com.example.projetagile.bean.PromotionEntityPK;
import java.util.List;
// Creation de l'interface PromotionBusiness et Déclaration des methodes.

public interface PromotionBusiness {

  PromotionEntity creerPromotion(PromotionEntity promotiontACreer);
  List<PromotionEntity> recupererTousLesPromotions();
  List<PromotionEntity> rechercheSiglePromotion(String siglePromotion);
   PromotionEntity rechercherParTypeProcessusStage(String processusStage);
  PromotionEntity rechercherPromotionParId(PromotionEntityPK PK );
  void supprimerPromotionByID(PromotionEntityPK PK);

}