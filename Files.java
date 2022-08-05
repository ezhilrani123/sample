package mainproject;

import java.io.IOException;
import java.util.Scanner;

public class Files {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	 
	Displayfile dd=new Displayfile();
	Addfile aa=new Addfile();
	Deletefile df=new Deletefile();
	Searchfile ss=new Searchfile();
	
	
	
	while(true) {
		System.out.println("1.Display the files in Ascending Order 2.Add/Delete/Search a file. Enter the number you want to Choose ");
		int value =sc.nextInt();
		switch(value) {
		case 1:
			dd.dis();
			break;
		case 2:while(true) {
			System.out.println("1.Add a file 2,Delete a file 3.Search a file.Enter the number");
			int num=sc.nextInt();
			  switch(num){
				  case 1: aa.add();break;
				  case 2: df.del();break;
				  case 3: ss.search();break;
				  case 4: System.exit(0);
			  }	  
		}
		case 3:break;
			
		}
	}
	
}
}
