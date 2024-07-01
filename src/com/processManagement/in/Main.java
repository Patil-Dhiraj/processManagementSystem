package com.processManagement.in;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
	        ProcessManager manager = new ProcessManager();

	        while (true) {
	        	
	            System.out.println("Choose an option:");
	            System.out.println("1. Add Process");
	            System.out.println("2. Remove Process");
	            System.out.println("3. Search Process");
	            System.out.println("4. List All Processes");
	            System.out.println("5. Update Process Status");
	            System.out.println("6. View Pending Processes History");
	            System.out.println("7. View Completed Processes History");
	            System.out.println("8. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume the newline

	            switch (choice) {
	            
	                case 1:
	                	
		                    System.out.print("Enter Process ID: ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine(); // consume the newline
		                    System.out.print("Enter Process Name: ");
		                    String name = scanner.nextLine();
		                    System.out.print("Enter Process Status (Pending/Running/Completed): ");
		                    String status = scanner.nextLine();
		                    manager.addProcess(new Process(id, name, status));
		                    
		                    break;
		                    
	                case 2:
	                	
		                    System.out.print("Enter Process ID to remove: ");
		                    int removeId = scanner.nextInt();
		                    if (manager.removeProcess(removeId)) {
		                        System.out.println("Process removed successfully.");
		                    } else {
		                        System.out.println("Process not found.");
		                    }
		                    
		                    break;
	                    
	                case 3:
	                	
		                    System.out.print("Enter Process ID to search: ");
		                    int searchId = scanner.nextInt();
		                    Process process = manager.searchProcess(searchId);
		                    if (process != null) {
		                        System.out.println("Process found: " + process);
		                    } else {
		                        System.out.println("Process not found.");
		                    }
		                    
		                    break;
	                    
	                case 4:
	                	
		                    System.out.println("All Processes:");
		                    for (Process p : manager.listAllProcesses()) {
		                        System.out.println(p);
		                    }
		                    
		                    break;
	                    
	                case 5:
	                	
		                    System.out.print("Enter Process ID to update: ");
		                    int updateId = scanner.nextInt();
		                    scanner.nextLine(); // consume the newline
		                    System.out.print("Enter new status: ");
		                    String newStatus = scanner.nextLine();
		                    if (manager.updateProcessStatus(updateId, newStatus)) {
		                        System.out.println("Process status updated successfully.");
		                    } else {
		                        System.out.println("Process not found.");
		                    }
		                    
		                    break;
	                    
	                case 6:
	                	
		                    System.out.println("Pending Processes History:");
		                    for (Process p : manager.getPendingProcessesHistory()) {
		                        System.out.println(p);
		                    }
		                    
		                    break;
		                    
	                case 7:
	                	
		                    System.out.println("Completed Processes History:");
		                    for (Process p : manager.getCompletedProcessesHistory()) {
		                        System.out.println(p);
		                    }
		                    
		                    break;
		                    
	                case 8:
	                	
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    return;
	                    
	                default:
	                    	System.out.println("Invalid choice. Please try again.");
	            }
	        }
		
	}
	
}
