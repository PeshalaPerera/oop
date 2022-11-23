package com.company;

//Creational
 interface phone{
     void call();
        }

class nokia implements phone{

    @Override
    public void call() {
        System.out.println("Nokia calling");
    }
}


class samsung implements phone{
    @Override
    public void call() {
        System.out.println("Samsung calling");
    }
}

class xiomi implements phone{
    @Override
    public void call() {
        System.out.println("Xiomi calling");
    }
}

class iphone implements phone{
    @Override
    public void call() {
        System.out.println("iphone calling");
    }
}

class mobilefactory{
     public static phone getphone(String phonename){
         if (phonename == "Nokia") {
             return new nokia();
         }
         else if (phonename == "samsung") {
             return new samsung();
         }
         else if (phonename == "xiomi") {
             return new xiomi();
         }
         else if (phonename == "iphone") {
             return new iphone();
         }

         else{ return null;}

     }
}

public class Factory {
    public static void main(String[] args) {
        phone phn= mobilefactory.getphone("iphone");
        phn.call();

    }


}
