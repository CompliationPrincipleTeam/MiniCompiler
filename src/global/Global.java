package global;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Global {
	public static File srcFile = null;
	public static File dstFile = null;
	public static FileWriter dstFw = null;
	
	public static void init(String srcFile, String dstFile)
	{
		Global.srcFile = new File(srcFile);
		Global.dstFile = new File(dstFile);
		try {
			dstFw = new FileWriter(Global.dstFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void close()
	{
		try {
			dstFw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
