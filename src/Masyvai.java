
public class Masyvai {

	public static void main(String[] args) 
	{		
		int masyvas[] = {1, 15, -7, 6, -1, 0, 2, -4, -3, 11};
		
		System.out.println("Masyvo skaiciu suma: " + skaiciuotiSuma(masyvas));
		
		System.out.println("Masyvo neigiamu skaiciu kiekis: " + skaiciuotiNeigKieki(masyvas));
		
		System.out.println("Masyvo teigiamu skaiciu sandauga: " + skaiciuotiTeigSandauga(masyvas));		

	}
	
	public static int skaiciuotiSuma(int masyvas[])
	{
		int suma=0;
		for(int i = 0; i < masyvas.length; i++)
		{
			suma = suma + masyvas[i];
		}
		return suma;
	}
	
	static int skaiciuotiNeigKieki(int masyvas[])
	{
		int j = 0;
		
		for(int i = 0; i < masyvas.length; i++)
		{
			if(masyvas[i] < 0)
			{
				j++;
			}
		}
		return j;
	}
	
	static int skaiciuotiTeigSandauga(int masyvas[])
	{
		int sandauga = 1;
		
		for(int i = 0; i < masyvas.length; i++)
		{
			if(masyvas[i] > 0)
			{
				sandauga = sandauga * masyvas[i];
			}
		}
		return sandauga;
	}
	

}