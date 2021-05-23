package self.practice.javalearn;


class Calc{
	
	public int add(int ... num) {  // in argument we can give as many arg as we want
		int sum = 0 ;
		for(int i : num) {
			sum +=i;
		}
		return sum;
	}
}

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c = new Calc();
		System.out.println(c.add(2,4,5,7,10));
		
	}

}
