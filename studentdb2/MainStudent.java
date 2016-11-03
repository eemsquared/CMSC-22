package lab10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
	
	List<Student> myList = new ArrayList<Student>();
	Student student = null;
	FileInputStream fis;
	ObjectInputStream ois;

	public void run() throws IOException {

		try {

			fis = new FileInputStream("testing.txt");
			ois = new ObjectInputStream(fis);

			if (ois.read() == -1) {
				myList = (List<Student>) ois.readObject();
				System.out.println(myList.size());
			}
			ois.close();

		} catch (EOFException m) {
			// m.printStackTrace();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		}

		int choice;
		do {
			System.out.println(
					"\t\tMenu\n\t1. Register Student\n\t2. Search Student\n\t3. Delete Student\n\t4. Save Student\n\t5. Exit\n");
			choice = new Scanner(System.in).nextInt();
			boolean b = false;

			switch (choice) {

			case 1: {

				System.out.println("Student Number:");
				String isStudentNumber = new Scanner(System.in).nextLine();
				check(myList, isStudentNumber);

				System.out.println("First Name:");
				String isFirstName = new Scanner(System.in).nextLine();

				System.out.println("Middle Initial:");
				char isMiddleInitial = new Scanner(System.in).next(".").charAt(0);

				System.out.println("Last Name:");
				String isLastName = new Scanner(System.in).nextLine();

				System.out.println("Degree Program:");
				String isCourse = new Scanner(System.in).nextLine();

				System.out.println("Year Level:");
				int isYearLevel = new Scanner(System.in).nextInt();

				System.out.println("Crush Name:");
				String isCrushName = new Scanner(System.in).nextLine();

				System.out.println("Course Code:");
				String isCourseCode = new Scanner(System.in).nextLine();

				System.out.println("Course Description:");
				String isCourseDescription = new Scanner(System.in).nextLine();

				student = new Student(isStudentNumber, isFirstName, isMiddleInitial, isLastName, isCourse, isYearLevel,
						isCrushName, new Course(isCourseCode, isCourseDescription));
				myList.add(student);
				System.out.println("\nSTUDENT ADDED!");
				break;
			}

			case 2: {

				System.out.println("Search Student(Enter student number):");
				String searchStudentNumber = new Scanner(System.in).nextLine();

				for (Student s : myList) {
					if (s.getStudentNumber().equals(searchStudentNumber)) {
						System.out.println("Student Number: " + s.getStudentNumber() + "\n" + "Name: " + s.getLastName()
								+ ", " + s.getFirstName() + " " + s.getMiddleInitial() + "." + "\n" + "Program: "
								+ s.getCourse() + "\n" + "Year Level: " + s.getYearLevel() + "\n" + "Crush Name: "
								+ s.getCrushName() + "\n" + "Course: " + s.getFaveSubject() + "\n");
						b = true;
						break;
					}
				}
				if (b == false) {
					System.out.println("Student does not exist!\n");
				}

				break;
			}

			case 3: {
				System.out.println("Delete Student(Enter student number):");
				String deleteStudent = new Scanner(System.in).nextLine();
				for (Student s : myList) {
					if (s.getStudentNumber().equals(deleteStudent)) {
						myList.remove(s);
						System.out.println("\nStudent " + s.getStudentNumber() + " deleted!\n");
						b = true;
						break;
					}
				}
				if (b == false) {
					System.out.println("Cannot remove student. No such student found.\n");
				}
				break;

			}

			case 4: {
				try {

					FileOutputStream fos = new FileOutputStream("testing.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);

					oos.writeObject(myList);
					oos.close();
					fos.close();

					System.out.println("SAVED!");

				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			}

			case 5: {
				System.out.println("Exit!");
				break;
			}
			default:
				throw new IllegalArgumentException("Invalid input!\n");
			}
		} while (choice != 5);
	}


	private static void check(List<Student> myList, String studentNumber) {
		for (Student s : myList) {
			if (s.getStudentNumber().equals(studentNumber)) {
				throw new IllegalArgumentException("Student already exist!");
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		MainStudent mm = new MainStudent();
		mm.run();
	}

	

}
