package com.api.kakeibo_api.dao;

import com.api.kakeibo_api.entity.ExpenseEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface ExpenseDao {
  @Insert
  int insertExpense(ExpenseEntity expenseEntity);
}
