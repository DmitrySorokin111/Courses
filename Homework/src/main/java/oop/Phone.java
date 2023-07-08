package oop;
import java.util.ArrayList;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static ArrayList<String> numbers = new ArrayList<String>();
    Phone(String number, String model, double weight){
        this.number = number;
        numbers.add(number);
        this.model = model;
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        numbers.add(number);
        this.model = model;
        this.weight = 0.5;
    }
    Phone(){
        this.number = "00000000000";
        numbers.add(number);
        this.model = "IPhone 14";
        this.weight = 0.5;
    }
    public void receiveCall(String name){
        System.out.printf("Звонит %s%n", name);
    }
    public void receiveCall(String name, String number){
        System.out.printf("Звонит %s: %s%n", name, number);
    }
    public String getNumber(){
        return this.number;
    }
    public static void sendMessage(){
        for (String e: numbers) {
            System.out.println(e);
        }
    }
    public String toString(){
        System.out.printf("Номер: %s, модель: %s, вес: %f.%n",
                           this.number, this.model, this.weight);
        return null;
    }
}
