package com.compilers.AST;

import java.util.ArrayList;

public abstract class ASTNode 
{
	private String _name;
	private ASTNode _parent;
	private ArrayList<ASTNode> _children;
	
	public String get_Name() {
		return _name;
	}
	public void set_Name(String _Name) {
		this._name = _Name;
	}
	public ASTNode get_parent() {
		return _parent;
	}

	public void set_parent(ASTNode _parent) {
		this._parent = _parent;
	}

	public ArrayList<ASTNode> get_children() {
		return _children;
	}

	public void set_children(ArrayList<ASTNode> _children) {
		this._children = _children;
	}

	public ASTNode()
	{
		this._name = "";
		this._parent = null;
		this._children = new ArrayList<ASTNode>();
	}
}
