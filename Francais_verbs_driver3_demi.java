import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random; 
	public class Francais_verbs_driver3_demi{
		public static void main(String[]args) throws FileNotFoundException{
			File Verbs = new File(System.getProperty("user.dir")+"/Verbs.txt");
			Francais_verbs[] VerbList = new Francais_verbs[7]; 
			Scanner scan = new Scanner(Verbs);
			String[] VerbLoader = new String[7];
			//makes
			for(int x = 0;x<7;x++){
				//System.out.println("+++++++++++++++++++++++++++++++++\n");
				for(int y = 0;y<7;y++){
					VerbLoader[y] = scan.nextLine();
					//System.out.print("["+VerbLoader[y]+"]");
				}
				//System.out.println("\n+++++++++++++++++++++++++++++++++");
				VerbList[x] = new Francais_verbs(VerbLoader[0],VerbLoader[1],VerbLoader[2],VerbLoader[3],VerbLoader[4],VerbLoader[5],VerbLoader[6]);
				/*System.out.println("\n-------------------------------------------------");
				System.out.println(VerbList[x].getInf());
				System.out.println(VerbList[x].getVerb(0)+" "+VerbList[x].getVerb(3));
				System.out.println(VerbList[x].getVerb(1)+" "+VerbList[x].getVerb(4));
				System.out.println(VerbList[x].getVerb(2)+" "+VerbList[x].getVerb(5));
				System.out.println("-------------------------------------------------");*/
			}
			//Deletes Verbloader String array
			for(int x = 0;x<63;x+=7){
				for(int y = 0;y<7;y++){
					VerbLoader[y] = null;
				}
			}
			scan.close();
			System.gc();
			Random rand = new Random();
			Random rand1 = new Random();
			Random rand2 = new Random();
			int Sentencetype =  rand.nextInt(3);
			int subject_Conjugation = rand1.nextInt(8);
			int random_Verb_Int = rand2.nextInt(6);
			int conjugation_index = subject_Conjugation;
			if(subject_Conjugation == 2||subject_Conjugation == 3||subject_Conjugation == 4){
				conjugation_index = 2;
			}
			if(subject_Conjugation==5){
				conjugation_index = 3;
			}
			if(subject_Conjugation==6){
				conjugation_index = 4;
			}
			if(subject_Conjugation==7||subject_Conjugation==8){
				conjugation_index = 5;
			}
			String[] PronounSubject = {"Je","Tu","Il","Elle","On","Nous","Vous","Ils","Elles"};
			//                           0    1    2    3     4     5      6      7     8
			//                           0    1    2    2     2     3      4      5     5
			switch(Sentencetype){
				case 0:	System.out.print(PronounSubject[subject_Conjugation]+" ");
					if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))){
						System.out.print("n'"+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
					}
					else System.out.print("ne "+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
					break;
				case 1:System.out.print(PronounSubject[subject_Conjugation]+" "+VerbList[random_Verb_Int].getVerb(conjugation_index));
					break;
				case 2:	
						if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))||subject_Conjugation == 1){
							System.out.print("J'");
						}
						else System.out.print(PronounSubject[subject_Conjugation]+" ");
						if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))){
							System.out.print("n'"+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
						}
						else System.out.print("ne "+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
						break;
				default:
					System.out.print(PronounSubject[subject_Conjugation]+" "+VerbList[random_Verb_Int].getVerb(conjugation_index));
					break;
			}
		}
		public static boolean StrtsWthVwls(String chckstrtwvowel ){
			char[] chckstrtwvowel1 = chckstrtwvowel.toCharArray();
			switch((int)chckstrtwvowel1[0]){
				case 97: 
					return true;
					break;
				case 101: 
					return true;
					break;
				case 105: 
					return true;
					break;
				case 111: 
					return true;
					break;
				case 117: 
					return true;
					break;
				case 130: 
					return true;
					break;
				case 138: 
					return true;
					break;
				case 133: 
					return true;
					break;
				case 151: 
					return true;
					break;
				case 131: 
					return true;
					break;
				case 136: 
					return true;
					break;
				case 140: 
					return true;
					break;
				case 147: 
					return true;
					break;
				case 150: 
					return true;
					break;
				case 137: 
					return true;
					break;
				case 139: 
					return true;
					break;
				case 129: 
					return true;
					break;
				default: 
					return false;
					break;
			}
	}
	
	}
