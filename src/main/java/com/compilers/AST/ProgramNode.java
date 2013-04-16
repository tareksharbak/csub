package com.compilers.AST;

import java.util.ArrayList;

public class ProgramNode extends ASTNode 
{
	private ArrayList<TokenNode> includes = new ArrayList<TokenNode>();
	public ArrayList<TokenNode> getIncludes() {
		return includes;
	}
	public ArrayList<FunctionNode> functions = new ArrayList<FunctionNode>();
	public ArrayList<SignatureNode> signatures = new ArrayList<SignatureNode>();
	public ArrayList<DeclarationNode> declarations = new ArrayList<DeclarationNode>();
	public MainNode main;
	
	public ProgramNode(String name)
	{
		super.setName(name);
	}
	
	public ProgramNode(ArrayList<TokenNode> includes, ArrayList<FunctionNode> functions, ArrayList<SignatureNode> signatures, ArrayList<DeclarationNode> declarations, MainNode main)
	{
		this.includes = includes;
		this.functions = functions;
		this.declarations = declarations;
		this.signatures = signatures;
		this.main = main;
	}

	// Test
	public ProgramNode(ArrayList<TokenNode> includes) {
		super();
		this.includes = includes;
	}

}
