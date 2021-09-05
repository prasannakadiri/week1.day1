package week1.day1;

public class CalFactorial {
	//find the factorial of a given number
	//input 5, output is 5*4*3*2*1=120
	
	public static void main(String[] args) {
		int inputnum=5, sum=1;
		for(int i=1;i<=inputnum;i++) {
			sum=i*sum;
		}
		System.out.println("Factorial number for " + inputnum+" "+ "is"+" "+sum);
	}
}
