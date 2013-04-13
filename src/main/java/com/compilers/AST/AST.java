package com.compilers.AST;

public class AST
{
	private ProgramNode _root;
	
	public void set_root(ProgramNode _root) {
		this._root = _root;
	}
	public ProgramNode get_root() {
		return _root;
	}

	public AST()
	{
		this._root = new ProgramNode("");
	}
}
