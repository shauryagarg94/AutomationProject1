package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_AlertBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://logicnextgen.com/projects/AutomationTestingPractice/alerts.php");
		
		driver.findElement(By.id("SimpleAlerts1")).click();
        Thread.sleep(9000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        Thread.sleep(9000);
        
        driver.findElement(By.id("ConfirmBox1")).click();
        Thread.sleep(9000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
        Thread.sleep(9000);
        
        driver.findElement(By.id("PromptBox1")).click();
        Thread.sleep(9000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Keshav Kapoor");
        alert3.accept();
        Thread.sleep(9000);
	}

}
