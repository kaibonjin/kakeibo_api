package com.api.kakeibo_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExpensesController {

    @PostMapping("/expenses")
    public void getExpenses () {

    }
}
