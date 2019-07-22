package xml

-generator.generatorMZMK;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"codeTO", "nameTO"})
public class Compiler {

  private String codeTO;
  private String nameTO;

  public Compiler(String codeTO, String nameTO) {
    this.codeTO = codeTO;
    this.nameTO = nameTO;
  }


  @XmlElement(name = "Код")
  public String getCodeTO() {
    return codeTO;
  }

  public void setCodeTO(String codeTO) {
    this.codeTO = codeTO;
  }

  @XmlElement(name = "Наименование")
  public String getNameTO() {
    return nameTO;
  }

  public void setNameTO(String nameTO) {
    this.nameTO = nameTO;
  }
}
