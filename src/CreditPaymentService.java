public class CreditPaymentService {
    public int calculate(int creditAmount, float interestRate, int creditTerm) {
    creditAmount = 1_000_000;
    interestRate = 9.99f;
    float i = interestRate / 12 / 100;
    float annuityCoefficient = i + 1;
    int annuityPayment;
    annuityPayment = (int) (creditAmount * (i * (Math.pow(annuityCoefficient, creditTerm)) / (Math.pow(annuityCoefficient, creditTerm) - 1)));
    return annuityPayment;
    }
}