package problem.solving;

public class Interest {
	private double principal;// principal
	private double interest;// interest
	private double rate;// rate
	private double timeInYears;// timeperiod

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate / 100;
	}

	public double getTimeInYears() {
		return timeInYears;
	}

	public void setTimeInYears(double timeInYears) {
		this.timeInYears = timeInYears;
	}

	public void setTimeInDays(double timeInDays) {
		this.timeInYears = timeInDays / 365;
	}

	public void simpleInterest() {
		interest = principal * rate * timeInYears;

	}

	public void compoundInterest(CompoundInterval compoundInterval) {
		double compoundIntervalMultiplier = compoundInterval
				.getMultiplier(compoundInterval);
		double total = principal
				* Math.pow((1 + (rate / compoundIntervalMultiplier)),
						timeInYears * compoundIntervalMultiplier);
		interest = total - principal;

	}

	public void continousCompoundInterest() {

		interest = principal * Math.exp(rate * timeInYears);

	}
}

enum CompoundInterval {
	YEARLY, HALF_YEARLY, QUARTERLY, MONTHLY;

	public double getMultiplier(CompoundInterval interval) {
		switch (interval) {
		case YEARLY:
			return 1;
		case HALF_YEARLY:
			return 2;
		case QUARTERLY:
			return 4;
		case MONTHLY:
			return 12;
		}
		return 0;
	}
}
