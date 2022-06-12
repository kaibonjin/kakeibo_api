package com.api.kakeibo_api.domain;

import com.api.kakeibo_api.form.ExpenseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data //creates getters and setters for each property
@NoArgsConstructor //TODO: understand what this does
@AllArgsConstructor //TODO: understand what this does
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private int amount;

    private String memo;

    @Column(nullable = false)
    private Date date;

    // TODO add categoryId
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Expense (ExpenseRequest expenseRequest) {
        this.user = ;
        this.amount = expenseRequest.getAmount();
        this.memo = expenseRequest.getMemo();
        this.date = expenseRequest.getDate();
    }
}
