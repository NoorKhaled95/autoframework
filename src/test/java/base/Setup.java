package base;

import configs.BrowserOptions;
import configs.pipeline.PipelineConfig;
import configs.testRail.APIException;
import configs.testRail.TestRailManager;
import configs.testdata.CrewDataTemplate;
import configs.testdata.PlanningDataTemplate;
import configs.testdata.TestDataFactory;
import configs.testdata.models.FlowTestData;
import configs.testdata.models.RegistrantData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;


public class Setup {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static PlanningDataTemplate planningTestData;
    public static FlowTestData flowTestData;
    public static RegistrantData registrantTestData;
    public static CrewDataTemplate crewTestData;
    public static JavascriptExecutor javascriptExecutor;
    public static String testCaseId;
    public static String flow;
    public static final TestRailManager testRail = new TestRailManager();


    @Test(priority = 1)
    @Parameters({"language", "branch", "browser", "url", "flow"})
    public void setUpLocalDriver(String language, String branch, String browser, String url, String flow)
            throws Exception {
        Setup.flow = flow;
        planningTestData = TestDataFactory.getTestData(branch, language);
        flowTestData = planningTestData.getFlowTestData(flow);
        registrantTestData = planningTestData.getRegistrantTestData();
        crewTestData = TestDataFactory.getCrewTestData(branch, language);
        initializeLocalDriver(browser, url);
        Assert.assertTrue(true);
    }

    @Test(priority = 1)
    @Parameters({"language", "branch", "browser", "url", "flow"})
    public void setUpRemoteDriver(String language, String branch, String browser, String url, String flow)
            throws Exception {
        Setup.flow = flow;
        planningTestData = TestDataFactory.getTestData(branch, language);
        flowTestData = planningTestData.getFlowTestData(flow);
        registrantTestData = planningTestData.getRegistrantTestData();
        crewTestData = TestDataFactory.getCrewTestData(branch, language);
        initializeRemoteDriver(browser, url);
        Assert.assertTrue(true);
    }


    private void initializeRemoteDriver(String browser,String url) throws IOException, APIException {
        if (PipelineConfig.testRailReport){
            TestRailManager testRailManager = new TestRailManager();
            Go.testRunId = testRailManager.createTestRun("MICEtribe Web V3",1);
        }
        AbstractDriverOptions<?> browserOptions= null;
        String platform = "Windows 10";
        String browserVersion ="126";
        if (browser.equalsIgnoreCase("chrome")){
            //todo browserOptions
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPlatformName(platform);
            chromeOptions.setBrowserVersion(browserVersion);
            browserOptions = chromeOptions;
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setPlatformName(platform);
            firefoxOptions.setBrowserVersion(browserVersion);
            browserOptions = firefoxOptions;
        }
        browserOptions.setCapability("LT:Options", new BrowserOptions().getLambdaTestOptions());
        driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),browserOptions);
        launchDriver(url);
    }

    private void initializeLocalDriver(String browser, String url) throws APIException, IOException {
        if (PipelineConfig.testRailReport){
            TestRailManager testRailManager = new TestRailManager();
            Go.testRunId = testRailManager.createTestRun("MICEtribe Web V3" ,1);
        }
        if (browser.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().capabilities(new BrowserOptions().getChromeOptions(PipelineConfig.isBrowserHeadless,true)).create();
        } else {
            driver= WebDriverManager.firefoxdriver().capabilities(new BrowserOptions().getFirefoxOptions(PipelineConfig.isBrowserHeadless,true)).create();
        }
        launchDriver(url);
    }

    private void launchDriver(String url) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        javascriptExecutor = (JavascriptExecutor) driver;
        Go.initialize(driver, javascriptExecutor, wait);
        Finder.initialize(driver, wait);
        driver.get(url);
        Go.setMainTab();
        driver.manage().window().maximize();
    }
}
