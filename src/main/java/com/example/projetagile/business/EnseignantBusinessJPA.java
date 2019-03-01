package com.example.projetagile.business;
import com.example.projetagile.bean.EnseignantEntity;
import com.example.projetagile.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

// impletmentation de classe EnseignantBusinessJPA qui implemente interface EnseignantBusiness et  redifinition des methodes.
@Component
public class EnseignantBusinessJPA implements EnseignantBusiness{

  private EnseignantRepository repos ;

  @Autowired

  public EnseignantBusinessJPA(EnseignantRepository repos) {

    this.repos = repos;
  }

  @Override
  public EnseignantEntity creerEnseignant(EnseignantEntity enseignantACreer) {
    return repos.save(enseignantACreer);
  }



  @Override
  public List<EnseignantEntity> rechercheEnseignantParNom(String nom) {
    List<EnseignantEntity> enseignantRecherche = repos.findByNom(nom);
    return enseignantRecherche;
  }

  @Override
  public List<EnseignantEntity> recupererTousLesEnseignants() {
    return (List<EnseignantEntity>) repos.findAll();
  }
  @Override
  public EnseignantEntity rechercherEnseignantParNo(int no) {
    return repos.findByNoEnseignant(no);
  }

  @Override
  public EnseignantEntity rechercherParEmailUbo(String email)
  {
    return repos.findByEmailUbo(email);
  }

  @Override
  public void supprimerEnseignantByNo(int no) {
    EnseignantEntity e = repos.findByNoEnseignant(no);
    repos.delete(e);
  }




}

