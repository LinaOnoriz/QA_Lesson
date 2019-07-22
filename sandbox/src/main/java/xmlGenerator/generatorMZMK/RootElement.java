package xml-generator.generatorMZMK;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "bodyMZMK", "serviceInformation" })
@XmlRootElement(name = "ЭДПФР")
public class RootElement {
  private ru.stqa.pft.sandbox.BodyMZMK bodyMZMK; //тег МЗМК
  private ServiceInformation serviceInformation; // тег "Служебная информация"

  @XmlElement(name = "МЗМК")
  public BodyMZMK getBodyMZMK() {
    return bodyMZMK;
  }

  public void setBodyMZMK(BodyMZMK bodyMZMK) {
    this.bodyMZMK = bodyMZMK;
  }

  @XmlElement(name = "СлужебнаяИнформация")
  public ServiceInformation getServiceInformation() {
    return serviceInformation;
  }

  public void setServiceInformation(ServiceInformation serviceInformation) {
    this.serviceInformation = serviceInformation;
  }
}