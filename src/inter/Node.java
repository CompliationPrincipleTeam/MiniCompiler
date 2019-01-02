package inter;
import java.io.IOException;

import global.Global;
import lexer.*;

public class Node {

   int lexline = 0;

   Node() { lexline = Lexer.line; }

   void error(String s) { throw new Error("near line "+lexline+": "+s); }

   static int labels = 0;

   public int newlabel() { return ++labels; }

   public void emitlabel(int i) 
   {
	   System.out.print("L" + i + ":"); 
	   try 
	   {
		   Global.dstFw.write("L" + i + ":");
	   } 
	   catch (IOException e) 
	   {
		   e.printStackTrace();
	   }
   }

   public void emit(String s) 
   {
	   System.out.println("\t" + s);
	   try {
		   Global.dstFw.write("\t" + s + "\n");
	   } catch (IOException e) {
		e.printStackTrace();
	   }
   }
}
