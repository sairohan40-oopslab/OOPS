import java.util.Scanner;
class RestrauntMenu{
 public void defaultMenu(){
 System.out.println("-----------####----------");
 System.out.println("Here is our menu card");
 System.out.println("Biryani");
 System.out.println("kadhai paneer");
 System.out.println("Butter chicken");
 System.out.println("Nans");
 System.out.println("Sweets");
 System.out.println("juices");
 System.out.println("Ice Creams");
 System.out.println("--------------------------");
 }
}
class PaymentBill extends RestrauntMenu{
 String Biryani,curry,icecreams;
 PaymentBill(String Biryani,String curry,String icecreams){
 this.Biryani=Biryani;
 this.curry=curry;
 this.icecreams=icecreams;
 }
 public void yourBill(){
 System.out.println("-----------####----------");
 System.out.println("Here is our bill card");
 System.out.println(Biryani);
 System.out.println(curry);
 System.out.println(icecreams);
 System.out.println("--------------------------");
 }
}
public class Restraunt{
 public static void main(String [] args){
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter any Biryani:");
 String Biryani=obj.nextLine();
 System.out.println("Enter any Curry:");
 String curry=obj.nextLine();
 System.out.println("Enter any icecreams:");
 String icecreams=obj.nextLine();
 RestrauntMenu myRes=new RestrauntMenu();
 myRes.defaultMenu();
 PaymentBill myobj=new PaymentBill(Biryani,curry,icecreams);
 Myobj.yourBill();
 }
}
