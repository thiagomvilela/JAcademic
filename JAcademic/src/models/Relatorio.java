package models;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Relatorio {
	
	public static void drawTxt(String path, String txt) 
	{
		
		try(FileWriter fw = new FileWriter(path, true); PrintWriter pw = new PrintWriter(fw);) 
		{ 
																																								
			fw.append(txt);		
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void openFile(String fileName) {
		
		if (Desktop.isDesktopSupported()) {
			 try {
			     Desktop desktop = Desktop.getDesktop();
			     File txt = new File(fileName);
			     desktop.open(txt);
			     } catch (IOException ex) {}
			 }
		
	}

}
