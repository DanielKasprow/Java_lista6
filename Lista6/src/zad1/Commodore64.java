package zad1;

public class Commodore64 extends Komputer{
	
	int poborPradu;
	String procesor;
	
	public Commodore64(int rok, String nazwa, String procesor,String producent, int poborPradu)
	{
		super(rok, nazwa,producent);
		this.procesor = procesor;
		this.poborPradu = poborPradu;
	}
	
	public void Info()
	{
		super.Info();
		System.out.println("procesor: " + procesor);
		System.out.println("poborPradu: " + poborPradu + "V");
	}
}
