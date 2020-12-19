public class Main {
    public static void main(String[] args) {
        int CreditAmount = 1_000_000;
        float InterestRate = 9.99f;
        int CreditTerm = 12;
        float i = InterestRate / 12 / 100;
        i = 0.008325f;
        float I = (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i) * (1 + i);
        I = 1.104604f;
        float AnnuityPayment = (i * I / (I - 1)) * CreditAmount;
        System.out.println(AnnuityPayment);
    }
}
