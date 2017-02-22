 enum names{
	
	a(10),b(11),c(12);
	 
	public int age;
	
	names(int a){
		
	age=a;	
		
	}
     int findage(){
		
		return age;
	}
	
	}
	
public class TaskEnum {
	
	public static void main(String args[]){
		
		for(names c:names.values()){
			
			System.out.println(c + " value " + c.findage());
		}
		
	}

}
