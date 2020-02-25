package com.gupaoedu.factorypattern;

import java.math.BigDecimal;

public class AliCrossBorderPay implements ICrossBorderPay {
    @Override
    public void crossBorderPay(BigDecimal money) {
        System.out.println("阿里境外支付"+money.toString());
    }
}
