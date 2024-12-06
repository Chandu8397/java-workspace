package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :4:49:07 pm
*Email  :Mekapothula.Reddy@coforge.com
*/


//object class is a parent of all java classes
class Test{

	//Implement Finalize()
	//Destructor Method - destroys object
    protected void finalize() throws Throwable {
    	System.out.println("Object Destroyed & Garbage Collected");              
	}
}
    
    public class DestructorDemo {
    	
    	@SuppressWarnings("unused")
		public static void main(String[] args) {
    		
    		//Invokes the Default constructor
    		Test t1=new Test();
    		Test t2=new Test();
    		Test t3=new Test();
    		Test t4=new Test();
    		
    		//Deallocate Memory - Objects destroyes Explictly
    		t1=null;
    		t2=null;
    		t3=null;
    		t4=null;
    		System.gc();   //Invokes service method gc()		
    		
    		}
      }

    
    
