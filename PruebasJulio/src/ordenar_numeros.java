import java.util.Scanner;

public class ordenar_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame 3 numero y los ordenare de mayor a menor");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		if (a > b && b > c) {
			System.out.println("Los numeros ordenados quedarian asi: " + a + "," + b + "," + c);
		}else if (a > b && b < c) {
			System.out.println("Los numeros ordenados quedarian asi: " + a + "," + c + "," + b);
		}else if (a < b && a > c) {
			System.out.println("Los numeros ordenados quedarian asi: " + b + "," + a + "," + c);
		}else if (a < c && b > c) {
			System.out.println("Los numeros ordenados quedarian asi: " + b + "," + c + "," + a);
		}else if (c > b && b > a) {
			System.out.println("Los numeros ordenados quedarian asi: " + c + "," + b + "," + a);
		}else {
			System.out.println("Los numeros ordenados quedarian asi: " + c + "," + a+ "," + b);
		}
		

	}

}
