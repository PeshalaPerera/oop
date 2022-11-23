package com.company;

//behaviour
import java.util.ArrayList;
import java.util.List;

class Channel{
   private List <Subscriber> subs=new ArrayList<>();
   private String title;

   public void subscribe(Subscriber sub){
       subs.add(sub);
   }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifyvideo(){
       for(Subscriber sub:subs){
           sub.update();
       }
    }

    public void upload(String title){
       this.title=title;
       notifyvideo();
    }

}

class Subscriber{
        private String name;
        private Channel channel;

        public void update(){
            System.out.println("hi "+name+", Video Uploaded");
        }

    public Subscriber(String name) {
        this.name = name;
    }

    public void Subscribe(Channel ch){
            channel=ch;
        }
        }

public class Observer {

    public static void main(String[] args) {
        Channel oop=new Channel();
        Subscriber s1= new Subscriber("s1");
        Subscriber s2=new Subscriber("s2");
        Subscriber s3=new Subscriber("s3");
        oop.subscribe(s1);
        s1.Subscribe(oop);
        oop.subscribe(s2);
        s2.Subscribe(oop);

        oop.upload("How Observer Works ?");
    }

}
