package exchange.core2.tests.examples;

import lombok.Value;

@Value
public class OrderData {
    long id;
    String id_str;
    int order_type;
    String datetime;
    String microtimestamp;
    double amount;
    String amount_str;
    double price;
    String price_str;
}
