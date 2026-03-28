package com.MethodOverriding;

class Animal
{
	public void sound()
	{
		System.out.println("Animal sound");
	}
}

class Dog extends Animal
{   
	@Override
	public void sound()
	{
		System.out.println("Bow Bowwww");
	}
}

class Cat extends Animal
{   
	@Override
	public void sound()
	{
		System.out.println("Meow Meowwwww");
	}
}

public class AnimalDriver {
public static void main(String[] args)
{
	Animal a=new Animal();
	a.sound();//Animal sound
	Dog d=new Dog();
	d.sound();//Bow Bowww
	Cat c=new Cat();
	c.sound();//Meow Meowwww
}
}
