package com.danielvargas.programaenjava;

public class JavaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables creation:
		// Type variableName = Assignment;
		short varShort = 0;
		// Cast:
		double variableDouble = 100.79;
		int variableInt = (int) variableDouble;
		
		//Arrays:
		int[][] variableArray = new int[2][2];
		variableArray[0][0] = 2;
		variableArray[0][1] = 0;
		variableArray[1][0] = 1;
		variableArray[1][1] = 3;
		
		//if/else if/else:
		
		int x = 6;
		
		if(x>1) {
			System.out.println("x is greater than 1. \n");
		}
		else if(x==1) {
			System.out.println("x is equal 1. \n");
		}
		else {
			System.out.println("x is lower than 1. \n");
		}
		
		
		//switch:
		switch(x) {
			case 1:
				System.out.println("x = 1 \n");
			case 2:
				System.out.println("x = 2 \n");
			default:
				System.out.println("x it is neither 1 nor 2 \n");
				break;
		}
		
		//while:
		int y = 0;
		while(y < 5) {
			System.out.println("y = " + y);
			y++;
		}
		
		System.out.println("\n");
		
		//for:
		int[] Array = new int[5];
		
		for(int j=0; j < Array.length; j++) {
			Array[j] = j*j;
		}
		
		//for each:
		int index = 0;
		for(int i: Array) {
			System.out.println("Arreglo["+index+"] = " + i);
			index++;
		}
		
		
	}

}

