public class p26{
	public static void main(String[] args) {
		Car5678 car1;
		car1 = new Car5678();
		car1.show();
		}
}

class Car5678
{
	private int num;
	private double gas;	
	public Car5678() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}