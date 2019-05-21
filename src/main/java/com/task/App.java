package com.task;

public class App {

    public static void main(String args[]){
        
        SubscriptionManager subManager = new SubscriptionManager ();
        Game lotto = new Game("lotto");
        Game bingo = new Game("bingo");
        Subscription sub1 = new Subscription(bingo, new IOSDevice("A"));
        Subscription sub2 = new Subscription(lotto, new AndroidDevice("B"));
        Subscription sub3 = new Subscription(bingo, new WindowsPhoneDevice("C"));
        Subscription sub4 = new Subscription(lotto, new BlackberryDevice("D"));
        Subscription sub5 = new Subscription(bingo, new BlackberryDevice("E"));
        subManager.register(sub1);
        subManager.register(sub2);
        subManager.register(sub3);
        subManager.register(sub4);
        subManager.register(sub5);
        lotto.play();
        bingo.play();
        subManager.notifySubscribers();
        lotto.play();
        bingo.play();
        subManager.notifySubscribers();

    }
}
