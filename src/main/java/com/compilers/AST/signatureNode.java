package com.compilers.AST;

public class signatureNode extends ASTNode
{
	public typeNode _type = new typeNode();
	public signatureArgumentsNode _signatureArguments = new signatureArgumentsNode();
	public TokenNode _VOID = new TokenNode();
	public TokenNode _IDENT = new TokenNode();
	public TokenNode _OPENPARENT = new TokenNode();
	public TokenNode _CLOSEPARENT = new TokenNode();
	public TokenNode _SEMICOLON = new TokenNode();
	
	public signatureNode(){}
}
