package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//li[.='Dashboard']")
    public WebElement dashboardPageSubTitle;

    public String getProfilDetails(String job){
        return Driver.get().findElement(By.xpath("//div[.='"+job+"']")).getText();
    }
}
