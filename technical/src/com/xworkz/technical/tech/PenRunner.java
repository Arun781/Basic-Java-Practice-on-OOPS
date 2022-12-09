package com.xworkz.technical.tech;

import com.xworkz.technical.programs.Pen;

public class PenRunner {

	public static void main(String[] args) {

		Pen pen = new Pen();
//		pen.method5();
		try {
			pen.method5();
		} catch (Exception e) {
			
			System.out.println("surya  :"+e
					);		}
		}

}
