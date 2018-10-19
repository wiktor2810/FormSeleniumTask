import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTask extends Base {

    @Test
    public void fillingForm(){

        driver.get("http://toolsqa.com/automation-practice-form/");
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Wiktor");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Szymanowski");
        WebElement sexCheckbox = driver.findElement(By.cssSelector("#sex-0"));
        sexCheckbox.click();
        WebElement expCheckbox = driver.findElement(By.cssSelector("#exp-0"));
        expCheckbox.click();
        WebElement date = driver.findElement(By.cssSelector("input[id='datepicker']"));
        date.sendKeys("28.10.1989");
        WebElement profession = driver.findElement(By.cssSelector("#profession-1"));
        profession.click();
        WebElement photo = driver.findElement(By.cssSelector("#photo"));
        photo.sendKeys("C:\\work\\css.png");
        WebElement tool = driver.findElement(By.cssSelector("#tool-0"));
        tool.click();
        WebElement continents = driver.findElement(By.cssSelector("#continents"));
        continents.click();
        WebElement australia = driver.findElement(By.xpath("//*[.='Australia']"));
        australia.click();
        WebElement switchCommand = driver.findElement(By.xpath("//*[.='Switch Commands']"));
        switchCommand.click();
        WebElement buttonSubmit = driver.findElement(By.cssSelector("#submit"));
        buttonSubmit.click();


        WebElement firstName2 = driver.findElement(By.cssSelector("input[name='firstname']"));
        String value = firstName2.getAttribute("value");
        Assert.assertEquals(value, "");


        WebElement sexCheckbox2 = driver.findElement(By.cssSelector("#sex-0"));
        boolean isSexSelected = sexCheckbox2.isSelected();
        Assert.assertEquals(isSexSelected, false);
    }

}
