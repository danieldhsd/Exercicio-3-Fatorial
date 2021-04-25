package main;

import math.Fatorial;

public class FatorialMainTeste {

	public static void main(String[] args) {
		int resp = Fatorial.getFatorial(5);
		System.out.println(resp);
		
		resp = Fatorial.getFatorial(4);
		System.out.println(resp);
		
		resp = Fatorial.getFatorial(3);
		System.out.println(resp);
		
		resp = Fatorial.getFatorial(2);
		System.out.println(resp);
		
		resp = Fatorial.getFatorial(1);
		System.out.println(resp);
		
		resp = Fatorial.getFatorial(0);
		System.out.println(resp);
		
		try {
			resp = Fatorial.getFatorial(-1);
			System.out.println(resp);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
