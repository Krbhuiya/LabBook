package lab9.exercise2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceInterface s = (str)->{
			return str.replace("", " ").trim();
		};
		System.out.println(s.Test("ABC"));
	}

}
