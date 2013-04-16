package com.compilers;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import com.compilers.parsers.CsubLexer;
import com.compilers.parsers.CsubParser;

public class Test {
	public static void main(String[] args) throws Exception {
//		// Create an input character stream from standard in
//		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// Create an input character stream from a file
		ANTLRFileStream input = new ANTLRFileStream("src/test/resources/funcs");
		// Create an MyLexer that feeds from that stream
		CsubLexer lexer = new CsubLexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		CsubParser parser = new CsubParser(tokens);
		// Begin parsing at rule prog
		parser.program();
		System.out.print("Done\n");
	}
}