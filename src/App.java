import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Documents\\PT INOVASI DAYA SOLUSI\\Testing\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stg-sob.ids.id/auth/login");

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("ryobranch");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Ryo@1234");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        WebElement menuButton = driver.findElement(By.xpath("//button[@aria-label='open drawer']"));
        menuButton.click();
        Thread.sleep(500);

        WebElement setorKuButton = driver.findElement(By.xpath("//span[contains(text(),'SetorKu')]"));
        setorKuButton.click();

        Thread.sleep(2000);

        WebElement bulkUploadButton = driver.findElement(By.xpath("//span[contains(text(),'Bulk Upload')]"));
        bulkUploadButton.click();

        Thread.sleep(2000);

        WebElement filterButton = driver.findElement(By.xpath("//button[contains(text(),'FILTER')]"));
        filterButton.click();

        Thread.sleep(2000);

        WebElement applyButton = driver.findElement(By.xpath("//button[contains(text(),'APPLY')]"));
        applyButton.click();

        Thread.sleep(2000);

        filterButton.click();

        Thread.sleep(2000);

        WebElement removeFilterButton = driver.findElement(By.xpath("//button[contains(text(),'REMOVE FILTER')]"));
        removeFilterButton.click();

        Thread.sleep(2000);

        WebElement addDataUploadButton = driver.findElement(By.xpath("//button[contains(text(),'ADD DATA UPLOAD')]"));
        addDataUploadButton.click();

        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]"));
        submitButton.click();
        Thread.sleep(2000);

        WebElement cancelButton = driver.findElement(By.xpath("//button[contains(text(),'CANCEL')]"));
        cancelButton.click();

        submitButton.click();

        Thread.sleep(500);

        driver.quit();
    }
}
