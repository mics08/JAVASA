public class FinancePeriod extends Customer {
    @Override//override to create a new method
    public double calculate_Repayment() {
        double repayment = productPrice / numberOfMonths;
        if (numberOfMonths >= 3) {
            repayment += (productPrice * 0.25) / numberOfMonths;
        }
        return repayment;
    }
}