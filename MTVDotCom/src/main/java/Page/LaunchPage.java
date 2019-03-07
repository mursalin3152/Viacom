package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class LaunchPage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@class='logo']//span[@class='icon']")
    public static WebElement launchMTV;
    @FindBy(how = How.CSS, using = "ul.main_nav li:nth-child(1)")
    public static WebElement shows;
    @FindBy(how = How.CSS, using = ".column a[href*='shows']")
    public static WebElement showAToZ;
    @FindBy(how = How.CSS, using = ".L001_line_list li:nth-child(2) .s_fonts_lineListHeader")
    public static WebElement selectTvShow;
    @FindBy(how = How.CSS, using = ".S001_line_list_item .s_fonts_lineListHeader")
    public static WebElement tvShowName;
    @FindBy(how = How.CSS, using = "#tier_5 .L001_line_list li:nth-child(1) .s_fonts_lineListHeader")
    public static WebElement clipTitle;
    @FindBy(how = How.CSS, using ="#tier_5 .L001_line_list.s_layouts_lineList.s_resets_oldDom_ul li:nth-child(1) h3.s_fonts_lineListHeader")
    public static WebElement latestEpisode;

    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void goToAZ() {
        mouseHoverByCSS(shows);
        showAToZ.click();
    }

    public void clickOnCatFish(){
     selectTvShow.click();
    }
   public String getClipTitle(){
        String title = clipTitle.getText();
        return title;
   }
    public String getTitleOfLatesEpizode(){
        String title = latestEpisode.getText();
        return title;
    }
    public void selectTvShowNVerify(){
        goToAZ();
        clickOnCatFish();
        String latest = getTitleOfLatesEpizode();
        System.out.println(latest);


    }
}
