package com.compilers.AST;

public class TokenNode extends ASTNode
{
	private String name;
	private String value;
	private Position position;
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
	
	public TokenNode(String name, String value, Position position)
	{
		this.name = name;
		this.value = value;
		this.position = position;
	}
}
