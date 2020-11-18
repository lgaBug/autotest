package com.lga.login;

import com.sun.org.apache.bcel.internal.generic.Select;
import javafx.scene.control.Alert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AutoLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");// chromedriver服务地址
        WebDriver driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new 的是谷歌的驱动
        String url = "http://www.baidu.com";
        driver.get(url); // 打开指定的网站
        //获取当前浏览器的信息
        System.out.println("Title:" + driver.getTitle());
        System.out.println("currentUrl:" + driver.getCurrentUrl());
        //执行js脚本
        String jString = "alert('122')";
        ((JavascriptExecutor) driver).executeScript(jString);
    }
}
