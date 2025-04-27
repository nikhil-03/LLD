package org.example;

public enum Money {
   FIFTY(50),
   HUNDRED(100),
   FIVE_HUNDRED(500),
    ;
   public int value;
    Money(int value) {
        this.value=value;
    }
}
