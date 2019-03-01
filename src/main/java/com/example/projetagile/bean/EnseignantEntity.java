package com.example.projetagile.bean;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name="Enseignant")
@NamedQuery(name="Enseignant.findAll", query="SELECT e FROM Enseignant e")
public class EnseignantEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name="NO_ENSEIGNANT")
  private int noEnseignant;

  private String adresse;


  @Column(name="CODE_POSTAL")
  private String codePostal;

  @Column(name="EMAIL_PERSO")
  private String emailPerso;

  @Column(name="EMAIL_UBO")
  private String emailUbo;

  private String mobile;

  private String nom;

  private String pays;

  private String prenom;

  private String sexe;

  private String telephone;

  @Column(name="TYPE")
  private String type;

  private String ville;

  //bi-directional many-to-one association to ElementConstitutif
  @OneToMany(mappedBy="enseignant")
  @JsonIgnore
  private List<ElementConstitutifEntity> elementConstitutifs;

  //bi-directional many-to-one association to Promotion
  @OneToMany(mappedBy="enseignant")
  @JsonIgnore
  private List<PromotionEntity> promotions;

  //bi-directional many-to-one association to UniteEnseignement
  @OneToMany(mappedBy="enseignant")
  @JsonIgnore
  private List<UniteEnseignementEntity> uniteEnseignements;

  public EnseignantEntity() {
  }

  public long getNoEnseignant() {
    return this.noEnseignant;
  }

  public void setNoEnseignant(int noEnseignant) {
    this.noEnseignant = noEnseignant;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getCodePostal() {
    return this.codePostal;
  }

  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }

  public String getEmailPerso() {
    return this.emailPerso;
  }

  public void setEmailPerso(String emailPerso) {
    this.emailPerso = emailPerso;
  }

  public String getEmailUbo() {
    return this.emailUbo;
  }

  public void setEmailUbo(String emailUbo) {
    this.emailUbo = emailUbo;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPays() {
    return this.pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getSexe() {
    return this.sexe;
  }

  public void setSexe(String sexe) {
    this.sexe = sexe;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public List<ElementConstitutifEntity> getElementConstitutifs() {
    return this.elementConstitutifs;
  }

  public void setElementConstitutifs(List<ElementConstitutifEntity> elementConstitutifs) {
    this.elementConstitutifs = elementConstitutifs;
  }

  public ElementConstitutifEntity addElementConstitutif(ElementConstitutifEntity elementConstitutif) {
    getElementConstitutifs().add(elementConstitutif);
    elementConstitutif.setEnseignant(this);

    return elementConstitutif;
  }

  public ElementConstitutifEntity removeElementConstitutif(ElementConstitutifEntity elementConstitutif) {
    getElementConstitutifs().remove(elementConstitutif);
    elementConstitutif.setEnseignant(null);

    return elementConstitutif;
  }

  public List<PromotionEntity> getPromotions() {
    return this.promotions;
  }

  public void setPromotion(List<PromotionEntity> promotions) {
    this.promotions = promotions;
  }

  public PromotionEntity addPromotion(PromotionEntity promotion) {
    getPromotions().add(promotion);
    promotion.setEnseignant(this);

    return promotion;
  }

  public PromotionEntity removePromotion(PromotionEntity promotion) {
    getPromotions().remove(promotion);
    promotion.setEnseignant(null);

    return promotion;
  }

  public List<UniteEnseignementEntity> getUniteEnseignements() {
    return this.uniteEnseignements;
  }

  public void setUniteEnseignements(List<UniteEnseignementEntity> uniteEnseignements) {
    this.uniteEnseignements = uniteEnseignements;
  }

  public UniteEnseignementEntity addUniteEnseignement(UniteEnseignementEntity uniteEnseignement) {
    getUniteEnseignements().add(uniteEnseignement);
    uniteEnseignement.setEnseignant(this);

    return uniteEnseignement;
  }

  public UniteEnseignementEntity removeUniteEnseignement(UniteEnseignementEntity uniteEnseignement) {
    getUniteEnseignements().remove(uniteEnseignement);
    uniteEnseignement.setEnseignant(null);

    return uniteEnseignement;
  }


}
