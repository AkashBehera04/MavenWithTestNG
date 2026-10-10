package HospitalManagementSystem.QA_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void verifyDragAndDrop() {

        driver.get("https://demoqa.com/droppable");

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, target).perform();

        String actualText = target.getText();

        Assert.assertEquals(actualText, "Dropped!");

        System.out.println("Drag and Drop successful!");
    }
}

//driver.get() website kholta hai.
//findElement() draggable box aur target box ko locate karta hai.
//dragAndDrop() ek box ko doosre par drop karta hai.
//Assert.assertEquals() result verify karta hai.