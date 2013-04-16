package com.compilers.AST;

import java.util.ArrayList;

public class ProgramNode extends ASTNode 
{
	private ArrayList<TokenNode> _includes = new ArrayList<TokenNode>();
	public ArrayList<TokenNode> get_includes() {
		return _includes;
	}
	public ArrayList<FunctionNode> _functions = new ArrayList<FunctionNode>();
	public ArrayList<SignatureNode> _signatures = new ArrayList<SignatureNode>();
	public ArrayList<DeclarationNode> _declarations = new ArrayList<DeclarationNode>();
	public MainNode _main;
	
	public ProgramNode(String Name)
	{
		super.set_Name(Name);
	}
	
	public ProgramNode(ArrayList<TokenNode> _includes, ArrayList<FunctionNode> _functions, ArrayList<SignatureNode> _signatures, ArrayList<DeclarationNode> _declarations, MainNode _main)
	{
		this._includes = _includes;
		this._functions = _functions;
		this._declarations = _declarations;
		this._signatures = _signatures;
		this._main = _main;
	}

	// Test
	public ProgramNode(ArrayList<TokenNode> _includes) {
		super();
		this._includes = _includes;
	}

}
