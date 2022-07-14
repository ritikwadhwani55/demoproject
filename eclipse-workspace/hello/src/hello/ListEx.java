package hello;

package uiltex;

import java.util.*;
 
public class ListEx {
        public static void main(String[] args) {

            System.out.println("How many records want to store");

            Scanner sc=new Scanner(System.in);
            int rec=sc.nextInt();

            List<Employee> l=new ArrayList<Employee>();  //generics jdk1.5


            for(int i=0;i<rec;i++)
            {
                Employee e;
                int no=sc.nextInt();
                String name=sc.next();
                int sal=sc.nextInt();        
                l.add(new Employee(no,name,sal));

            }

            for(Employee em:l) //foreach (or) enhanced for loop jdk1.5
            {
                if(em.getSalary()<5000)
                {
                System.out.println(em.getEno());
                System.out.println(em.getEname());
                System.out.println(em.getSalary());
                }
            }

        }
}
