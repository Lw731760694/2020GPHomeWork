package com.gupaoedu.factorypattern;

import java.math.BigDecimal;

public class AliPay implements IPay {
    @Override
    public void payMoney(BigDecimal money) {
        System.out.println("阿里支付金额："+money.toString());
    }
}
