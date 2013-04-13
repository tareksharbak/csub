package com.compilers.AST;

import java.util.ArrayList;

public class programNode extends ASTNode 
{
	public ArrayList<includeNode> _includes = new ArrayList<includeNode>();
	public ArrayList<functionNode> _functions = new ArrayList<functionNode>();
	public ArrayList<signatureNode> _signatures = new ArrayList<signatureNode>();
	public ArrayList<declarationNode> _declarations = new ArrayList<declarationNode>();
	public mainNode _main = new mainNode();
	
	public programNode(){}
	
	public programNode(ArrayList<functionNode> _functions, ArrayList<signatureNode> _signatures, ArrayList<declarationNode> _declarations, mainNode _main)
	{
		this._functions = _functions;
		this._declarations = _declarations;
		this._signatures = _signatures;
		this._main = _main;
	}
}
