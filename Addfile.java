package mainproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addfile {

	public void add() throws IOException {
		String path="D:\\Project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename you want to add");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created");
		}
		
	}



		
	}


