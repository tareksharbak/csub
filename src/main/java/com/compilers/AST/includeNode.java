package com.compilers.AST;

public class IncludeNode extends ASTNode
{
	public TokenNode _INCLUDE;
	
	public IncludeNode(TokenNode _INCLUDE)
	{
		this._INCLUDE = _INCLUDE;
	}
}
