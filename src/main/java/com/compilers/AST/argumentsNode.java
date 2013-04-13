package com.compilers.AST;

import java.util.*;

public class argumentsNode extends ASTNode 
{
	public Hashtable<typeNode, TokenNode> _ARGUMENTS = new Hashtable<typeNode, TokenNode>();
	public TokenNode _VOID = new TokenNode();
	
	public argumentsNode(){}
	
}
