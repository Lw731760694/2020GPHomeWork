package com.gupaoedu.factorypattern;

import java.math.BigDecimal;

public class WeiChatPay implements IPay {
    @Override
    public void payMoney(BigDecimal money) {
        System.out.println("微信支付金额："+money.toString());
    }
}
