/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Comparator;
/* Name of the class has to be "Main" only if the class is public. */
		class Employee{
			String name;
			int salary;
			
			Employee(String name,int salary){
				this.name=name;
				this.salary=salary;
			}
		}
		class Sortbyroll implements Comparator<Employee>
		{
		    // Used for sorting in ascending order of
		    // roll number
		    public int compare(Employee o1, Employee o2)
		    {
		        if(o1.name==o2.name){
					if(o1.salary>o2.salary)
						return 1;
					else
						return 0;
				}
				else if(o1.name.compareTo(o2.name)>0)  
					return 1;  
				else  
					return 0; 
		    }
		}
		class Test{
			public static void main (String[] args) throws java.lang.Exception
			{
				Scanner sc= new Scanner(System.in);
				int t= sc.nextInt();
				while(t-->0){
					ArrayList<Employee> hash= new ArrayList<Employee>();
					int x=sc.nextInt();
					while(x-->0){
						String z=sc.next();
						int b=sc.nextInt();
						hash.add(new Employee(z,b));
					}
					Collections.sort(hash,new Sortbyroll());
					for (Employee e : hash) {
						System.out.print(e.name+" "+e.salary);
					}
					System.out.println();
				}
			}
		}