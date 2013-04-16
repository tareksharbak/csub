package com.compilers.AST;

public class FunctionNode extends ASTNode 
{
	public TypeNode type;
	public ArgumentsNode arguments;
	public FunctionBodyNode functionBody;
	public TokenNode VOID;
	public TokenNode IDENT;
	public TokenNode OPENPARENT;
	public TokenNode CLOSEPARENT;
	
	public FunctionNode(){}
}
