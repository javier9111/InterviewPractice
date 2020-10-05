package com.java.test.javaeight;

import java.io.File;
import java.io.FileFilter;

public class FilefiletersJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileFilter filter = new FileFilter(){

			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
				
				
			}
			
			
		};
		
		FileFilter filterLambda = ( File pathname) -> pathname.getName().endsWith(".java");
		File dir = new File ("d:/temp");
		File[] file = dir.listFiles(filterLambda);
		
		for (File f : file)
		{
			System.out.println(f);
		}
				
	}

}
