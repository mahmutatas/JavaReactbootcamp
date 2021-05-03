package oopIntro;

public class Main {

	public static void main(String[] args) {
		Footballer footballer = new Footballer();
		footballer.name = "Aboubakar";
		footballer.playerSalary = 250000;
		footballer.uniformNumber = 14;
		
		Footballer footballer2 = new Footballer();
		footballer2.name = "Gezzal";
		footballer2.playerSalary = 200000;
		footballer2.uniformNumber = 18;
		
		Footballer footballer3 = new Footballer();
		footballer3.name = "Rosier";
		footballer3.playerSalary = 250000;
		footballer3.uniformNumber = 2;
		
		Footballer[] footballers = {footballer, footballer2, footballer3};
		
		
		
		FootballersStatistics ftballerStatistic = new FootballersStatistics();
		ftballerStatistic.name = "Aboubakar";
		ftballerStatistic.goals = 15;
		ftballerStatistic.assists = 5;
		ftballerStatistic.teamName = "Beşiktaş";
		
		FootballersStatistics ftballerStatistic2 = new FootballersStatistics();
		ftballerStatistic2.name = "Gezzal";
		ftballerStatistic2.goals = 4;
		ftballerStatistic2.assists = 14;
		ftballerStatistic2.teamName = "Beşiktaş";
		
		FootballersStatistics ftballerStatistic3 = new FootballersStatistics();
		ftballerStatistic3.name = "Rosier";
		ftballerStatistic3.goals = 2;
		ftballerStatistic3.assists = 4;
		ftballerStatistic3.teamName = "Beşiktaş";
		
		FootballersStatistics[] ftbStatistics0 = {ftballerStatistic, ftballerStatistic2, ftballerStatistic3};

		FootballerManager footballerManager = new FootballerManager();
		footballerManager.showDetails(footballers, ftbStatistics0);
		
	}

}
