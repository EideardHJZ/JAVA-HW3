public class p15 {
	public static void main(String[] args) {
		Car8 car1;
		car1 = new Car8();		
		int num=1234;
		double gas=20.5;	
		car1.setNumGas(num,gas);
	}
}

class Car8
{
	int num;
	double gas;
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "將汽油量設為" + gas);
				
	}
	void show() {
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
}