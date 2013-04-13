package com.compilers.AST;

public class mainNode extends ASTNode
{
	public typeNode _type = new typeNode();
	public argumentsNode _arguments = new argumentsNode();
	public functionBodyNode _functionBody = new functionBodyNode();
	public TokenNode _VOID = new TokenNode();
	public TokenNode _MAIN = new TokenNode();
	public TokenNode _OPENPARENT = new TokenNode();
	public TokenNode _CLOSEPARENT = new TokenNode();
	
	public mainNode(){}
}
