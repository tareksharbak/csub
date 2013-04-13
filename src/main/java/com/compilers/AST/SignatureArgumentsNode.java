package com.compilers.AST;

import java.util.ArrayList;

public class SignatureArgumentsNode extends ASTNode 
{
	public ArrayList<TypeNode> _TYPES = new ArrayList<TypeNode>();
	public TokenNode _VOID;
	
	public SignatureArgumentsNode(){}
}
