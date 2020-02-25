package com.gupaoedu.factorypattern;

public class AliPayFactory implements PayFactory {
    @Override
    public IPay createIPay() {
        return new AliPay();
    }

    @Override
    public ICrossBorderPay createICrossBorderPay() {
        return new AliCrossBorderPay();
    }
}
