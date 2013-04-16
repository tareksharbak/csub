package com.compilers.AST;

public class SignatureNode extends ASTNode
{
	public TypeNode type;
	public SignatureArgumentsNode signatureArguments;
	public TokenNode VOID;
	public TokenNode IDENT;
	public TokenNode OPENPARENT;
	public TokenNode CLOSEPARENT;
	public TokenNode SEMICOLON;
	
	public SignatureNode(){}
}
