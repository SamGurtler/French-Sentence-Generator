import java.io.Serializable;
public class Francais_verbs implements Serializable
{
	private String Inf = new String("Infinitif verbe"); 
	private String[] Verb = new String[] {"Je/J'","Tu","Il/Elle/On","Nous","Vous","Ils/Elles"};
	public Francais_verbs()
	{
	Inf = "Infinitif verbe"; 
	Verb[0] = "Je/J'";
	Verb[1] = "Tu";
	Verb[2] = "Il/Elle/On";
	Verb[3] = "Nous";
	Verb[4] = "Vous";
	Verb[5] = "Ils/Elles";
	}
	public Francais_verbs(String Infvar,String Zero,String Un,String Deux,String Trois, String Quatre,String Cinq)
	{
	Inf = Infvar;
	Verb[0] = Zero;
	Verb[1] = Un;
	Verb[2] = Deux;
	Verb[3] = Trois;
	Verb[4] = Quatre;
	Verb[5] = Cinq;
	//System.out.print("\t");
	//	Inf = this.Lire();
	//Verb = this.getVerb();
	}
	public String getInf()
	{
	return Inf;
	}
	public void setInf(String input)
	{
	Inf = input;
	}
	public void setVerb(int index, String input)
	{
	Verb[index]= input;
	}
	public String getVerb(int index)
	{
	return Verb[index];
	}
	public void showInf()
	{
	System.out.println(Inf);
	}
	public void showVerb(int index)
	{
	System.out.print(Verb[index]);
	}
}