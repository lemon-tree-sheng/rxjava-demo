package org.sheng.rxjava.sample;

import rx.Observable;
import rx.Subscription;

/**
 * @author shengxingyue on 2018/7/16 10:25
 */
public class Sample_01 {
    public static void main(String[] args) {
        Subscription subscription = Observable.just("hello world").subscribe(System.out::println);
//        subscription.unsubscribe(); 解除订阅
    }
}
