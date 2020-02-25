package com.gupaoedu.factorypattern;

import java.math.BigDecimal;

public class WeChatCrossBorderPay implements ICrossBorderPay {
    @Override
    public void crossBorderPay(BigDecimal money) {
        System.out.println("微信境外支付"+money.toString());
    }
}
