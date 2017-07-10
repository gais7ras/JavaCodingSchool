
public class Laboras1 {

	public static void main(String[] args) {
		
		int masyvas[] = {3, -2, 14, -7, -10, 6, 8, -4, 0, 1};
		
		double atsakymas = skaiciuotiVidurki(masyvas);
		skaiciuotiPapildoma(atsakymas);

	}
	
	static double skaiciuotiVidurki(int masyvas[])
	{		
		double suma = 0;
		
		for(int i=0; i < masyvas.length; i++)
		{
			suma = suma + masyvas[i];
		}
		
		return suma/masyvas.length;
	}
	
	static void skaiciuotiPapildoma(double vidurkis)
	{
		if(vidurkis < 5)
		{
			System.out.println("Vidurkis = " + vidurkis + " + 5 = " + (vidurkis + 5));
		}
		
		else if(vidurkis == 5)
		{
			System.out.println("Vidurkis = " + vidurkis + " + 1 = " + (vidurkis + 1));
		}
		
		else
			
			System.out.println("Vidurkis = " + vidurkis + " - 5 = " + (vidurkis - 5));		
		
	}

}
