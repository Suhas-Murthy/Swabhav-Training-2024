package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement;// parameterrised queries are excecuted
	private Scanner scanner = new Scanner(System.in);

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "sql@2019");
			statement = connection.createStatement();
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getInventoryTableDetails() {
		try {
			ResultSet dbInventoryData = statement.executeQuery("select * from inventory");
			while (dbInventoryData.next()) {
				System.out.println(dbInventoryData.getInt(1) + "\t" + dbInventoryData.getInt(2) + "\t"
						+ dbInventoryData.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getOrderDetailTableDetails() {
		try {
			ResultSet dbOrderDetailsData = statement.executeQuery("select * from orderdetails");
			while (dbOrderDetailsData.next()) {
				System.out.println(dbOrderDetailsData.getInt(1) + "\t" + dbOrderDetailsData.getInt(2) + "\t"
						+ dbOrderDetailsData.getInt(3) + "\t" + dbOrderDetailsData.getInt(4) + "\t"
						+ dbOrderDetailsData.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getOrderDetails() {
		try {
			ResultSet dbOrderData = statement.executeQuery("select * from orders");
			while (dbOrderData.next()) {
				System.out
						.println(dbOrderData.getInt(1) + "\t" + dbOrderData.getDate(2) + "\t" + dbOrderData.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getProductDetails() {
		try {
			ResultSet dbProductData = statement.executeQuery("select * from products");
			while (dbProductData.next()) {
				System.out.println(dbProductData.getInt(1) + "\t" + dbProductData.getString(2) + "\t"
						+ dbProductData.getString(3) + dbProductData.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getSuppliersDetails() {
		try {
			ResultSet dbSupplierData = statement.executeQuery("select * from suppliers");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getString(2) + "\t"
						+ dbSupplierData.getString(3) + dbSupplierData.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------
	public void queryOne() {
		System.out.println("q1: Enter List all products along with their supplier names:");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select p.Name, s.Name from products p LEFT JOIN suppliers s on p.SupplierID = s.SupplierID;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getString(1) + "\t" + dbSupplierData.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryTwo() {
		System.out.println("q2: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select o.OrderID, o.OrderDate, p.Name, od.Quantity, od.Price from Orders o join OrderDetails od on o.OrderID = od.OrderID join Products p on od.ProductID = p.ProductID;");
			while (dbSupplierData.next()) {
				System.out.println(
						dbSupplierData.getInt(1) + "\t" + dbSupplierData.getDate(2) + "\t" + dbSupplierData.getString(3)
								+ "\t" + dbSupplierData.getInt(4) + "\t" + dbSupplierData.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryThree() {
		System.out.println("q3: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select s.SupplierID, s.Name, s.ContactInfo, s.Address from suppliers s join products p on s.SupplierID = p.SupplierID where p.ProductID = 4;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getString(2) + "\t"
						+ dbSupplierData.getString(3) + "\t" + dbSupplierData.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryFour() {
		System.out.println("q4: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select p.ProductID, p.Name, i.QuantityOnHand from Products p join Inventory i on p.ProductID = i.ProductID;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getString(2) + "\t"
						+ dbSupplierData.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryFive() {
		System.out.println("q5: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select o.OrderID, o.OrderDate, o.SupplierID from Orders o where o.OrderDate >= date_sub(current_date, interval 1 month);");
			while (dbSupplierData.next()) {
				System.out.println(
						dbSupplierData.getInt(1) + "\t" + dbSupplierData.getDate(2) + "\t" + dbSupplierData.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void querySix() {
		System.out.println("q6: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"SELECT od.ProductID, SUM(od.Quantity) AS TotalQuantity, p.name FROM OrderDetails od left join products p on od.ProductID = p.ProductID GROUP BY ProductID;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getInt(2) + "\t"
						+ dbSupplierData.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void querySeven() {
		System.out.println("q7: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select o.orderid, sum(od.Quantity* Price) as totalAmountSpent From orders o Inner join orderdetails od on o.OrderID = od.OrderID group by od.OrderID;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryEight() {
		System.out.println("q8: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"SELECT p.name AS ProductName, COUNT(DISTINCT p.SupplierID) AS SupplierCount FROM Products p GROUP BY p.ProductID, p.Name HAVING COUNT(DISTINCT p.SupplierID) > 1;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getString(1) + "\t" + dbSupplierData.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryNine() {
		System.out.println("q9: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select p.name, avg(i.QuantityOnHand) as AverageInventory from inventory i join products p on p.Productid = i.Productid group by p.productid;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getString(1) + "\t" + dbSupplierData.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void queryTen() {
		System.out.println("q10: ");

		try {
			ResultSet dbSupplierData = statement.executeQuery(
					"select s.*, p.* From suppliers s right join products p on p.SupplierID = s.SupplierID where p.ProductID is null;");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getString(2) + "\t"
						+ dbSupplierData.getString(3) + "\t" + dbSupplierData.getString(4) + "\t"
						+ dbSupplierData.getInt(5) + "\t" + dbSupplierData.getString(6) + "\t"
						+ dbSupplierData.getString(7) + "\t" + dbSupplierData.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
