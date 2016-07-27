package com.test.openclose.second;

public class LoanApprovalHandler {
	public void approvePersonalLoan(PersonalLoanValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}

	public void approveVehicleLoan(VehicleLoanValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}
	// Method for approving other loans.
}
