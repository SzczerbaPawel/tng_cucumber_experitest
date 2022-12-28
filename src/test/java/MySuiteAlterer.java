import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import java.util.*;

public class MySuiteAlterer implements IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suites) {
        XmlSuite suite = suites.get(0);
        suite.setName("Szczerba testssuit");



        XmlTest xmlTest = new XmlTest(suite);
        xmlTest.setName("Test01");

        xmlTest.addParameter("step.provider.pkg", "src/test/java/StepDefs");
        xmlTest.addParameter("scenario.file.loc", "src\\test\\resources\\features\\FirstFeature.feature");

        XmlClass xmlClass = new XmlClass();
//        xmlClass.setName("TestRunner");
        xmlClass.setName("com.qmetry.qaf.automation.step.client.gherkin.GherkinScenarioFactory");

        List<XmlClass> xmlClasses = new ArrayList<>();
        xmlClasses.add(xmlClass);

        xmlTest.setClasses(xmlClasses);

        List<XmlTest> tests = new ArrayList<>();
        tests.add(xmlTest);

        suite.setTests(tests);

        System.out.println(suite.toXml());
    }
}