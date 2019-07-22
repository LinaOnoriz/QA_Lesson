package xml-generator.generatorMZMK;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"requisites", "nameTO", "applicant", "child",
        "certChild", "certAvailability", "getCert", "attachDoc", "dateCompletion", "specialist"})
public class BodyMZMK {
  private String requisites;
  private String nameTO;
  private String applicant;
  private String child;
  private String certChild;
  private String certAvailability;
  private String getCert;
  private String attachDoc;
  private String dateCompletion;
  private String specialist;

  public BodyMZMK(String requisites, String nameTO, String applicant, String child,
                  String certChild, String certAvailability, String getCert, String attachDoc,
                  String dateCompletion, String specialist) {
    this.requisites = requisites;
    this.nameTO = nameTO;
    this.applicant = applicant;
    this.child = child;
    this.certChild = certChild;
    this.certAvailability = certAvailability;
    this.getCert = getCert;
    this.attachDoc = attachDoc;
    this.dateCompletion = dateCompletion;
    this.specialist = specialist;
  }

  @XmlElement(name = "Реквизиты")
  public String getRequisites() {
    return requisites;
  }

  public void setRequisites(String requisites) {
    this.requisites = requisites;
  }

  @XmlElement(name = "НаименованиеТОПФР")
  public String getNameTO() {
    return nameTO;
  }

  public void setNameTO(String nameTO) {
    this.nameTO = nameTO;
  }

  @XmlElement(name = "Заявитель")
  public String getApplicant() {
    return applicant;
  }

  public void setApplicant(String applicant) {
    this.applicant = applicant;
  }

  @XmlElement(name = "Дети")
  public String getChild() {
    return child;
  }

  public void setChild(String child) {
    this.child = child;
  }

  @XmlElement(name = "СертифицируемыйРебенок")
  public String getCertChild() {
    return certChild;
  }

  public void setCertChild(String certChild) {
    this.certChild = certChild;
  }

  @XmlElement(name = "НаличиеСертификата")
  public String getCertAvailability() {
    return certAvailability;
  }

  public void setCertAvailability(String certAvailability) {
    this.certAvailability = certAvailability;
  }

  @XmlElement(name = "ПолучениеСертификата")
  public String getGetCert() {
    return getCert;
  }

  public void setGetCert(String getCert) {
    this.getCert = getCert;
  }

  @XmlElement(name = "ПрилагаемыеДокументы")
  public String getAttachDoc() {
    return attachDoc;
  }

  public void setAttachDoc(String attachDoc) {
    this.attachDoc = attachDoc;
  }

  @XmlElement(name = "ДатаЗаполнения")
  public String getDateCompletion() {
    return dateCompletion;
  }

  public void setDateCompletion(String dateCompletion) {
    this.dateCompletion = dateCompletion;
  }

  @XmlElement(name = "Специалист")
  public String getSpecialist() {
    return specialist;
  }

  public void setSpecialist(String specialist) {
    this.specialist = specialist;
  }
}
