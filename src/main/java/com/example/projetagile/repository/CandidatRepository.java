package com.example.projetagile.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.projetagile.bean.CandidatEntity;
import java.util.List;

// implementation de l'interface CandidatRepository  qui extend CrudRepository qui contient des
// methode de recherche de suppresion et d'ajout ... prédéfinit dans CrudRepository exemple findBy{NomColonne}
// avec la premiére lettre de colonne en gras.

public interface CandidatRepository extends CrudRepository<CandidatEntity, String> {

  List<CandidatEntity> findByNom(String nom);

  List<CandidatEntity> findByUniversiteOrigine(String universiteOrigine);

  CandidatEntity findByNoCandidat(String noCandidat);

}

