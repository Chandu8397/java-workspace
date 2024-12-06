package stringsdemo;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :4:49:56 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*A new String Object is created, even if "Bengaluru"
        is already present in String pool
*/

public class StringCreationDemo2 {

	public static void main(String[] args) {
		
        String city =new String("Bengaluru");
        String place =new String("Bengaluru");
        String itCity =new String("Bengaluru is a IT City");

        System.out.println(city+" - "+city.hashCode());
        System.out.println(place+" - "+place.hashCode());

        /* == Operator checks if two references points to same Object in memory
        *  equals() Methods checks the contents of 2 String Objects are equal or not
        * */
        System.out.println("Reference of city & place are same ? :"+city == place);
        System.out.println(itCity+" - "+itCity.hashCode());

        System.out.println("The String is : "+city);
        System.out.println("Convert to Uppercase : "+city.toUpperCase());

        System.out.println("****** String Split() Function ******");
        String[] result=itCity.split(" ");

        for (String s:result){
            System.out.print(s+"\t");
        }

	}

}
