package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExitoHomePage {

  public static final Target BTN_MENU = Target.the("txt").located(By.xpath("//button[@data-fs-menu-container=\"true\"]"));
  public static final Target BTN_DORMITORIO = Target.the("txt").located(By.xpath("//li[contains(@class, 'Link_link-container') and .//p[text()='Dormitorio']]"));
  public static final Target BTN_CAMAS = Target.the("txt").located(By.xpath("//a[@href='/hogar/muebles/camas-y-base-camas']"));
  public static final Target PRODUCTS = Target.the("ProductosAll").located(By.xpath("//ul[@data-fs-product-grid-type=\"hogar\"]/li/article/div[2]/div/button"));
  public static final Target CANTID_PROD = Target.the("CantidadProd").located(By.xpath("//button[@class='QuantitySelectorDefault_plus__1LAkq']"));
}