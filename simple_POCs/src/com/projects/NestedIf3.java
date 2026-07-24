package com.projects;

import java.util.Scanner;

public class NestedIf3 {

	public static void main(String[] args) {
		// create scanner object to take user input
		Scanner sc = new Scanner(System.in);
		// step-1:check if user is registered
		System.out.println("Are you registered?:");
		boolean isRegistered = sc.nextBoolean();

		if (isRegistered) {
			// step-2:check if profile is completed
			System.out.println("Is your profile completed?: ");
			boolean isProfileComplete = sc.nextBoolean();

			if (isProfileComplete) {// Nested If 1
				// step 3:check java skills
				System.out.println("Do you have java skills?:");
				boolean hasJava = sc.nextBoolean();

				if (hasJava) {// Nested If 2
					// step 4:check sql skill
					System.out.println("Do you have SQL skill?:");
					boolean hasSQL = sc.nextBoolean();

					if (hasSQL) {// Nested If3
						// step 5:check communication skills
						System.out.println("Do you have communication skills?:");
						boolean hasCommunication = sc.nextBoolean();

						if (hasCommunication) {// NestedIf 4
							// final condition:All skills satisfied
							System.out.println("your eligible for top IT job");

						} else {
							// communication skill is missing
							System.out.println("Improve communication skill");
						}

					} else {
						// SQL skill is missing
						System.out.println("SQL skill is required");

					}
				} else {
					// java skills missing
					System.out.println("java skills is required");

				}

			} else {
				System.out.println("please complete your profile first");
			}

		} else {
			// user not registered
			System.out.println("please register first");

		}

	}
}
