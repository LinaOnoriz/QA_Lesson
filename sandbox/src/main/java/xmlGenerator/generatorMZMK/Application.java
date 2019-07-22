package xml-generator.generatorMZMK;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

  FileInputStream fis;
  Properties property = new Properties();

  private UUID guid = UUID.randomUUID();//переменная для хранения GUID
  private String nameTO;//переменная для хранения названия ТО ПФР
  private String requisites;
  private String applicant;
  private String child;
  private String certChild;
  private String certAvailability;
  private String getCert;
  private String attachDoc;
  private String dateCompletion;
  private String specialist;
  private String codeTO;

  public Application() {

    try {
      fis = new FileInputStream("D:\\Dev\\QA_Lesson\\sandbox\\src\\main\\resources\\parameters.properties");
      property.load(new InputStreamReader(fis, "UTF-8"));

      nameTO = property.getProperty("nameTO");//переменная для хранения названия ТО ПФР
      requisites = property.getProperty("requisites");
      applicant = property.getProperty("applicant");
      child = property.getProperty("child");
      certChild = property.getProperty("certChild");
      certAvailability = property.getProperty("certAvailability");
      getCert = property.getProperty("getCert");
      attachDoc = property.getProperty("attachDoc");
      dateCompletion = property.getProperty("dateCompletion");
      specialist = property.getProperty("specialist");
      codeTO = property.getProperty("codeTO");

    } catch (IOException e) {
      System.err.println("ОШИБКА: Файл свойств отсуствует!");
    }
  }





  public RootElement createJavaObjectExample1() {
    RootElement rootElement = new RootElement();
    BodyMZMK body = new BodyMZMK(requisites, nameTO, applicant, child, certChild,
            certAvailability, getCert, attachDoc, dateCompletion, specialist);


    rootElement.setServiceInformation(new ServiceInformation(new Compiler(codeTO, nameTO), guid, new Date(), "2019-22-07"));
    rootElement.setBodyMZMK(body);
    return rootElement;
  }


  public void marshallExample() {
    try {
      JAXBContext context = JAXBContext.newInstance(RootElement.class);
      Marshaller marshaller = context.createMarshaller();
      // устанавливаем флаг для читабельного вывода XML в JAXB
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

      // маршаллинг объекта в файл
      marshaller.marshal(createJavaObjectExample1(), System.out);
    } catch (JAXBException exception) {
      Logger.getLogger(Application.class.getName()).
              log(Level.SEVERE, "marshallExample threw JAXBException", exception);
    }
  }


  public static void main(String[] args) {
    //String filePath = "D:\\Dev\\XMLGenerator\\XMLGenerator\\XML\\test2.xml";
    Application instance = new Application();
    instance.marshallExample();
  }
}
