package com.demo;

import com.demo.ds.CurrencyType;
import com.demo.service.AlterCurrencyService;
import com.demo.service.CurrencyService;
import com.demo.service.MyCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        CurrencyService currencyService = context.getBean(CurrencyService.class);
        currencyService.changeCurrency(200,1.2);

        AlterCurrencyService alterCurrencyService=context.getBean(AlterCurrencyService.class);
        alterCurrencyService.changeCurrency(500,2.5);


        MyCurrencyService myCurrencyService=context.getBean(MyCurrencyService.class);
        myCurrencyService.changeCurrency();
        myCurrencyService.changeCurrency(1000,2.6);
        myCurrencyService.currencyLongName(CurrencyType.US);
        myCurrencyService.currencyLongName(CurrencyType.EURO);
        myCurrencyService.currencyCountryName(CurrencyType.US);
        try{
            myCurrencyService.currencyCountryName(CurrencyType.EURO);
        }catch (IllegalArgumentException e){
            System.out.println("Exception caught!");
        }
    }
}
