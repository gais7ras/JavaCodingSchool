import java.util.Scanner;
public class DaugybosLentele {

	public static void main(String[] args) {
		int skaicius, atsakymas;
		
		System.out.println("Iveskite skaiciu ir paspauskite Enter:");
		Scanner S = new Scanner(System.in);
		skaicius = S.nextInt();
		
		for(int i = 1; i <=21; i++){
			atsakymas = skaicius * i;
			System.out.println(skaicius + "*" + i + "=" + atsakymas);
			
			
			
		}
		System.out.println("Salyginis uzdavinys");
		System.out.println("Iveskite skaiciu");
		skaicius = S.nextInt();
		
		if(skaicius < 50){
			System.out.println(skaicius + " < 50");
		}
		else if(skaicius == 50){
			System.out.println("50");
		}
		else System.out.println("Daugiau uz pem");
	}

}
