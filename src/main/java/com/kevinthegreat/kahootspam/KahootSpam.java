package com.kevinthegreat.kahootspam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahootSpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WebDriver driver = new ChromeDriver();
        System.out.println("Enter the number of tabs you want to spawn:");
        int tabs = scanner.nextInt();
        List<Kahoot> kahootTabs = new ArrayList<>(tabs);
        for (int i = 0; i < tabs; i++) {
            kahootTabs.add(new Kahoot(driver));
        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
