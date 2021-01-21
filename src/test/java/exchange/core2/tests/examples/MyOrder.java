package exchange.core2.tests.examples;

import lombok.Value;

@Value
public class MyOrder {
    OrderData data;
    String channel;
    String event;
}
