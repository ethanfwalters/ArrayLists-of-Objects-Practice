import java.util.ArrayList;
import java.util.Collections;
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
				
				for(Project p : TVShows){
					int origonal = p.getNumberOfSeasonsAired();
					
					origonal++;
					p.setNumberOfSeasonsAired(origonal);
					}
				
				System.out.println();
				
				printList();
				
				// 10
				ArrayList <Integer>  titleLength = new ArrayList <Integer> ( );
				
				for(int i = 0 ; i < TVShows.size(); i++){
					String title = TVShows.get(i).getTitle();
					
					int titleLengthZero = title.length();
					
					titleLength.add(titleLengthZero);
				}
				
				int largestTitle = Collections.max(titleLength);
				
				for(Project p : TVShows){
					String titleName = p.getTitle();
					int titleLength0 = titleName.length();
					
					if(titleLength0 == largestTitle){
						TVShows.remove(p);
					}
				}
				System.out.println();
				printList();
				
				String firstTitle = TVShows.get(0).getTitle();
				
				firstTitle = "Something else";
				
				TVShows.get(0).setTitle(firstTitle);
				
				System.out.println();
				printList();
				
		
			}
		public static void printList(){
			
			for(Project p : TVShows){
			System.out.print(p.getTitle() + ", ");
			System.out.print(p.getGenre() + ", ");
			System.out.print(p.getNumberOfSeasonsAired() + " ");
			System.out.println();
			}
		}
	}
