package by.jrr.start.service;

import by.jrr.start.bean.Coin;

public class CoinFlippingService {

    public String result(double random) {
        if ((random * 2) < 1) return Coin.oneSideCoin;
        else if ((random * 2) > 1) return Coin.secondSideCoin;
        else if ((random * 2) == 1) return Coin.edgeCoin;
        else return null;
    }

}
