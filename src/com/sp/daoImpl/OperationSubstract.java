package com.sp.daoImpl;

import com.sp.dao.Strategy;

public class OperationSubstract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}