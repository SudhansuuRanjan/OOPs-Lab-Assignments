package com.assignment5;


class rectangle{
    protected int length;
    protected int breadth;
    rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class perimeter extends rectangle{
    perimeter(int length, int breadth) {
        super(length, breadth);
    }

    void getPerimeter(){
        System.out.println("Perimeter of Rectangle : " + 2 * (length + breadth) + " units");
    }
}
class area extends rectangle{
    area(int length, int breadth) {
        super(length, breadth);
    }

    void getArea(){
        System.out.println("Area of Rectangle : " + length * breadth + " sq units");
    }
}

public class question2 {
    public static void main(String[] args) {
         perimeter p1 = new perimeter(12 , 43);
         area a1 = new area(12 , 43);
         p1.getPerimeter();
         a1.getArea();
    }
}
