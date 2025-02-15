package generics.demo;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :11:24:22 am
*Email  :Mekapothula.Reddy@coforge.com
*/

class Sample <T> //Parameterized class
{
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class GenericsClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1= new Sample<String>("Java Generics");
		System.out.println("Display from Generic class by passing String Object: "+s1.getData());
		
		Sample<Integer> s2= new Sample<Integer>(200);
		System.out.println("Display from Generic class by passing Integer Object: "+s2.getData());
		
		Sample<Double> s3= new Sample<Double>(666.60);
		System.out.println("Display from Generic class by passing Double Object: "+s3.getData());


	}

}
