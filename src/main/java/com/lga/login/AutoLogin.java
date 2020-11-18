package com.lga.login;

import com.sun.org.apache.bcel.internal.generic.Select;
import javafx.scene.control.Alert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AutoLogin {

    private static final String DRIVER_PATH = "D:\\webDriver\\chromedriver.exe";
    private static final String WEBSITE_URL  = "http://www.baidu.com";


    public static void main(String[] args) throws InterruptedException {

        // 1.chromedriver服务地址
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        // 2.新建一个WebDriver 的对象，但是new 的是谷歌的驱动
        WebDriver driver = new ChromeDriver();
        // 3.打开指定的网站
        driver.get(WEBSITE_URL);

        // 2.打开百度首页
        driver.get("https://www.baidu.com");
        // 3.获取输入框，输入selenium
        driver.findElement(By.id("kw")).sendKeys("selenium");
        // 4.获取“百度一下”按钮，进行搜索
        driver.findElement(By.id("su")).click();

        //执行js脚本
        //String jString = "alert('122')";
        //((JavascriptExecutor) driver).executeScript(jString);

        //休眠3秒钟
        //TimeUnit.SECONDS.sleep(3);
        //退出浏览器
        //driver.quit();
    }
}
