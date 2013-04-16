package com.compilers.AST;

public class MainNode extends ASTNode
{
	public TypeNode type;
	public ArgumentsNode arguments;
	public FunctionBodyNode functionBody;
	public TokenNode VOID;
	public TokenNode MAIN;
	public TokenNode OPENPARENT;
	public TokenNode CLOSEPARENT;
	
	public MainNode(){}
}
