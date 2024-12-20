package com.co.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsuladoPage {
    public static final Target TXT_TITLE= Target.the(("txt"))
            .located(By.xpath("//div[contains(text(),'Comunícate con las oficinas consulares')]"));

    public static final Target INPUT_OFICINA = Target.the("input oficina")
            .located(By.xpath("//input[@id='txtSearch']"));

    public static final Target BTN_SEARCH = Target.the("btn search")
            .located(By.xpath("//body[1]/form[1]/div[8]/div[3]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]"));

    public static final Target TXT_RESULTADO = Target.the("txt")
            .located(By.xpath("//span[@id='dialogTitleSpan']"));
}
