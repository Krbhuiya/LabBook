package lab9.exercise4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInterface i = ()->{
			
			return new Test();
		};
		i.test().setTestId(1001);
		System.out.println(i.test().getTestId());
	}
}
