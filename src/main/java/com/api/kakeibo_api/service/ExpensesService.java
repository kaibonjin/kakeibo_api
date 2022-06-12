package com.api.kakeibo_api.service;

import com.api.kakeibo_api.DTO.ExpenseDTO;
import com.api.kakeibo_api.domain.Expense;
import com.api.kakeibo_api.form.ExpenseRequest;
import com.api.kakeibo_api.repo.ExpensesRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExpensesService {
    private final ExpensesRepo expensesRepo;

    public ExpenseDTO saveExpense(ExpenseRequest expenseRequest) {
        log.info("saving Expense into db");
        return new ExpenseDTO(expensesRepo.save(new Expense(expenseRequest)));
    }
}
