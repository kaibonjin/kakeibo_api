package com.api.kakeibo_api.dao;

import com.api.kakeibo_api.domain.Expense;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

@ConfigAutowireable
@Dao
public interface ExpenseDao {
  @Insert
  Result<Expense> insertExpense(Expense expense);
}
