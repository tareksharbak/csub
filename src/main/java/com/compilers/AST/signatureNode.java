package com.compilers.AST;

public class SignatureNode extends ASTNode
{
	public TypeNode _type;
	public SignatureArgumentsNode _signatureArguments;
	public TokenNode _VOID;
	public TokenNode _IDENT;
	public TokenNode _OPENPARENT;
	public TokenNode _CLOSEPARENT;
	public TokenNode _SEMICOLON;
	
	public SignatureNode(){}
}
