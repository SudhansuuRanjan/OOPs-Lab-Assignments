package com.sudhanshu;

public class StaticExample {
    static class CounterStatic{
        static int count = 0;
        void Counter1(){
            count++;
            System.out.println(count);
        }

        public static void main(String[] args) {
            CounterStatic c1 = new CounterStatic();
            CounterStatic c2 = new CounterStatic();
            CounterStatic c3 = new CounterStatic();
            c1.Counter1();
            c2.Counter1();
            c3.Counter1();

        }
    }
}
