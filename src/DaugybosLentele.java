import java.util.Scanner;
public class DaugybosLentele {

	public static void main(String[] args) {
		int skaicius, atsakymas;
		System.out.println("Iveskite skaiciu ir paspauskite Enter:");
		Scanner S = new Scanner(System.in);
		skaicius = S.nextInt();
		
		for(int i = 1; i <=19; i++){
			atsakymas = skaicius * i;
			System.out.println(skaicius + "*" + i + "=" + atsakymas);
		}

	}

}
