public class p17 {
	public static void main(String[] args) {
		Car9 car1;
		car1 = new Car9();
		car1.setnumgas(1234,20.5);
		int numb = car1.getNum();
		double gass = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是" + numb + "汽油量是" + gass);	
	}
}

class Car9
{
	int num;
	double gas;	
	int getNum()
	{
		System.out.println("調查車號");
		return num;	
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;	
	}
	void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+"油量設為"+gas);
			
	}
	
}