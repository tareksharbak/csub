package com.compilers.AST;

public class FunctionNode extends ASTNode 
{
	public TypeNode _type;
	public ArgumentsNode _arguments;
	public FunctionBodyNode _functionBody;
	public TokenNode _VOID;
	public TokenNode _IDENT;
	public TokenNode _OPENPARENT;
	public TokenNode _CLOSEPARENT;
	
	public FunctionNode(){}
}
