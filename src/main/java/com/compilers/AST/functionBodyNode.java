package com.compilers.AST;

import java.util.ArrayList;

public class functionBodyNode extends ASTNode
{
	public TokenNode _OPENCURLY = new TokenNode();
	public ArrayList<statementNode> _statments = new ArrayList<statementNode>();
	public TokenNode _CLOSECURLY = new TokenNode();
	
	public functionBodyNode(){}
}
