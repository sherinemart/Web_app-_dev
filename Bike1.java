
class Bike1 extends Vehicle
{
 final int speed=150;

void display()
{
speed=80;
System.out.println(speed);
}

public static void main(String args[])
{
 Bike1 b=new Bike1();
 b.display();
// System.out.println(b.speed);
}

}