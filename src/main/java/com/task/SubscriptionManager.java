package com.task;

import java.util.ArrayList;

public class SubscriptionManager {
    private ArrayList<Subscription> subscriptions;

    public void notifySubscribers(){
        for(Subscription subscriber : subscriptions){
            subscriber.notifyDevice();
        }
    }

    public void unregister(Subscription subscription){
        if(subscriptions.contains(subscription)){
            subscriptions.remove(subscription);
            System.out.println("Subscription successfully removed");
        }
    }
    public void register(Subscription subscription){
        if(!subscriptions.contains(subscription)){
            subscriptions.add(subscription);
            System.out.println("Subscription successfully added");
        }
    }
}
