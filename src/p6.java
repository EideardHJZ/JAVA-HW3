
public class p6 {
public static void main (String [] args) {
	Car222 car1;
	car1 = new Car222();
	car1.num = 1234;
	car1.gas = 20.5;
	System.out.println("車號為:"+car1.num);
	System.out.println("汽油量為:"+car1.gas);
	

}
}
class Car222{
	int num;
	double gas;
}

