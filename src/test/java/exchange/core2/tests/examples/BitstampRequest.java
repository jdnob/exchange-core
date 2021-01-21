package exchange.core2.tests.examples;

import lombok.Value;

@Value
public class BitstampRequest {
    String event;
    Data data;
}
