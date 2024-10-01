import java.util.Scanner;
public class inicio {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		//Hacer la multiplicacion de a y b sin usar multiplicacion (Solo Sumas)
		/*int a=32;
		int b=12;
		int c=0;
		
		System.out.println("El resultado es: 384" );
		
		for(int i=0;i<b;i++) {
			c+=a;
		}
		System.out.println(c);*/
		
		System.out.println("Dime el dividendo de la division y lo resolvere usando restas");
		int resta1=teclado.nextInt();
		
		System.out.println("Dime el divisor de la division y lo resolvere usando restas");
		int resta2=teclado.nextInt();
		teclado.close();
		int resultadoresta=0;
		int resto=0;
		for (int k=resta1 ;k>=resta2;) {
			k-=resta2;
			resultadoresta+=1;
			resto=k;
		}
		
		System.out.println("El resultado de la resta es: " + resultadoresta + "Y con resto: " + resto);
		
	}
}
