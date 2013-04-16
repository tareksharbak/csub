package com.compilers.AST;

import java.util.ArrayList;

public class ASTNode 
{
	private String name;
	private ASTNode parent;
	private ArrayList<ASTNode> children;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ASTNode getParent() {
		return parent;
	}

	public void setParent(ASTNode parent) {
		this.parent = parent;
	}

	public ArrayList<ASTNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<ASTNode> children) {
		this.children = children;
	}
	
	public void addChild(ASTNode child) {
		this.children.add(child);
	}

	public ASTNode()
	{
		this.name = "";
		this.parent = null;
		this.children = new ArrayList<ASTNode>();
	}
}
