package com.github.fabriciojso.githubtests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CadastroTest {

    private static String CHROMEDRIVER_LOCATION = "./chromedriver";

    private static int scId = 0;

    WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            CHROMEDRIVER_LOCATION = CHROMEDRIVER_LOCATION + ".exe";
        }
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
    }

    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();

        //chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.close();
    }

    @Test
    public void testRealizarCadastro() {
        driver.get("https://github.com/join");
        System.out.println(System.getProperty("os.name"));
    }

}
