import java.util.Scanner;
public class Zbirot {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
				Zbir val = new Zbir();
				System.out.println();
			System.out.println("Zbirot e:");
			System.out.println();
	System.out.println("Vnesi prva vrednost: ");
			val.seta(input.nextInt());
	System.out.println("Vnesi vtora vrednost: ");
			val.setb(input.nextInt());
			val.seta(val.geta());
			val.setb(val.getb());
			val.geta();
			val.getb();
			val.getSum();
	System.out.println();
	System.out.print("Zbirot " + val.geta() + "i" + val.getb() + "e" + val.getSum)t

	}

}
