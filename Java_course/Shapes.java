package Java_course;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square{
	
	int width;
	public Square(int width){
		this.width = width;
	}
	public void area(){
		System.out.println(this.width * this.width);
	}
}

class Circle{
	int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public void area(){
		System.out.println(Math.PI * this.radius * this.radius);
	}
}

public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

