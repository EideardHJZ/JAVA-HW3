public class p14 {
	public static void main(String[] args) {
		Car7 car1;
		car1 = new Car7();
		car1.setnum(1234);
		car1.setgas(20.5);
	}
}
class Car7
{
	int num;
	double gas;	
	void setnum(int n)
	{
		num = n;
		System.out.println("將車號設為" + num);
	}
	void setgas(double i)
	{
		gas = i;
		System.out.println("將汽油量設為" + gas);		
	}
}