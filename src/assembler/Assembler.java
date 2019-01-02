package assembler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assembler {
	
	public Assembler(String filePath) throws FileNotFoundException
	{
		BufferedReader br = new BufferedReader(new FileReader(filePath));
	}
}
