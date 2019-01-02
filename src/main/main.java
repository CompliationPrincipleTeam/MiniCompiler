package main;
import java.io.*;

import global.Global;
import lexer.*;
import parser.*;

public class main {

	public static void main(String[] args) throws IOException {
		Global.init("bubble sort.txt", "intermediate.txt");
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.write('\n');
		Global.close();
		
	}
}
