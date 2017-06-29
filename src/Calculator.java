import java.util.Scanner;

/*Programa skaiciuotuvas
*1. Vartotojas iveda 2 skaicius ir operacijos zenkla (+ - / *)
*2. Pagal ivesta zenkla atliekama operacija
*3. Jeigu ivedama kita operacija isvesti, kad operacija neatliekama
*4. Jei dalyba is 0, isvesti kad dalyba negalima
*5. Vartotojas atlikes operacija, gali nuspresti ar testi darba
*6. Atsakyme po kablelio 2 skaitmenys
*7. Parasyti su switch
*8. Panaudoti funkcijas: 
* a) funkcija grazinanti reiksme su parametrais
* b) funkcija grazinanti be parametru
* c) negrazinanti su parametrais
* d) negrazinanti reiksmes be parametru
*/

// IF

/*public class Calculator {

	public static void main(String[] args) {
		System.out.println("Skaiciuotuvas");
		
		double skaicius1, skaicius2, atsakymas;
		String operand = "T";
		
		while(operand.equals("T")){
		
			System.out.println("Iveskite pirmaji skaiciu");
			Scanner S = new Scanner(System.in);
			skaicius1 = S.nextDouble();
			
			System.out.println("Iveskite antraji skaiciu");
			skaicius2 = S.nextDouble();
			
			System.out.println("Iveskite aritmetini simboli");
			operand = S.next();
					
			if(operand.equals("+")){
				atsakymas = skaicius1 + skaicius2;
				System.out.println(skaicius1 + " + " + skaicius2 + " = " + atsakymas );
			}
			else if(operand.equals("-")){
				atsakymas = skaicius1 - skaicius2;
				System.out.println(skaicius1 + " - " + skaicius2 + " = " + atsakymas);
			}
			else if(operand.equals("*")){
				atsakymas = skaicius1 * skaicius2;
				System.out.println(skaicius1 + " * " + skaicius2 + " = " + atsakymas);
			}
			else if(operand.equals("/" )){
				if(skaicius2 != 0){
				atsakymas = skaicius1 / skaicius2;
				System.out.println(skaicius1 + " / " + skaicius2 + " = " + atsakymas);
				}
				else System.out.println("Dalyba is nulio negalima");			
			}
			else System.out.println("Ivedete neteisinga aritmetini simboli");
		
		
		System.out.println("Jei norite testi darba iveskite 'T', jei norite baigti iveskite 'N'");
		operand = S.next();
	
	}
}
}
*/

// SWITCH

/*public class Calculator {

	public static void main(String[] args) {
		System.out.println("Skaiciuotuvas");
		
		double skaicius1, skaicius2;
		char symbol = 'T';
		
		while(symbol == 'T')
		{
		
			System.out.println("Iveskite pirmaji skaiciu");
			Scanner S = new Scanner(System.in);
			skaicius1 = S.nextDouble();
			
			System.out.println("Iveskite antraji skaiciu");
			skaicius2 = S.nextDouble();
			
			System.out.println("Iveskite aritmetini simboli");
			symbol = S.next().charAt(0);
			
			switch(symbol){
			
				case '+': System.out.println(skaicius1 + " + " + skaicius2 + " = " + skaicius1 + skaicius2 );
					break;
					
				case '-': System.out.println(skaicius1 + " - " + skaicius2 + " = " + (skaicius1 - skaicius2) );
					break;
					
				case '*': System.out.println(skaicius1 + " * " + skaicius2 + " = " + skaicius1 * skaicius2);
					break;
					
				case '/': 
					if(skaicius2 !=0){ System.out.println(skaicius1 + " / " + skaicius2 + " = " + skaicius1/skaicius2);					
				} else 
					System.out.println("Dalyba is nulio negalima");
					break;
					
				default: System.out.println("Ivedete neteisinga aritmetini simboli");
					break;
			}
					
		System.out.println("Jei norite testi darba iveskite 'T', jei norite baigti iveskite 'N'");
		symbol = S.next().charAt(0);
	
	}
	}
}
*/

// METHODS

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Skaiciuotuvas");
		
		double skaicius1, skaicius2;
		char symbol = 'T';
		
		while(symbol == 'T')
		{
		
			System.out.println("Iveskite pirmaji skaiciu");
			Scanner S = new Scanner(System.in);
			skaicius1 = S.nextDouble();
			
			System.out.println("Iveskite antraji skaiciu");
			skaicius2 = S.nextDouble();
			
			System.out.println("Iveskite aritmetini simboli");
			symbol = S.next().charAt(0);
						
			
			switch(symbol){
			
				case '+': System.out.println(skaicius1 + " + " + skaicius2 + " = " + sudeti(skaicius1, skaicius2) );
					break;
					
				case '-': atimti(skaicius1, skaicius2);
					break;
					
				case '*': System.out.println(skaicius1 + " * " + skaicius2 + " = " + dauginti());
					break;
					
				case '/': 
					if(skaicius2 !=0){ System.out.println(skaicius1 + " / " + skaicius2 + " = " + dalinti(skaicius1, skaicius2));					
				} else 
					System.out.println("Dalyba is nulio negalima");
					break;
					
				default: System.out.println("Ivedete neteisinga aritmetini simboli");
					break;
			}
					
		System.out.println("Jei norite testi darba iveskite 'T', jei norite baigti iveskite 'N'");
		symbol = S.next().charAt(0);
	
	}
	}
	static double sudeti(double skaicius1, double skaicius2)
	{
		return skaicius1 + skaicius2;
	}
		
	// Nieko negrazina su parametrais
	static void atimti(double skaicius1, double skaicius2)
	{
		double atsakymas = skaicius1 - skaicius2;
		System.out.println(skaicius1 + " - " + skaicius2 + " = " + atsakymas);
	}
	
	//Grazina nepaduodant parametru
	
	static double dauginti()
	{
		System.out.println("Iveskite pirmaji skaiciu");
		Scanner S = new Scanner(System.in);
		double skaicius1 = S.nextDouble();
		
		System.out.println("Iveskite antraji skaiciu");
		double skaicius2 = S.nextDouble();
		return skaicius1 * skaicius2;
	}
	// Negrazina ir nepaduodant parametru
	static void dalinti()
	{
		System.out.println("Iveskite pirmaji skaiciu");
		Scanner S = new Scanner(System.in);
		double skaicius1 = S.nextDouble();
		
		System.out.println("Iveskite antraji skaiciu");
		double skaicius2 = S.nextDouble();
		
		double atsakymas = skaicius1/skaicius2;
		System.out.println(skaicius1 + " - " + skaicius2 + " = " + atsakymas);
		
		
		
	}
}
