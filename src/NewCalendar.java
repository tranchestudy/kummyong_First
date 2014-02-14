
public class NewCalendar {

	public static void main(String[] args) {
		//month = 3, week = 4, day = 11
		int month = 12;
		int week = 4;
		int days = 7;
		
		printCalendar(month, week, days);
	}
	
	private static void printCalendar(int month, int week, int days) {
		for(int day=1; day <= month * days; day++){
						
			if(day % week == 0)
			{
				System.out.print(day%days == 0 ? days : day%days);
				System.out.println();
				continue;
			}
			
			if(day % days == 0){
				System.out.println(days);
				
				for(int tab = 0; tab < day % week; tab++)
					System.out.print("\t");
				continue;
			}
			
			System.out.print(day%days + "\t");
		}
	}
}