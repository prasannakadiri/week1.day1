package week1.day1;

public class ChkPrimeNum {

	public static void main(String[] args) {
		// int number = 15;
		String ListofPN = " ";
		String NotPn = " ";

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {

				ListofPN = ListofPN + " " + i;

				// System.out.println(ListofPN + " " + "is not a Prime Number");

			} else

			{
				NotPn = NotPn + " " + i;

				// System.out.println(NotPn + " " + "These are Prime Number");

			}

		}
		System.out.println(" Printing Prime Numbers From 1 to 20 ");
		System.out.println(NotPn + " " + "These are Prime Numbers");
		System.out.println(ListofPN + " " + "These are not Prime Numbers");

	}

}