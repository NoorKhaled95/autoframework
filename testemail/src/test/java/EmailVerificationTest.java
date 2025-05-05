import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import java.io.IOException;

public class EmailVerificationTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Automatically downloads and sets up ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void verifyEmailAndProceedWithTest() throws IOException {
        System.out.println("🔍 Checking if email is received...");

        // Fetch latest email from Mailtrap
        String emailContent = MailtrapAPI.fetchLatestEmail();

        // Assertion: Ensure an email was received
        assertNotNull(emailContent, "❌ No email found in Mailtrap!");

        // Assertion: Check if the email contains expected text (e.g., Verification Code)
        assertTrue(emailContent.contains("Your Verification Code"), "❌ Email content does not match expected text.");
        System.out.println("✅ Verification email received!");

        // Proceed with Selenium test
        driver.get("https://your-website.com/login");

        // Add your Selenium actions here (e.g., enter the verification code from the email)
        // Example:
        // driver.findElement(By.id("verification_code")).sendKeys(extractedCode);

        System.out.println("✅ Selenium test executed successfully.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
