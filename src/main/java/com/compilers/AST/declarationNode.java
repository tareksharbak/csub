package com.compilers.AST;

import java.util.*;

public class declarationNode extends ASTNode
{
	public TokenNode _CONST = new TokenNode();
	public Hashtable<TokenNode, expressionNode> _IDENT = new Hashtable<TokenNode, expressionNode>();
	public Hashtable<TokenNode, expressionNode> _POINTER = new Hashtable<TokenNode, expressionNode>();
	public TokenNode _SEMICOLON = new TokenNode();
//	public arrayDeclarationNode _arrayDeclaration = new arrayDeclarationNode();
	
	public declarationNode(){}
}
