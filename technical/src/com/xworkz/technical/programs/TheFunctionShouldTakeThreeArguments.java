package com.xworkz.technical.programs;

import java.util.function.DoubleFunction;

public class TheFunctionShouldTakeThreeArguments {
	
	function basicMathOp(operation, value1, value2) {
		  if (operation === '+') {
		    return value1 + value2;
		  }
		  if (operation === '-') {
		    return value1 - value2;
		  }
		  if (operation === '*') {
		    return value1 * value2;
		  }
		  if (operation === '/') {
		    return value1 / value2;
		  }
		}
		basicMathOp('+', 4, 4);  // 8
		basicMathOp('-', 4, 4);  // 0
		basicMathOp('*', 4, 4);  // 16
		basicMathOp('/', 4, 4);  // 11
}

	/*can also do this
	def basic_op(o, a, b):
	    return {'+':a+b,'-':a-b,'*':a*b,'/':a/b}.get(o)'''*/


