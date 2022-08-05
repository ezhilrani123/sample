package mainproject;

import java.io.File;

public class Displayfile {

	public void dis() {
		String path="D:\\Project\\";
        File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}
}


