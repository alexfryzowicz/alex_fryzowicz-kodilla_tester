//package com.kodilla.selenium.allegro;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.List;
//
//public class AllegroTestingApp {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://allegro.pl");
//
//
//        WebElement closeAlert = driver.findElement(By.cssSelector("div._9f0v0._jkrtd.mpof_ki_s > button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_wn.m7er_56_m"));
//        closeAlert.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("#dialog-content"))));
//
//        WebElement inputField = driver.findElement(By.cssSelector("form > input"));
//        inputField.sendKeys("Mavic mini");
//        inputField.submit();
//        Thread.sleep(2000);
//        WebElement categoryCombo = driver.findElement(By.cssSelector("div > select"));
//        Select categorySelect = new Select(categoryCombo);
//        categorySelect.selectByIndex(3);
//
//        WebElement button = driver.findElement(By.cssSelector("button[data-role='search-button']"));
//        button.click();
//
//       List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
//       for (WebElement e : elements){
//           System.out.println(e.getText());
//       }
//
//    }
//}

//package com.kodilla.selenium.allegro;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.List;
//
//public class AllegroTestingApp {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://allegro.pl");
//
//
//        WebElement closeAlert = driver.findElement(By.cssSelector("div._9f0v0._jkrtd.mpof_ki_s > button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_wn.m7er_56_m"));
//        closeAlert.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("#dialog-content"))));
//
//        WebElement inputField = driver.findElement(By.cssSelector("form > input"));
//        inputField.sendKeys("Mavic mini");
//        inputField.submit();
//        Thread.sleep(2000);
//        WebElement categoryCombo = driver.findElement(By.cssSelector("div > select"));
//        Select categorySelect = new Select(categoryCombo);
//        categorySelect.selectByIndex(3);
//
//        WebElement button = driver.findElement(By.cssSelector("button[data-role='search-button']"));
//        button.click();
//
//        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
//        for (WebElement e : elements){
//            System.out.println(e.getText());
//        }
//
//    }
}