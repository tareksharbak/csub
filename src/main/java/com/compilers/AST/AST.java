package com.compilers.AST;

public class AST
{
	private ProgramNode root;
	
	public void set_root(ProgramNode root) {
		this.root = root;
	}
	public ProgramNode getRoot() {
		return root;
	}

	public AST()
	{
		this.root = new ProgramNode("");
	}
}
