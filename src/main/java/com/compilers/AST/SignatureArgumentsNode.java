package com.compilers.AST;

import java.util.ArrayList;

public class SignatureArgumentsNode extends ASTNode 
{
	public ArrayList<TypeNode> TYPES = new ArrayList<TypeNode>();
	public TokenNode VOID;
	
	public SignatureArgumentsNode(){}
}
