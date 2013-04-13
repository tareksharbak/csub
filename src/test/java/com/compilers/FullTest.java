package com.compilers;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import com.compilers.parsers.CsubLexer;
import com.compilers.parsers.CsubParser;

public class FullTest {

	@Test
	public void testHelloWorlds() throws Exception {
		parseFile("helloWorld");
	}
	
	@Test
	public void testPower2() throws Exception {
		parseFile("power2");
	}
	
	@Test
	public void testFuncs() throws Exception {
		parseFile("funcs");
	}

	private void parseFile(String fileName) throws IOException,
			RecognitionException {
		// Create an input character stream from a file
//		InputStream is = (InputStream) getClass().getResourceAsStream( "fileName" );
		ANTLRFileStream input = new ANTLRFileStream("src/test/resources/"+fileName);
		// Create an MyLexer that feeds from that stream
		CsubLexer lexer = new CsubLexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		CsubParser parser = new CsubParser(tokens);
		// Begin parsing at rule program
		parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		if (errors != 0)
		{
			assertTrue(false);
			System.out.print("Test " +fileName+" failed\n");
		}
		System.out.print("Test " +fileName+" passed\n");
		
	}
}