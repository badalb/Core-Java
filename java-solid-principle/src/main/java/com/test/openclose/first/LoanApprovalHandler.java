package com.test.openclose.first;

public class LoanApprovalHandler {
	public void approveLoan(PersonalLoanValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}
}
