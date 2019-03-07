package TestPage;

import Page.LaunchPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLaunchPage extends CommonAPI {

    LaunchPage launchPage;

    @BeforeMethod
    public void init() {
        launchPage = PageFactory.initElements(driver, LaunchPage.class);
    }
    @Test
    public void clickAZ() {
        launchPage.selectTvShowNVerify();
        String Expected = "know your co-host: rashad jennings";
        String Actual = driver.findElement(By.cssSelector("#tier_5 .L001_line_list.s_layouts_lineList.s_resets_oldDom_ul li:nth-child(1) h3.s_fonts_lineListHeader")).getText();
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
}