package com.compilers.AST;

import java.util.*;

public class DeclarationNode extends ASTNode
{
	public TokenNode _CONST;
	public Hashtable<TokenNode, ExpressionNode> _IDENT = new Hashtable<TokenNode, ExpressionNode>();
	public Hashtable<TokenNode, ExpressionNode> _POINTER = new Hashtable<TokenNode, ExpressionNode>();
	public TokenNode _SEMICOLON;
//	public arrayDeclarationNode _arrayDeclaration;
	
	public DeclarationNode(){}
}
