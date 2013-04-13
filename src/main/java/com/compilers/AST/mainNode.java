package com.compilers.AST;

public class MainNode extends ASTNode
{
	public TypeNode _type;
	public ArgumentsNode _arguments;
	public FunctionBodyNode _functionBody;
	public TokenNode _VOID;
	public TokenNode _MAIN;
	public TokenNode _OPENPARENT;
	public TokenNode _CLOSEPARENT;
	
	public MainNode(){}
}
