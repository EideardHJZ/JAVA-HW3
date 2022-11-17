public class p24{
	public static void main(String[] args) {
		Car55 car1;
		car1 = new Car55();
		car1.setCar(1234,10.5);
		car1.show();
		System.out.println("指變更車號");
		car1.setCar(2321);
		car1.show();
		System.out.println("指變更汽油量");
		car1.setCar(20.5);
		car1.show();
		
	}
}

class Car55
{
	private int num;
	private double gas;
	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油量設為" + gas);
	}
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "將汽油量設為" + gas);
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
}