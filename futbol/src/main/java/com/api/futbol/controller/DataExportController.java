package com.api.futbol.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.futbol.service.DataExportService;

@RestController
@RequestMapping("/v1/exportData")
public class DataExportController {
    
    private DataExportService dataExportService;

    @Autowired
    public DataExportController(DataExportService dataExportService){
        this.dataExportService = dataExportService;
    }


    @GetMapping("pdf/all")
    public void exportToPdf(HttpServletResponse response){

    }


    @GetMapping("pdf/all")
    public void exportToPdf(HttpServletResponse response, Object data){


    }

}
