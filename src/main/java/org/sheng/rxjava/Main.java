package org.sheng.rxjava;

import rx.Observable;
import rx.functions.Action1;

/**
 * @author shengxingyue on 2018/7/11 10:37
 */
public class Main {

    public static void main(String[] args) {
        hello("sheng");
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }

        });
    }
}
