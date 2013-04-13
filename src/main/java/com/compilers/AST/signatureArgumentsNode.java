package com.compilers.AST;

import java.util.ArrayList;

public class signatureArgumentsNode extends ASTNode 
{
	public ArrayList<typeNode> _TYPES = new ArrayList<typeNode>();
	public TokenNode _VOID = new TokenNode();
	
	public signatureArgumentsNode(){}
}
