/*
 * 題目：模擬支付系統的依賴注入
 * 目標
 * 練習 介面、多型、依賴注入
 * 模擬 Spring 的 IoC 概念
 */
package test;

interface PaymentService {

    String pay(int amount);
}

class CreditCardPaymentService implements PaymentService {

    public String pay(int amount) {
        return "用信用卡支付" + amount + "元";
    }
}

class PaypalPaymentService implements PaymentService {

    public String pay(int amount) {
        return "用Paypal支付" + amount + "元";
    }
}

class OrderProcessor {

    private PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(int amount) {
        System.out.println(paymentService.pay(amount));
    }
}

public class learn_002 {

    public static void main(String[] args) {
        PaymentService creditCardService = new CreditCardPaymentService();
        OrderProcessor processor = new OrderProcessor(creditCardService);
        processor.processOrder(100);

        PaymentService PaypalPayService = new PaypalPaymentService();
        OrderProcessor paypal = new OrderProcessor(PaypalPayService);
        paypal.processOrder(200);
    }
}
