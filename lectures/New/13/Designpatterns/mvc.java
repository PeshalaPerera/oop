package com.company;
class Dog{
    public String name;
   public int Age;

    public Dog(String name, int age) {
        this.name = name;
        Age = age;
    }

    public void show(){
        System.out.println("Woof woof");
    }
}

class DogShow{
    public void PrintDog(String name,int age){
        System.out.println("Dog is "+name+" and age "+age);
    }
}

class DogContoller{
    private Dog model;
    private DogShow view;

    public DogContoller(Dog model, DogShow view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.name;
    }

    public void setName(String name) {
        model.name = name;
    }

    public int getAge() {
        return model.Age;
    }

    public void setAge(int age) {
        model.Age = age;
    }

    public void updateView(){
        view.PrintDog(model.name,model.Age);
    }
}

public class mvc {
    public static void main(String[] args) {
            Dog dg=new Dog("Bullet",5);
            DogShow sh=new DogShow();
             DogContoller ctrl=new DogContoller(dg,sh);
             ctrl.updateView();

    }
}
