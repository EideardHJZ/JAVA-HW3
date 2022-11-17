
public class P_9 {

	public static void main(String[] args) {
		Car4 car1;
		car1 = new Car4();
		car1.num = 1234;
		car1.gas = 20.5;

	}

}
class Car4
{
	int num;
	double gas;
	void show()
	{
		System.out.println("car1車號為" + num);
		System.out.println("car1油量為" + gas);
	}
}