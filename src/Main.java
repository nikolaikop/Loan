public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        String result = String.format("%.0f", service.calculate(1000000, 1));
        String result1 = String.format("%.0f", service.calculate(1000000, 2));
        String result2 = String.format("%.0f", service.calculate(1000000, 3));
        System.out.println("Ежемесячный платеж составит " + result);
        System.out.println("Ежемесячный платеж составит " + result1);
        System.out.println("Ежемесячный платеж составит " + result2);
    }
}
