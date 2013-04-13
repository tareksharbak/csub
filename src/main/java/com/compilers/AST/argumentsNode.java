package com.compilers.AST;

import java.util.*;

public class ArgumentsNode extends ASTNode 
{
	public Hashtable<TypeNode, TokenNode> _ARGUMENTS = new Hashtable<TypeNode, TokenNode>();
	public TokenNode _VOID;
	
	public ArgumentsNode(){}
	
}
