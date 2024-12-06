package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :11:22:10 am
*Email  :Mekapothula.Reddy@coforge.com
*/


class Hyundai extends Car
{
	public void hyundaiStart() 
	{
		Engine heng= new Engine();      //composition-Hyundai class Fully dependent on Engine
		heng.startEngine();
	}
	
	
}

class Maruti extends Car
{
	public void marutiStart() {
		Engine meng= new Engine();      //composition-Maruti class Fully dependent on Engine
		meng.startEngine();
	}

		
	}
	

public class CompositionDemo {
	private static Maruti baleno;

	public static void main(String[] args) {
		
		baleno = new Maruti();
		
		baleno.setColor("Silver");      //car class methods
		baleno.setMax_speed(180);	   //car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods
		
		baleno.marutiStart();    // Maruti class method-- > call ENgine class method
		
		baleno=null;         //Baleno object destroyed along with Engine object
		System.gc(); 
		baleno.marutiStart();
		
		//System.out.println(baleno.getColor());
		
		
	}
	
	
	

}
