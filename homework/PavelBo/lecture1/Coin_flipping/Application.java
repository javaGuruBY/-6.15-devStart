package by.jrr.start;

import by.jrr.start.service.CoinFlippingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger("COIN");
    public static void main(String[] args) {

        CoinFlippingService coinFlipping = new CoinFlippingService();

        log.info("{}",coinFlipping.result(Math.random()));
    }
}
