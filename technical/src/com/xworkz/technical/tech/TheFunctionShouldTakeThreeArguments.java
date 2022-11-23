package com.xworkz.technical.tech;

public class TheFunctionShouldTakeThreeArguments {

	public static void main(String[] args) {
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

}
