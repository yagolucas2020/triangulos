package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;
public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				Triangule x, y;
				x = new Triangule();
				y = new Triangule();
				
				
				System.out.println("Enter the measures of triangleX: ");
				x.a = sc.nextDouble();
				x.b= sc.nextDouble();
				x.c = sc.nextDouble();
				
				System.out.println("Enter the measures of triangleY: ");
				y.a = sc.nextDouble();
				y.b= sc.nextDouble();
				y.c = sc.nextDouble();
				
				double p = (x.a + x.b + x.c) /2.0;
				double areaX = Math.sqrt(p* (p - x.a) * (p - x.b) * (p-x.c));
				
				p = (y.a + y.b + y.c) /2.0;
				double areaY = Math.sqrt(p* (p - y.a) * (p - y.b) * (p-y.c));
				
				System.out.printf("Triangle X area: %4f%n", areaX);
				System.out.printf("Triangle X area: %4f%n", areaY);
				
				if(areaX > areaY) {
					System.out.println("Larger area: X: " + areaX);
				} else {
					System.out.println("Larger area: Y: " + areaY);
				}
				sc.close();
			}

		}
	
