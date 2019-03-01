package com.example.projetagile.bean;
import java.math.BigDecimal;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="UNITE_ENSEIGNEMENT")
@NamedQuery(name="UniteEnseignement.findAll", query="SELECT u FROM UniteEnseignementEntity u")
public class UniteEnseignementEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private UniteEnseignementEntityPK id;

  private String description;

  private String designation;

  @Column(name="NBH_CM")
  private BigDecimal nbhCm;

  @Column(name="NBH_TD")
  private BigDecimal nbhTd;

  @Column(name="NBH_TP")
  private BigDecimal nbhTp;

  private String semestre;

  //bi-directional many-to-one association to ElementConstitutif
  @OneToMany(mappedBy="uniteEnseignement")
  private List<ElementConstitutifEntity> elementConstitutifs;

  //bi-directional many-to-one association to Enseignant
  @ManyToOne
  @JoinColumn(name="NO_ENSEIGNANT")
  private EnseignantEntity enseignant;

  public UniteEnseignementEntity() {
  }

  public UniteEnseignementEntityPK getId() {
    return this.id;
  }

  public void setId(UniteEnseignementEntityPK id) {
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

  public String getSemestre() {
    return this.semestre;
  }

  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }

  public List<ElementConstitutifEntity> getElementConstitutifs() {
    return this.elementConstitutifs;
  }

  public void setElementConstitutifs(List<ElementConstitutifEntity> elementConstitutifs) {
    this.elementConstitutifs = elementConstitutifs;
  }

  public ElementConstitutifEntity addElementConstitutif(ElementConstitutifEntity elementConstitutif) {
    getElementConstitutifs().add(elementConstitutif);
    elementConstitutif.setUniteEnseignement(this);

    return elementConstitutif;
  }

   public ElementConstitutifEntity removeElementConstitutif(ElementConstitutifEntity elementConstitutif) {
    getElementConstitutifs().remove(elementConstitutif);
    elementConstitutif.setUniteEnseignement(null);

    return elementConstitutif;
  }

  public EnseignantEntity getEnseignant() {
    return this.enseignant;
  }

  public void setEnseignant(EnseignantEntity enseignant) {
    this.enseignant = enseignant;
  }


}
