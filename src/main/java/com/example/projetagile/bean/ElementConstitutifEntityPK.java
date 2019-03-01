package com.example.projetagile.bean;
import java.io.Serializable;
import javax.persistence.*;
@Embeddable
public class ElementConstitutifEntityPK implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name="CODE_FORMATION", insertable=false, updatable=false)
  private String codeFormation;

  @Column(name="CODE_UE", insertable=false, updatable=false)
  private String codeUe;

  @Column(name="CODE_EC")
  private String codeEc;

  public ElementConstitutifEntityPK() {
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
  public String getCodeEc() {
    return this.codeEc;
  }
  public void setCodeEc(String codeEc) {
    this.codeEc = codeEc;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof ElementConstitutifEntityPK)) {
      return false;
    }
    ElementConstitutifEntityPK castOther = (ElementConstitutifEntityPK)other;
    return
      this.codeFormation.equals(castOther.codeFormation)
        && this.codeUe.equals(castOther.codeUe)
        && this.codeEc.equals(castOther.codeEc);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.codeFormation.hashCode();
    hash = hash * prime + this.codeUe.hashCode();
    hash = hash * prime + this.codeEc.hashCode();

    return hash;
  }
}
