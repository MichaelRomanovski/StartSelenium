public class MainEmployee {
    public static void main(String[] args) {

SalaryEmployee sa=new SalaryEmployee(7000);
SalaryEmployee sa1=new SalaryEmployee(7600);
WageEmployee wa=new WageEmployee(36,490);
WageEmployee wa1=new WageEmployee(37,500);
Manager ma=new Manager(6000,37);
Manager ma1=new Manager(5000,34);
Employee[]employees=new Employee[10];
employees[0]=sa;
employees[1]=sa;
employees[2]=wa;
employees[3]=wa1;
employees[4]=ma;
employees[5]=ma1;
printEmployees(employees);


}
public static void printEmployees(Employee[] employees){

    for(int i=0;employees[i]!=null;i++){
        System.out.println("Employee"+(i+1)+"  "+employees[i].calculatesalary());
    }


    }

    }


