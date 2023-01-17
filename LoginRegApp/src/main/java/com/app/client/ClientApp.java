package com.app.client;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.controller.UserController;
import com.app.model.Login;
import com.app.model.USer;
import com.app.util.HibernateUtil;
public class ClientApp {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session loginController = HibernateUtil.getSession();
		String choice = "";
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("!-----Welcome to KBT system-----!");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("--------------------------------------");
			System.out.println("Enter your choice: ");
			int ch = sn.nextInt();
			switch (ch) {
			case 1:
				String user = LoginCase();
				switch (user) {
				case "admin":
					System.out.println("Welcome to admin Dashboard");
					System.out.println("--------------------------------");
					System.out.println("1. Add a hotel");
					System.out.println("2. Remove a hotel");
					System.out.println("3. Update HotelName");
					System.out.println("--------------------------------------");
					System.out.println("Enter your choice: ");
					int ch1 = sn.nextInt();
					switch (ch1) {
					case 1:
						System.out.println("Enter hotel name to be added: ");
						String hotelName=sn.next();
						
						break;
					case 2:
						System.out.println("Enter hotel id to be removed: ");
						int hotel_id=sn.nextInt();
						Login login=new Login();
						Session ses=HibernateUtil.getSession();
						SessionFactory factory=ses.getSessionFactory();
						Query query=ses.createQuery("delete from USer where id='"+hotel_id+"'");
						System.out.println("Hotel removed successfully...");
						Transaction tx=null;
						try {
							tx=ses.beginTransaction();
							tx.commit();
						}//try
						catch(Exception e)
						{
							tx.rollback();
							
						}//catch
						//List<USer>list=query.list();
					    //list.stream().findFirst().get();
						break;
					case 3:
						
						break;
					default:
						System.out.println("Enter the right choice...");
					}
					break;
				case "hotel":
					System.out.println("welcome to hotel Dashboard");
					break;
				case "user":
					System.out.println("Welcome to user Dashboard");
					break;
				default:
					System.out.println("Invalid username and password or your account is deactive");
				}
				break;
			case 2:
				RegisterCase(sn);

				break;
			case 3:
				System.out.println("Do you want to continue...(y/Y");
				choice = sn.next();
			}
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Thank you visit again...!");

	}

	private static void RegisterCase(Scanner sn) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("!-----Welcome to Register System-----");

		USer register = UserController.getregister();
		if (register != null)
			System.out.println("Register Successfuly");
		else
			System.out.println("Something went wrong");
	}

	private static String LoginCase() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("!-----Welcome to Login System-----");
		return UserController.getlogin();

	}

}
