package xml-generator.generatorMZMK;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.UUID;

@XmlType(propOrder = { "guid", "dateTime", "compiler", "appDate" }, name = "person")
public class ServiceInformation {

  private UUID guid; //GUID заявления
  private Date dateTime; // дата и время формирования электронного документа
  private Compiler compiler; // составитель ПФР (код ТО и название)
  private String appDate;//дата подачи заявления

  public ServiceInformation(Compiler compiler, UUID guid, Date date, String appDate) {
    this.compiler = compiler;
    this.guid = guid;
    this.dateTime = date;
    this.appDate = appDate;
  }

  @XmlElement(name = "СоставительПФР")
  public Compiler getCompiler() {
    return compiler;
  }

  public void setCompiler(Compiler compiler) {
    this.compiler = compiler;
  }

  @XmlElement(name = "GUID")
  public UUID getGuid() {
    return guid;
  }

  public void setGuid(UUID guid) {
    this.guid = guid;
  }

  @XmlElement(name = "ДатаВремя")
  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  @XmlElement(name = "ДатаПодачи")
  public String getAppDate() {
    return appDate;
  }

  public void setAppDate(String appDate) {
    this.appDate = appDate;
  }

}
