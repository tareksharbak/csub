package com.compilers.AST;

import java.util.*;

public class DeclarationNode extends ASTNode
{
//	public TokenNode CONST;
//	public Hashtable<TokenNode, ExpressionNode> IDENT = new Hashtable<TokenNode, ExpressionNode>();
//	public Hashtable<TokenNode, ExpressionNode> POINTER = new Hashtable<TokenNode, ExpressionNode>();
//	public TokenNode SEMICOLON;
	public ArrayList<ASTNode> childs = new ArrayList<ASTNode>();
//	public arrayDeclarationNode _arrayDeclaration;
	
	public DeclarationNode(){}
}
