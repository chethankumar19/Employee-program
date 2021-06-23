package employee
import java.util.*;
public class employee{
  String name;
  int year;
  char address;
  public void getinput(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter Name:");
    name=in.next();
    System.out.print("Enter Year of Joining");
    year=in.nextInt();
    System.out.print("Enter Joining Address");
    address=in.next();
  }
  public void display(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee joining year:"+year);
    System.out.println("Employee joining address:"+address);
  }
  public static void main(String[] args){
    employee e[]=new Employee[2];
    for(int i=0;i<2;i++){
      e[i]=new employee();
      e[i].getinput();
    }
    for(int j=0;j<2;j++){
      e[i].display();
    }
  }
}
    
                    
    

                    
    
