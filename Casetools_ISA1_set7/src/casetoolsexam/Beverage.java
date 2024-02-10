package casetoolsexam;

public class Beverage {

	String type;
	Beverage(String type){
		this.type=type;
	}
	public static void main(String[]args) {
		Beverage tea=new Beverage("hot");
		System.out.println("tea is"+tea.type);
	}
}
