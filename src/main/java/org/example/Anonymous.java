package org.example;
@FunctionalInterface
public interface Anonymous {
   // public void show();
    void print(int x);
    static void print(){
        System.out.println("this is static method");
    }
    default  void display(){
        System.out.println("this is default method ");
    }
    //public void pm(int x);
}
