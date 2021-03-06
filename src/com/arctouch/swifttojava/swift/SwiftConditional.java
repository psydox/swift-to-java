package com.arctouch.swifttojava.swift;

import java.util.ArrayList;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class SwiftConditional implements SwiftExpression {
	public SwiftExpression condition;
	public final ArrayList<SwiftExpression> ifTrue = new ArrayList<SwiftExpression>();
	public final ArrayList<SwiftExpression> ifNot = new ArrayList<SwiftExpression>();
	
	@Override
	public String toString() {
		/*
		StringBuilder statement = new StringBuilder();
		
		statement.append("if (");
		statement.append(condition.toString());
		statement.append(") {\n");
		for (SwiftExpression exp : ifTrue) {
			statement.append(exp.toString());
			statement.append(";\n");
		}
		if (ifNot.isEmpty()) {
			statement.append("}\n");
			return statement.toString();
		}
		statement.append("} else {\n");
		for (SwiftExpression exp : ifNot) {
			statement.append(exp.toString());
			statement.append(";\n");
		}
		statement.append("}\n");
		return statement.toString();
		*/
		
		STGroup group = new STGroupFile("template/if.stg");
		ST st = group.getInstanceOf("ifStatement");
		st.add("ifData", this);
		return st.render();

	}
}
