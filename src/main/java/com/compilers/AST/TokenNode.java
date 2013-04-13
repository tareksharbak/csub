package com.compilers.AST;

public class TokenNode extends ASTNode
{
	private String _name;
	private String _value;
	private ASTNode _parent;
	
	public ASTNode get_parent() {
		return _parent;
	}
	public void set_parent(ASTNode _parent) {
		this._parent = _parent;
	}	
	public String get_Name() {
		return _name;
	}
	public String get_Value() {
		return _value;
	}
	
	public TokenNode(String _Name, String _Value)
	{
		this._name = _Name;
		this._value = _Value;
	}
}
