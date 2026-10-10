package HospitalManagementSystem.QA_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActionTest extends BaseTest {

    @Test
    public void verifyRightClick() {

        driver.get("https://demoqa.com/buttons");

        WebElement button =
                driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

        actions.contextClick(button).perform();

        WebElement message =
                driver.findElement(By.id("rightClickMessage"));

        Assert.assertTrue(message.isDisplayed());

        System.out.println("Right Click successful!");
    }

    @Test
    public void verifyDoubleClick() {

        driver.get("https://demoqa.com/buttons");

        WebElement button =
                driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        actions.doubleClick(button).perform();

        WebElement message =
                driver.findElement(By.id("doubleClickMessage"));

        Assert.assertTrue(message.isDisplayed());

        System.out.println("Double Click successful!");
    }

    @Test
    public void verifyClickAndHold() {

        driver.get("https://demoqa.com/droppable");

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(source)
               .moveToElement(target)
               .release()
               .perform();

        Assert.assertEquals(target.getText(), "Dropped!");

        System.out.println("Click and Hold successful!");
    }
}
