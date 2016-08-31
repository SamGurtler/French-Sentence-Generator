import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random; 
import java.util.ArrayList;
	public class Francais_verbs_driver3_demi{
		public static void main(String[]args) throws FileNotFoundException{
			//Not compiled
			File Verbs = new File(System.getProperty("user.dir")+"/Verbs.txt");
			Francais_verbs[] VerbList = new Francais_verbs[7]; 
			Scanner scan = new Scanner(Verbs);
			String[] VerbLoader = new String[7];
			try{
				//File hasn't been made yet.Need to make file using notepad.
				ArrayList<String> pluralMascN = new ArrayList<String>();
				File filepluralMascN = new File(System.getProperty("user.dir")+"/pluralMascN.txt");
				Scanner scanpluralMascN = new Scanner(filepluralMascN);
				//File hasn't been made yet.Need to make file using notepad.
				ArrayList<String> pluralFemN = new ArrayList<String>();
				File filepluralFemN = new File(System.getProperty("user.dir")+"/pluralFemN.txt");
				Scanner scanpluralFemN = new Scanner(filepluralFemN);
				//File hasn't been made yet.Need to make file using notepad.
				ArrayList<String> singularMascN = new ArrayList<String>();
				File filesingularMascN = new File(System.getProperty("user.dir")+"/singularMascN.txt");
				Scanner scansingularMascN = new Scanner(filesingularMascN);
				//File hasn't been made yet.Need to make file using notepad.
				ArrayList<String> singularFemN = new ArrayList<String>();
				File filesingularFemN = new File(System.getProperty("user.dir")+"/singularFemN.txt");
				Scanner scansingularFemN  = new Scanner(filesingularFemN);
				while(scanpluralMascN.hasNext()){
					 pluralMascN.add(scanpluralMascN.nextLine());
				}
				while(scanpluralFemN.hasNext()){
					 pluralFemN.add(scanpluralFemN.nextLine());
				}
				while(scansingularMascN.hasNext()){
					singularMascN.add(scansingularMascN.nextLine());
				}
				while(scansingularFemN.hasNext()){
					singularFemN.add(scansingularFemN.nextLine());
				}
			}
			catch(FileNotFoundException e)
			{
				System.err.println(e);
			}
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
				case 0:	
						System.out.print(PronounSubject[subject_Conjugation]+" ");
					if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))){
						System.out.print("n'"+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
					}
					else System.out.print("ne "+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
					break;
				case 1:
					if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))||subject_Conjugation == 1){
						System.out.print("J'");
					}
					else System.out.print(PronounSubject[subject_Conjugation]+" ");
					System.out.print(VerbList[random_Verb_Int].getVerb(conjugation_index));
					break;
				case 2:	
						System.out.print(PronounSubject[subject_Conjugation]+" ");
						if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))){
							System.out.print("n'"+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
						}
						else System.out.print("ne "+VerbList[random_Verb_Int].getVerb(conjugation_index)+" pas");
						break;
				default:
						if(StrtsWthVwls(VerbList[random_Verb_Int].getVerb(conjugation_index))||subject_Conjugation == 1){
							System.out.print("J'");
						}
						else System.out.print(PronounSubject[subject_Conjugation]+" ");
						System.out.print(VerbList[random_Verb_Int].getVerb(conjugation_index));
						break;
			}
		}
		public static boolean StrtsWthVwls(String chckstrtwvowel ){
			char[] chckstrtwvowel1 = chckstrtwvowel.toCharArray();
			switch((int)chckstrtwvowel1[0]){
				case 97: 
					return true;
			case 101: 
					return true;
			case 105: 
					return true;
			case 111: 
					return true;
			case 117: 
					return true;
			case 130: 
					return true;
			case 138: 
					return true;
			case 133: 
					return true;
			case 151: 
					return true;
			case 131: 
					return true;
			case 136: 
					return true;
			case 140: 
					return true;
			case 147: 
					return true;
			case 150: 
					return true;
			case 137: 
					return true;
			case 139: 
					return true;
			case 129: 
					return true;
			default: 
					return false;
			}
	}
	
	}
