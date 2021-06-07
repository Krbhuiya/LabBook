package lab9.exercise1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerInterface p = (x,y)->{ return (int)Math.pow(x,y);};
		System.out.println(p.test(3, 4));
	}

}
