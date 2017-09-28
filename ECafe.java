import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ECafe {
public static void main(String[] args) {
	Scanner inputVal=new Scanner(System.in);
	ArrayList<Order> customerOrder=new ArrayList<Order>();
	
	String[] appetizers= {"Chunky Shrimp Guacamole","Buffalo Chicken Wings","Spanish Omelette","Shrimp Avocado GBread"};
	String[] soups= {"Hot and Sour Soup","Spicy Black Bean Soup"};
	String[] mainCourse= {"Easy Meatloaf	","Garlic Chicken	","Chicken Marsala	","Grilled Salmon	","Maple Salmon	","Salsa Chicken	"};
	String[] sideDishes= {"Russian Salad","Baked Potato Fries","Superb Sauteed Mushrooms."};
	int itemSelected;
	int continu=1;
	String name;
	int contact;
	String address = null;
	String time;
	
	
	System.out.println("Welcome to The Cafe Westros ");
	
	while(continu!=0) {
	System.out.println("*****Select Your Order From the Menu: *******"
			+ "\n1-Appetizers\n"
			+ "2-Soups\n"
			+ "3-Main Course Dishes\n"
			+ "4-Side Dishes\n");
	int menuSelection = inputVal.nextInt();
	if(menuSelection==1) {
		// takes 6 min to prepare
		System.out.println("****Appetizers Menu***** ");
		for (int i = 0; i < appetizers.length; i++) {
			System.out.println(i + 1 + ":" + appetizers[i]);
		}
		System.out.println("****Enter the item number to select ");
		itemSelected=inputVal.nextInt();
		Order obj = new Order();
		obj.itemSelected=appetizers[itemSelected-1];
		obj.itemPrice=200;
		obj.itemTime=6;
		customerOrder.add(obj);	

	}else if(menuSelection==2) {
		// takes 10 min to prepare
		System.out.println("****Soups Menu***** ");
		for (int i = 0; i < soups.length; i++) {
			System.out.println(i + 1 + ":" + soups[i]);
		}
		System.out.println("****Enter the item number to select ");
		itemSelected=inputVal.nextInt();
		Order obj = new Order();
		obj.itemSelected=soups[itemSelected-1];
		obj.itemPrice=250;
		obj.itemTime=10;
		customerOrder.add(obj);
		
	}else if(menuSelection==3) {
		// takes 15 min to prepare
		System.out.println("****Main Course Menu***** ");
		for (int i = 0; i < mainCourse.length; i++) {
		System.out.println(i + 1 + ":" + mainCourse[i]);
		}
		System.out.println("****Enter the item number to select ");
		itemSelected=inputVal.nextInt();
		Order obj = new Order();
		obj.itemSelected=mainCourse[itemSelected-1];
		obj.itemPrice=550;
		obj.itemTime=15;
		customerOrder.add(obj);
		
	}else {
		// takes 5 min to prepare
		System.out.println("****Side Dishes ***** ");
		for (int i = 0; i < sideDishes.length; i++) {
			System.out.println(i+1+":"+sideDishes[i]);
		}
		System.out.println("****Enter the item number to select ");
		itemSelected=inputVal.nextInt();
		Order obj = new Order();
		
		obj.itemSelected=sideDishes[itemSelected-1];
		obj.itemPrice=150;
		obj.itemTime=5;
		customerOrder.add(obj);
	}

			System.out.print("Order Something Else[yes=1 / no=0] ");
			continu=inputVal.nextInt();
			
			if (continu == 0) {
				System.out.println("1-Home Delivery\n"
						+ "2-Self Pick Up");
				int delivery=inputVal.nextInt();
				if(delivery==1) {
					System.out.println("Provide your name,contact and address");
					System.out.print("name: ");
					name=inputVal.next();
					System.out.print("contact: ");
					contact=inputVal.nextInt();
					System.out.print("address: ");
					address=inputVal.next();
				}else {
					System.out.println("Provide your name,contact and pick up time");
					System.out.print("name: ");
					name=inputVal.next();
					System.out.print("contact: ");
					contact=inputVal.nextInt();
					System.out.print("pick up time(mention time in am/pm, cafe timings 11:00am-10:30pm): ");
					time=inputVal.next();
				}
				System.out.println("Your Order is: \n");
				System.out.println("Customer Name: " +name+"\n"
						+ "Contact Number: " + contact +"\n"
						+ "Address: " + address +"\n\n"
						+ "Item Name			"
						+ "	Price"
						+ "		Preparation Time");
				
				for (Order s : customerOrder) {
					System.out.println(s.itemSelected+
							"			"+s.itemPrice+" Rs"+
							"			"+s.itemTime+" mins");
				}
				int totalPrice=0;
				int totalTime=0;
				System.out.println("----------------------------------------"
						+ "-------------------------------------------------");
				for (Order s : customerOrder) {
					
					totalPrice+=s.itemPrice;
					totalTime+=s.itemTime;
					
				}

				System.out.print("Total amount:				"+totalPrice +" Rs");
				System.out.println("		Total preparation time:"+totalTime +" mins");
				break;
			}
		}
	}
}
class Order{
	int itemTime;
	int itemPrice;
	String itemSelected;
	
}

