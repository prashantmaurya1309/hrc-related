package self.practice.javalearn;


class Printer{
	
	public void print(Number i) {
		System.out.println(i +" u'r number");
	}
}

public class WraperAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p = new Printer();
		p.print(2.45);
	}

}
