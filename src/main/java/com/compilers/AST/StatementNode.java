package com.compilers.AST;

public class StatementNode extends ASTNode
{
	public TokenNode _SEMICOLON;
	public TokenNode _BREAK;
	public TokenNode _CONTINUE;
	public TokenNode _STRINGVALUE;
	public ExpressionNode _expression;
	public DeclarationNode _declaration;
//	public assignmentNode _assignment;
//	public ifControlNode _ifControl;
//	public forControlNode _forControl;
//	public whileControlNode _whileControl;
//	public doWhileControlNode _doWhileControl;
//	public returnStmtNode _returnStmt;
	
	public StatementNode(){}
}
