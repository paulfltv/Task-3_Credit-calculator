public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int annuityPayment12Months = service.calculate(1_000_000, 9.99f, 12);
        System.out.println(annuityPayment12Months);
        int annuityPayment24Months = service.calculate(1_000_000, 9.99f, 24);
        System.out.println(annuityPayment24Months);
        int annuityPayment36Months = service.calculate(1_000_000, 9.99f, 36);
        System.out.println(annuityPayment36Months);
    }
}