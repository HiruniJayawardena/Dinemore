package lk.ijse.dinemore.queue;

import java.util.ArrayList;

public class MyQueue {
    private int queue;
    private ArrayList<Queue>observerList=new ArrayList<>();
    public void addQueue(Queue queue){
        observerList.add(queue);
    }
    public void removeQueue(Queue queue){
        observerList.remove(queue);
    }
    public void setQueue(int queue){
        if(this.queue!=queue){
            this.queue=queue;
            notifyObservers();
        }
    }
    public void notifyObservers(){
        for ( Queue observer : observerList) {
            observer.update(queue);
        }
    }
}
