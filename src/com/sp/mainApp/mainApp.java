package com.sp.mainApp;

import com.sp.daoImpl.OperationAdd;
import com.sp.daoImpl.OperationMultiply;
import com.sp.daoImpl.OperationSubstract;
import com.sp.model.Context;

public class mainApp {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
