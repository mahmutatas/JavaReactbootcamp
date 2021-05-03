package oopIntro;

public class FootballerManager {
	public void showDetails(Footballer footballers[], FootballersStatistics ftbStatistics[]) {
		for(int i = 0; i < footballers.length; i++)
		{
			System.out.println(footballers[i].name);
		}
		
		for(int i = 0; i < ftbStatistics.length; i++)
		{
			System.out.print(ftbStatistics[i].goals);
			System.out.print("  ");
			System.out.println(ftbStatistics[i].assists);

		}
	}
						
}
