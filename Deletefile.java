package mainproject;

import java.io.File;
import java.util.Scanner;

public class Deletefile {

	public void del() {
		
		String path="D:\\Project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename you want to delete");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}

	

