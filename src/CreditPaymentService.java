public class CreditPaymentService {

    public double calculate(int amount, int years) {
        double percent = 9.99 / 100 / 12;
        years = years * 12;
        double summary = amount * (percent + percent / ((Math.pow(1 + percent, years)) - 1));
        return summary;
    }
}
