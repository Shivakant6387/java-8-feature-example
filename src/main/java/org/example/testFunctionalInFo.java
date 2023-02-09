package org.example;

public class testFunctionalInFo {
    public static void main(String[] args) {
        Anonymous anonymous=a-> System.out.println("hello functional interface"+a);
       // anonymous.show();
        anonymous.print(33);
        anonymous.display();
        Anonymous.print();
    }
}
