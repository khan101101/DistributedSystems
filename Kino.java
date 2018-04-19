import java.util.ArrayList;

public class Kino
{
	public ArrayList filme=new ArrayList();
	
	public void spieleFilme()
	{
		System.out.println("groesse ist:"+filme.size());
		for(int i =0; i<filme.size(); i++)
		{
		filme a=filme.get(i);
		System.out.println(a.toString());
		}
	}
	
	public void ladeFilme()
	{
	System.out.println("ladeFilme");
	filme fdtd=new Film();
filme.titel="from dusk til dawn";
	filme.autor="quentin";
	filme.laenge=120;
	filme.add(fdtd);
	
        /*
	Film b=new Film();
	b.titel="findet nemo";
	b.autor="walt dis";
	b.laenge=110;
	
	filme.add(b);
	}*/
	
	public static void main (String[] args)
	{
	
	
	Kino cinemaxx=new Kino();
	cinemaxx.ladeFilme();
	cinemaxx.spieleFilme();
	}	

} }