package com.processManagement.in;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessManager {
	
	 private List<Process> processList;
	 private LinkedList<Process> pendingProcessesHistory;
	 private LinkedList<Process> completedProcessesHistory;
	 
	 public ProcessManager() {
	        processList = new ArrayList<>();
	        pendingProcessesHistory = new LinkedList<>();
	        completedProcessesHistory = new LinkedList<>();
	    }
	 
	 // Add Process
	    public void addProcess(Process process) {
	        processList.add(process);
	        if ("Pending".equals(process.getStatus())) {
	            addPendingProcess(process);
	        } else if ("Completed".equals(process.getStatus())) {
	            addCompletedProcess(process);
	        }
	    }
	    
	 // Remove Process
	    public boolean removeProcess(int processId) {
	        for (Process process : processList) {
	            if (process.getProcessId() == processId) {
	                processList.remove(process);
	                return true;
	            }
	        }
	        return false;
	    }

	    
	    // Search for a Process
	    public Process searchProcess(int processId) {
	        for (Process process : processList) {
	            if (process.getProcessId() == processId) {
	                return process;
	            }
	        }
	        return null;
	    }
	    
	 // List All Processes
	    public List<Process> listAllProcesses() {
	        return new ArrayList<>(processList);
	    }
	    
	 // Update Process Status
	    public boolean updateProcessStatus(int processId, String newStatus) {
	        Process process = searchProcess(processId);
	        if (process != null) {
	            process.setStatus(newStatus);
	            if ("Pending".equals(newStatus)) {
	                addPendingProcess(process);
	            } else if ("Completed".equals(newStatus)) {
	                addCompletedProcess(process);
	            }
	            return true;
	        }
	        return false;
	    }

	    // Add Pending Process to History
	    public void addPendingProcess(Process process) {
	        pendingProcessesHistory.add(process);
	    }

	    // Add Completed Process to History
	    public void addCompletedProcess(Process process) {
	        completedProcessesHistory.add(process);
	    }

	    // Get Pending Processes History
	    public List<Process> getPendingProcessesHistory() {
	        return new LinkedList<>(pendingProcessesHistory);
	    }

	    // Get Completed Processes History
	    public List<Process> getCompletedProcessesHistory() {
	        return new LinkedList<>(completedProcessesHistory);
	    }
	 
}


	    

	


