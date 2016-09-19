package com.example.clone;

class Cat{
	int j;
	public Cat(int j) {
		// TODO Auto-generated constructor stub
		this.j=j;
	}
}
class Dog implements Cloneable{
	Cat c;
	int i;
	Dog(Cat c,int i){
		this.c=c;
		this.i=i;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ShdowDemo {
	public static void main(String[] args)throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d1 = new Dog(c,10);
		Dog d2 = (Dog)d1.clone();
		d2.i=888;
		//d2.j=999;
		System.out.println(d1.i+" "+ d1.c.j);
	}

}
