package com.compilers.AST;

public class statementNode extends ASTNode
{
	public TokenNode _SEMICOLON = new TokenNode();
	public TokenNode _BREAK = new TokenNode();
	public TokenNode _CONTINUE = new TokenNode();
	public TokenNode _STRINGVALUE = new TokenNode();
	public expressionNode _expression = new expressionNode();
	public declarationNode _declaration = new declarationNode();
//	public assignmentNode _assignment = new assignmentNode();
//	public ifControlNode _ifControl = new ifControlNode();
//	public forControlNode _forControl = new forControlNode();
//	public whileControlNode _whileControl = new whileControlNode();
//	public doWhileControlNode _doWhileControl = new doWhileControlNode();
//	public returnStmtNode _returnStmt = new returnStmtNode();
	
	public statementNode(){}
}
