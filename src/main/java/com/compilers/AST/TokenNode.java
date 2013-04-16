package com.compilers.AST;

public class TokenNode extends ASTNode
{
	private String name;
	private String value;
	private Position position;
	
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
	
	public TokenNode(String name, String value)
	{
		this.name = name;
		this.value = value;
	}
}
