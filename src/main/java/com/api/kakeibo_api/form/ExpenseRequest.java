package com.api.kakeibo_api.form;

import lombok.Data;

import java.util.Date;

@Data
public class ExpenseRequest {

    private int amount;
    private String memo;
    private Long userId;
    private Date date;
}
