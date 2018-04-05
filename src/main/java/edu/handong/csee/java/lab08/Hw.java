package edu.handong.csee.java.lab08;

import java.util.Scanner;

public class Hw {
	
	private double highestsales
	private averageSales
	private Salesman team;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketingAnalyzer analyzer = new MarketingAnalyzer
				
		analyzer.getData();
		computeAverage
		computeHighestSales
		result
	}
		
	public void getData() {
			
			System.out.println("Enter the number of salesman: ");
			Scanner myKeyboard = new Scanner(System.in);
			
			int numOfSalesmen = myKeyboard.nextInt();
			
			team = new Salesman[numOfSalesmen];
			
			for(int i=0; i < numOfSalesmen; i++) {
				System.out.println("Enter data for associate number" + (i+1));
				System.out.print("Name");
				myKeyboard.nextLine();
				String name = myKeyboard.nextLine();
				System.out.print("Sales?");
				double sales = myKeyboard.nextDouble();
				team[i] = new Salesman();
				team[i].setName(name);
				team[i].setSales(sales);
				
			}
			
		}

	public noid computeAverage() {
		
		double sum=0;
		
		for(int i=0 i<team.length; i++){
			sum = sum + team[i].getmSales(); {
			
			averageSales = sum/team.length
					
			}
			
	public void computeHighestsales() {
		double highestSales = 0;
		
		for (int i = 0; i<team. length; i++) {
			if(highestSales<)
		
		}
		
		this.highestSales = highestSales;
	
		
		}
	
	public void printResult
	
	}
	
	
	}

