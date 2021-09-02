import java.util.*;
import java.io.*;
import java.lang.*;
public class Dog 
{
    public int age;
    public String name,owner,breed;

    public Dog() {
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(int age, String name, String owner, String breed) {
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.breed = breed;
    }


    public static void main(String args[]) {
        // cai nay nhap xuat java ne
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        myObj.close();
        //het nhap xuat ne
        //oop ne
        //dong dau là tạo object
        Dog dog = new Dog(12,"HuyVu","Kaiser","Husky");
        //tạo object rỗng nè
        Dog doggo = new Dog();
        doggo.age = 12;
        doggo.name = "NotHuyVu";
        doggo.owner = "Me";
        doggo.breed = "PhanThiet";
        String doggogo = "Name: " + doggo.name + "\nAge: " + doggo.age;
        String doggy = "Name: " + dog.name + "\nAge: " + dog.age;
        System.out.println(doggy);
        System.out.println(doggogo);
    }
}