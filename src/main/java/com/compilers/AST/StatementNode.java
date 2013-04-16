package com.compilers.AST;

public class StatementNode extends ASTNode
{
	public TokenNode SEMICOLON;
	public TokenNode BREAK;
	public TokenNode CONTINUE;
	public TokenNode STRINGVALUE;
	public ExpressionNode expression;
	public DeclarationNode declaration;
//	public assignmentNode assignment;
//	public ifControlNode ifControl;
//	public forControlNode forControl;
//	public whileControlNode whileControl;
//	public doWhileControlNode doWhileControl;
//	public returnStmtNode returnStmt;
	
	public StatementNode(){}
}
