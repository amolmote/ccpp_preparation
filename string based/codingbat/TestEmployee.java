


class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(int eid, String n){
     this.empId = eid;
     this.name = n;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
class TestEmployee {
	
	 public static void main(String args[]){
    
	//create array of employee object  
    Employee[] obj = new Employee[10] ;
 
     //create & initialize actual employee objects using constructor
    
	 for(int i=0;i<obj.length;i++){
		obj[i]=new Employee(i+1,String.valueOf((char)(97+i)));
	 }
	 
		//displaying data
	for(int i=0;i<obj.length;i++){
		System.out.println("Employee Object "+i +":");
		obj[i].showData();
	 }
  }
	
}