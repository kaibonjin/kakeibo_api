package com.api.kakeibo_api.repo;

import com.api.kakeibo_api.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepo extends JpaRepository<Expense, Long> {
}
