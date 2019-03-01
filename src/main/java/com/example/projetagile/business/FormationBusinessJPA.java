package com.example.projetagile.business;
import com.example.projetagile.bean.FormationEntity;
import com.example.projetagile.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

// impletmentation de classe EnseignantBusinessJPA qui implemente interface EnseignantBusiness et  redifinition des methodes.
@Component
public class FormationBusinessJPA  implements FormationBusiness {

  private FormationRepository repos ;

  @Autowired
  public FormationBusinessJPA(FormationRepository repos) {

    this.repos = repos;
  }

  @Override
  public FormationEntity creerFormation(FormationEntity formationACreer) {
    Date d = new java.util.Date();
    formationACreer.setDebutAccreditation(new java.sql.Timestamp(d.getTime()));
    return repos.save(formationACreer);

  }
  @Override
  public FormationEntity updateFormation(FormationEntity formationMaj) {
    // TODO Auto-generated method stub

    return repos.save(formationMaj);
  }

  @Override
  public List<FormationEntity> rechercherFormationParNom(String nom) {
    return repos.findByNomFormation(nom);
  }

  @Override
  public List<FormationEntity> recupererToutesLesFormations() {
    return (List<FormationEntity>) repos.findAll();
  }

  public FormationEntity rechercheFormationId(String codeFormation) {
    return repos.findByCodeFormation(codeFormation);
  }

  @Override
  public void supprimerFormationByID(String codeFormation) {
    FormationEntity f = repos.findByCodeFormation(codeFormation);
    repos.delete(f);
  }



}