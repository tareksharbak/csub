package com.compilers.AST;

import java.util.*;

public class ArgumentsNode extends ASTNode 
{
	public Hashtable<TypeNode, TokenNode> ARGUMENTS = new Hashtable<TypeNode, TokenNode>();
	public TokenNode VOID;
	
	public ArgumentsNode(){}
	
}
