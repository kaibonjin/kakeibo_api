package com.api.kakeibo_api.controller;

import com.api.kakeibo_api.domain.Expense;
import com.api.kakeibo_api.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor //Usually needs a constructor without this annotation
public class ExpensesController {
    private final ExpensesService expensesService;

    @PostMapping("/expenses")
    public ResponseEntity<Expense> getExpenses (@RequestBody(required = true)Expense expenseRequest) {
        return ResponseEntity.ok(expensesService.saveExpense(expenseRequest));
    }
}
