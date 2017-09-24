import java.util.ArrayList;
public class ProgramRunner
	{
		static ArrayList <Project> TVShows = new ArrayList <Project> ( );
		
		public static void main(String[] args)
			{
				
				
				TVShows.add(new Project("South Park" , "Comedy" , 20));
				TVShows.add(new Project("Simpsons" , "Comedy" , 28));
				TVShows.add(new Project("Famly guy" , "Comedy" , 15));
				TVShows.add(new Project("Grey's Anatomy" , "Drama" , 13));
				TVShows.add(new Project("Futurama" , "Comedy" , 7));
				
				
				printList();
		
			}
		public static void printList(){
			
			for(Project p : TVShows){
			System.out.println(p.getGenre());
			
			}
		}
	}
