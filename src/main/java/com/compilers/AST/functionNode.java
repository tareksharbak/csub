package com.compilers.AST;

public class functionNode extends ASTNode 
{
	public typeNode _type = new typeNode();
	public argumentsNode _arguments = new argumentsNode();
	public functionBodyNode _functionBody = new functionBodyNode();
	public TokenNode _VOID = new TokenNode();
	public TokenNode _IDENT = new TokenNode();
	public TokenNode _OPENPARENT = new TokenNode();
	public TokenNode _CLOSEPARENT = new TokenNode();
	
	public functionNode(){}
}
