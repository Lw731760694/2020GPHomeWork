package com.gupaoedu.factorypattern;

public interface PayFactory {

    IPay createIPay();

    ICrossBorderPay createICrossBorderPay();
}
