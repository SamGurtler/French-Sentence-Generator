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
		for(int x = 0;x<63;x+=7){
			for(int y = 0;y<7;y++){
				VerbLoader[y] = scan.nextLine();
			}
			for(int z = 0;z<7;z++){
				VerbList[z] = new Francais_verbs(VerbLoader[0],VerbLoader[1],VerbLoader[2],VerbLoader[3],VerbLoader[4],VerbLoader[5],VerbLoader[6]);
			}
		}
		//Deletes Verbloader String array
		for(int x = 0;x<63;x+=7){
			for(int y = 0;y<7;y++){
				VerbLoader[y] = null;
			}
		}
		System.gc();
		int rand = new Random.nextInt(1);
		int rand1 = new Random.nextInt(8);
		int rand2 = new Random.nextInt(6);
		int conjugation_index = rand1;
		if(rand1 = 2||rand1 = 3||rand1 = 4){
			conjugation_index = 2;
		}
		if(rand1=5){
			conjugation_index = 3;
		}
		if(rand1=6){
			conjagation_index = 4;
		}
		if(rand1=7||rand1=8){
			conjugation_index = 5;
		}
		String[] PronounSubject = {"Je","Tu","Il","Elle","On","Nous","Vous","Ils","Elles"};
		//                           0    1    2    3     4     5      6      7     8
		//                           0    1    2    2     2     3      4      5     5
		switch(rand){
		case 0:
			//If statments inside here maybe
			
			System.out.println(PronounSubject[rand1]+" "+VerbList[rand2].getVerb[conjugation_index]);
			break;
		case 1:
			//If statments inside here maybe
			break;
		}
		
	}
	}
	
