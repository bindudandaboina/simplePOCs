package com.projects;

import java.util.Scanner;

public class NestedIf {
	// WAP to work basic matrimonial check

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your full name:");
		String name = sc.nextLine();
		System.out.println("nice to meet you mr." + name);
		System.out.println("tell about your assets&current salary");
		System.out.println("enter your assets:");
		double assets = sc.nextDouble();
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		if (assets >= 50000000.00 && salary >= 60000.00) {
			System.out.println("okay good");

			System.out.println("enter your age");
			int age = sc.nextInt();
			if (age >= 26 && age <= 28) {
				System.out.println("oh ok nice to meet");
				System.out.println("enter your height:");
				float height = sc.nextFloat();
				if (height >= 5.5 && height <= 6.5) {
					System.out.println("okay too procced");
					System.out.println("enter your weight:");
					double weight = sc.nextDouble();
					if (weight >= 50 && weight <= 70) {
						System.out.println("okay to finalize");
						System.out.println("do you have sibilings");
						boolean sibstatus = sc.nextBoolean();
						if (!sibstatus) {
							System.out.println("will proceed to next discussion");
						}
					} else {
						System.out.println("you must need to join gym");
					}
				} else {
					System.out.println("your not matching with our profile");

				}

			} else {
				System.out.println("your not matching with our profile");
			}

		} else {
			System.out.println("you can leave for the day");
		}

	}

}
