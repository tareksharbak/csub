package com.compilers.AST;

import java.util.ArrayList;

public class FunctionBodyNode extends ASTNode
{
	public TokenNode _OPENCURLY;
	public ArrayList<StatementNode> _statments = new ArrayList<StatementNode>();
	public TokenNode _CLOSECURLY;
	
	public FunctionBodyNode(){}
}
