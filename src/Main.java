public class Main {
    public static void main(String[] args) {
        int credit_amount = 1_000_000;
        float interest_rate = 9.99f;
        int credit_term = 12;

        float i = interest_rate / 12 / 100;
        i = 0.008325f;
        float i_and_1 = i + 1;
        i_and_1 = 1.008325f;
        System.out.printf(String.valueOf(Math.pow(i_and_1, credit_term)));

        float magnitude = 1.1046032608567087f;

        int annuity_payment = (int) (credit_amount * ((i * magnitude) / (magnitude - 1)));
        System.out.println(annuity_payment);
    }
}