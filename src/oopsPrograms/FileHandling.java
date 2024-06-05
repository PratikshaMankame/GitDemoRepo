package oopsPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("./TestFile1.txt");
		f.createNewFile();
		//	deleting a file
//delete() :- predefined method of File class. used to delete any kind of file.
//			  return type is boolean.
		if(f.delete())
		{
//		getName():- predefined method of File class. used to capture name of any file.
//					return type is string
			System.out.println(f.getName()+" file deleted successfully");
		}
		else
		{
			System.out.println("Error occured in file deletion");
		}
		//------------------------------------------------
		//reading from file 
		//		try
		//		{
		//			Scanner sc=new Scanner(f);
		//			while(sc.hasNextLine())
		//			{
		//				String str=sc.nextLine();
		//				System.out.println(str);
		//			}
		//		}
		//		catch (Exception e) 
		//		{
		//			e.printStackTrace();
		//		}
		//---------------------------------------------------------
		//		Writing in file :--------
		//		try
		//		{
		//			FileWriter fw=new FileWriter(f);
		//			fw.write("Writing in file");
		//
		//			fw.close();
		//			System.out.println("Writing completed");
		//		}
		//		catch (Exception e)
		//		{
		//			e.printStackTrace();
		//		}
	}
}