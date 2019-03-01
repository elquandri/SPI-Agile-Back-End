package com.example.projetagile.repository;
import com.example.projetagile.bean.EnseignantEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

// implementation de l'interface EnseignantRepository  qui extend CrudRepository qui contient des
// methode de recherche de suppresion et d'ajout ... prédéfinit dans CrudRepository exemple findBy{NomColonne}
// avec la premiére lettre de colonne en gras.

public interface EnseignantRepository extends CrudRepository<EnseignantEntity, String> {

  List<EnseignantEntity> findByNom(String nom);
  EnseignantEntity findByNoEnseignant(int no);
  EnseignantEntity findByEmailUbo(String email);

}
