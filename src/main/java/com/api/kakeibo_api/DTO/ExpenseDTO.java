package com.api.kakeibo_api.DTO;

import com.api.kakeibo_api.domain.Expense;
import lombok.Data;

import java.util.Date;

@Data
public class ExpenseDTO {
    private int amount;
    private String memo;
    private Long userId;
    private Date date;

    public ExpenseDTO(Expense expense) {
        this.amount = expense.getAmount();
        this.memo = expense.getMemo();
        this.userId = expense.getUser().getId();
        this.date = expense.getDate();
    }
}
