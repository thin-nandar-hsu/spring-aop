package com.demo.dao;

import com.demo.annotation.Logger;
import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component @Logger
public class ReportDao {

    public void save(Report report){

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        System.out.println(report.getClass().getSimpleName()+ "saved.");
    }
}
