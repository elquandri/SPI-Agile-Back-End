package com.example.projetagile.bean;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="ELEMENT_CONSTITUTIF")
@NamedQuery(name="ElementConstitutif.findAll", query="SELECT e FROM ElementConstitutifEntity e")
public class ElementConstitutifEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private ElementConstitutifEntityPK id;

  private String description;

  private String designation;

  @Column(name="NBH_CM")
  private BigDecimal nbhCm;

  @Column(name="NBH_TD")
  private BigDecimal nbhTd;

  @Column(name="NBH_TP")
  private BigDecimal nbhTp;

  //bi-directional many-to-one association to Enseignant
  @ManyToOne
  @JoinColumn(name="NO_ENSEIGNANT")
  private EnseignantEntity enseignant;

  //bi-directional many-to-one association to UniteEnseignement
  @ManyToOne
  @JoinColumns({
    @JoinColumn(name="CODE_FORMATION", referencedColumnName="CODE_FORMATION", insertable=false, updatable=false),
    @JoinColumn(name="CODE_UE", referencedColumnName="CODE_UE", insertable=false, updatable=false)
  })
  private UniteEnseignementEntity uniteEnseignement;

  public ElementConstitutifEntity() {
  }

  public ElementConstitutifEntityPK getId() {
    return this.id;
  }

  public void setId(ElementConstitutifEntityPK id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDesignation() {
    return this.designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public BigDecimal getNbhCm() {
    return this.nbhCm;
  }

  public void setNbhCm(BigDecimal nbhCm) {
    this.nbhCm = nbhCm;
  }

  public BigDecimal getNbhTd() {
    return this.nbhTd;
  }

  public void setNbhTd(BigDecimal nbhTd) {
    this.nbhTd = nbhTd;
  }

  public BigDecimal getNbhTp() {
    return this.nbhTp;
  }

  public void setNbhTp(BigDecimal nbhTp) {
    this.nbhTp = nbhTp;
  }

  public EnseignantEntity getEnseignant() {
    return this.enseignant;
  }

  public void setEnseignant(EnseignantEntity enseignant) {
    this.enseignant = enseignant;
  }

  public UniteEnseignementEntity getUniteEnseignement() {
    return this.uniteEnseignement;
  }

  public void setUniteEnseignement(UniteEnseignementEntity uniteEnseignement) {
    this.uniteEnseignement = uniteEnseignement;
  }

}