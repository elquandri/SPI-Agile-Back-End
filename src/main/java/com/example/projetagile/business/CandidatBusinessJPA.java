package com.example.projetagile.business;
import com.example.projetagile.bean.CandidatEntity;
import com.example.projetagile.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
// impletmentation de classe CandidatBusinessJPA qui implemente interface CandidatBusiness et  redifinition des methodes.
@Component
  public class CandidatBusinessJPA implements CandidatBusiness {

    private CandidatRepository candidatRepos ;

    @Autowired

    public CandidatBusinessJPA(CandidatRepository repos) {

      this.candidatRepos = repos;
    }

    @Override
    public CandidatEntity creerCandidat(CandidatEntity candidat) {
      return candidatRepos.save(candidat);
    }

    @Override
    public void supprimerCandidat(CandidatEntity candidat) {
      // TODO Auto-generated method stub
      candidatRepos.delete(candidat);
    }

    @Override
    public List<CandidatEntity> rechercheNom(String nom) {
      // TODO Auto-generated method stub
      List<CandidatEntity> candidatRecherche = candidatRepos.findByNom(nom);
      return candidatRecherche;

    }

    @Override
    public List<CandidatEntity> rechercheUniversiteOrigine(String UnivOrigine) {
      // TODO Auto-generated method stub
      List<CandidatEntity> candidatRecherche = candidatRepos.findByUniversiteOrigine(UnivOrigine);
      return candidatRecherche;
    }

    @Override
    public List<CandidatEntity> recupererCandidat() {
      return (List<CandidatEntity>) candidatRepos.findAll();
    }
    @Override
    public CandidatEntity rechercherCandidatNo(String No) {
      return candidatRepos.findByNoCandidat(No);
    }

  }


