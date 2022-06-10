package com.api.kakeibo_api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;
    private int amount;
    private String memo;
    private Date date;
}
