import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException; 
import java.io.ObjectOutputStream;
import java.lang.NullPointerException;
import java.io.File;
import java.io.IOException;
public class Francais_verbs_driver2{
	public static int Vbook_length;
	public static Francais_verbs[] VBook = new Francais_verbs[1];
	public static int next = 0;
	public static String Pth_nme;
	public static boolean exist;
	public static void main(String[]args){
		/*VBook[0] = new Francais_verbs();
		
		writeObject(VBook[0], "H:/Frenchthing.ser");
		
		Francais_verbs loadedObject = (Francais_verbs) readObject("H:/Frenchthing.ser");
		
		loadedObject.showInf();
		for(int i = 0; i < 6; i++){
			loadedObject.showVerb(i);
		}*/
		
		System.out.println("Where do you want to save you Verb Book(Enter path)?");
		String Pth_nme = Lire();
		/*Comment once sure this works */Pth_nme = "H:/Frenchthing.ser";
		System.out.println("How many verbs do you want in your Vbook?");
		int Vbook_length = lire();
		File VrbBk = new File(/*"H:""VBook.txt"*/Pth_nme);
		String Shold = new String("");
		boolean Cn_appnd = VrbBk.exists();
		exist = VrbBk.exists();
			do{
				for(int x = 0;x<Vbook_length;x++){
					setupVBook(Cn_appnd);
					System.out.print(Cn_appnd);
					System.out.println("Hi 2");
				}
				for(int x = 0;x<VBook.length;x++){
					showVBook(x);
					System.out.print(Cn_appnd);
					System.out.println("Hi 3");
				}
			}while(VBook.length < Vbook_length);
		System.out.println(Vbook_length+" "+VBook.length);
		
	}
	public static void setupVBook(boolean ntStpVbk){
		if(next==VBook.length){
			VBook = expandVBook();
			System.out.println("Hi 1");
		}
		VBook[next] = new Francais_verbs();
		
		if(ntStpVbk == true){
			try{
				VBook[next] = (Francais_verbs) readObject(/*Pth_nme*/"Frenchthing.ser");
			}
			catch(NullPointerException e){
				    System.err.println("HERE!!!!!" + e.getMessage());
					e.printStackTrace();
				getVerb2();
			}
		}
		else{
			getVerb2();
		}
		next++;
	}
	public static Francais_verbs[] expandVBook(){
		int x = VBook.length;
		String Shold = new String("");
		Francais_verbs[] tmpVBook = new Francais_verbs[x+1];
		for(int i = 0;i<VBook.length;i++){
			tmpVBook[i] = new Francais_verbs();
			Shold = VBook[i].getInf();
			tmpVBook[i].setInf(Shold);
			for( int b = 0;b<6;b++){
				tmpVBook[i].setVerb(b,VBook[i].getVerb(b));
			}
			for(int ii = VBook.length;ii<tmpVBook.length;ii++){
				tmpVBook[ii] = new Francais_verbs();
			}
		}
		return tmpVBook;
	}
	public static Francais_verbs[] expandVBook(int h){
		int x = VBook.length;
		String Shold = new String("");
		Francais_verbs[] tmpVBook = new Francais_verbs[h];
		for(int i = 0;i<VBook.length;i++){
			tmpVBook[i] = new Francais_verbs();
			Shold = VBook[i].getInf();
			tmpVBook[i].setInf(Shold);
			for( int b = 0;b<6;b++){
				tmpVBook[i].setVerb(b,VBook[i].getVerb(b));
			}
		}
		for(int i = VBook.length;i<tmpVBook.length;i++){
			tmpVBook[i] = new Francais_verbs();
		}
		return tmpVBook;
	}
	public static String Lire(){
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
	public static int lire(){
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	public static void showVBook(int y){
		System.out.println("\t"+VBook[y].getInf());
		System.out.println("Je/J' "+VBook[y].getVerb(0));
		System.out.println("Tu "+VBook[y].getVerb(1));
		System.out.println("Il/Elle/On "+VBook[y].getVerb(2));
		System.out.println("Nous "+VBook[y].getVerb(3));
		System.out.println("Vous "+VBook[y].getVerb(4));
		System.out.println("Ils/Elles "+VBook[y].getVerb(5));
	}
	public static void writeObject (Francais_verbs bob, String Pth_nme){
		try{
			FileOutputStream FOS = new FileOutputStream(Pth_nme,false);
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);
			OOS.writeObject(bob);
			OOS.close();
			FOS.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static Object readObject(String path){
		Object loadedObject = null;
		try{
			FileInputStream FIS = new FileInputStream(path);
			ObjectInputStream OIS = new ObjectInputStream(FIS);
			loadedObject = OIS.readObject();
			OIS.close();
			FIS.close();
		}
		catch(IOException e ){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
		return loadedObject;	
	}
	public static void getVerb2(){
		String Shold =  new String("");
		System.out.println("What is the infinitive?");
		Shold = Lire();
		VBook[next].setInf(Shold);
		for(int x = 0;x<6;x++){
				System.out.print("What is the verb conjugation for ");
				switch(x+1){
					case 1:
						System.out.println("Je/J' ");
						break;
					case 2:
						System.out.println("Tu ");
						break;
					case 3:				
						System.out.println("Il/Elle/On ");
						break;
					case 4:
						System.out.println("Nous ");
						break;
					case 5:
						System.out.println("Vous ");
						break;
					case 6:
						System.out.println("Ils/Elles ");
						break;
				}
				VBook[next].setVerb(x,Lire());
		}
		writeObject(VBook[next], "H:/Frenchthing.ser");
	}
	
}
		