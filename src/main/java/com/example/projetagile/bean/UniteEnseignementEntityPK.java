package com.example.projetagile.bean;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class UniteEnseignementEntityPK implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name="CODE_FORMATION")
  private String codeFormation;

  @Column(name="CODE_UE")
  private String codeUe;

  public UniteEnseignementEntityPK() {
  }
  public String getCodeFormation() {
    return this.codeFormation;
  }
  public void setCodeFormation(String codeFormation) {
    this.codeFormation = codeFormation;
  }
  public String getCodeUe() {
    return this.codeUe;
  }
  public void setCodeUe(String codeUe) {
    this.codeUe = codeUe;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof UniteEnseignementEntityPK)) {
      return false;
    }
    UniteEnseignementEntityPK castOther = (UniteEnseignementEntityPK)other;
    return
      this.codeFormation.equals(castOther.codeFormation)
        && this.codeUe.equals(castOther.codeUe);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.codeFormation.hashCode();
    hash = hash * prime + this.codeUe.hashCode();

    return hash;
  }
}
