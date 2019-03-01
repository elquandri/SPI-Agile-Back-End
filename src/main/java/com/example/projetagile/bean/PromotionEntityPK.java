package com.example.projetagile.bean;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class PromotionEntityPK implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name="ANNEE_UNIVERSITAIRE")
  private String anneeUniversitaire;

  @Column(name="CODE_FORMATION")
  private String codeFormation;

  public PromotionEntityPK() {
  }
  public String getAnneeUniversitaire() {
    return this.anneeUniversitaire;
  }
  public void setAnneeUniversitaire(String anneeUniversitaire) {
    this.anneeUniversitaire = anneeUniversitaire;
  }
  public String getCodeFormation() {
    return this.codeFormation;
  }
  public void setCodeFormation(String codeFormation) {
    this.codeFormation = codeFormation;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof PromotionEntityPK)) {
      return false;
    }
    PromotionEntityPK castOther = (PromotionEntityPK)other;
    return
      this.anneeUniversitaire.equals(castOther.anneeUniversitaire)
        && this.codeFormation.equals(castOther.codeFormation);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.anneeUniversitaire.hashCode();
    hash = hash * prime + this.codeFormation.hashCode();

    return hash;
  }
  public PromotionEntityPK(String anneeUniversitaire, String codeFormation) {
    super();
    this.anneeUniversitaire = anneeUniversitaire;
    this.codeFormation = codeFormation;
  }

}
