package com.test.limitinfo.domain;

import java.util.List;

public class LimitInfo extends CreditLimit {
	private List<CreditProductLimit> creditProductLimit;

	public List<CreditProductLimit> getCreditProductLimit() {
		return creditProductLimit;
	}

	public void setCreditProductLimit(List<CreditProductLimit> creditProductLimit) {
		this.creditProductLimit = creditProductLimit;
	}

}
