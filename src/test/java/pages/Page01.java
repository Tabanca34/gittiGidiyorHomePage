package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Random;

public class Page01 {
    public Page01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@title='Giriş Yap']")
    public WebElement girisYap1;
    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    public WebElement girisYap2;
    //Login Page olucak
    @FindBy(name = "kullanici")
    public WebElement emailAddressTextBox;
    @FindBy(id = "L-PasswordField")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//input[@title='Giriş Yap']")
    public WebElement girisYap;
    @FindBy(xpath = "//input[@placeholder='Keşfetmeye Bak']")
    public WebElement arama;
    @FindBy(xpath= "(//a[@href='/arama/?k=bilgisayar&sf=2'])[1]")
    public WebElement nextPageButton;

    @FindBy(xpath = "(//h3[@class='product-title '])[6]")
    public WebElement secilenUrun;

    @FindBy(xpath ="(//h3[@class='product-title '])[6]")
    public WebElement urunlerListesi;

    @FindBy(xpath = "(//button[@id='add-to-basket'])")
    public  WebElement sepeteEkle;

    @FindBy(xpath = "(//div[@id='sp-price-lowPrice'])[1]")
    public WebElement beklenenFiyat;

    @FindBy(xpath = "product-specs-quantity")
    public WebElement sepettekıFiyat;

    @FindBy(linkText = "Sepete Git")
    public WebElement sepeteGit;

    @FindBy(xpath ="//div[@class='header-cart-container robot-header-cart-container hidden']" )
    public WebElement sepetİsareti;

    @FindBy(linkText ="(//select[@class='amount'])[2]")
    public WebElement urunAdeti;

    @FindBy(linkText ="(//a[@class='btn-delete btn-update-item'])[1]")
    public WebElement silinenÜrünler;




    public static void selectRandomFromList(List<WebElement> elementList) {
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(elementList.size() - 1);
        elementList.get(optionIndex).click();

    }

    public static void saveDataInFile(String fileName, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(data);
            writer.close();
        } catch (Exception e) {
        }

    }
}
