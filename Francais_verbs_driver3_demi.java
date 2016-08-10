import java.util.Scanner;
import java.io.File;
import java.util.Random; 
	// Not compiled yet
	public class Francais_verbs_driver3_demi{
		public static void main(String[]args){
		File Verbs = new File("French/Verbs.txt");
		Francais_verbs[] VerbList = new Francais_verbs[7]; 
		Scanner scan = new Scanner(Verbs);
		String[] VerbLoader = new String[7];
		//makes
		for(int x = 0;x<63;x+7){
			for(int y = 0;y<7;y++){
				VerbLoader[y] = scan.nextLine();
			}
			for(int z = 0;z<7;z++){
			Francais_verbs[z] VerbList = new Francais_verbs(VerbLoader[0],VerbLoader[1],VerbLoader[2],VerbLoader[3],VerbLoader[4],VerbLoader[5],VerbLoader[6]);
			}
		}
		//Deletes Verbloader String array
		for(int x = 0;x<63;x+7){
			for(int y = 0;y<7;y++){
				VerbLoader[y] = null
			}
		}
		System.gc();
		int rand = new Random.nextInt(6);
		int rand1 = new Random.nextInt(6);
		String[] PronounSubject = {"Je","Tu","Il","Elle","On","Nous","Vous","Ils","Elles"}
		
		
	}
	}
	