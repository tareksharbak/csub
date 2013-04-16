package com.compilers.AST;

import java.util.ArrayList;

public class FunctionBodyNode extends ASTNode
{
	public TokenNode OPENCURLY;
	public ArrayList<StatementNode> statments = new ArrayList<StatementNode>();
	public TokenNode CLOSECURLY;
	
	public FunctionBodyNode(){}
}
