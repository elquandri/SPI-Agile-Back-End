package com.example.projetagile.repository;
import com.example.projetagile.bean.PromotionEntity;
import com.example.projetagile.bean.PromotionEntityPK;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

// implementation de l'interface EnseignantRepository  qui extend CrudRepository qui contient des
// methode de recherche de suppresion et d'ajout ... prédéfinit dans CrudRepository exemple findBy{NomColonne}
// avec la premiére lettre de colonne en gras.

public interface PromotionRepository extends CrudRepository<PromotionEntity, PromotionEntityPK>  {
  List<PromotionEntity> findBySiglePromotion(String siglePromotion);
  PromotionEntity  findByProcessusStage(String processusStage);
}