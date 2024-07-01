package com.processManagement.in;

import java.util.Objects;

public class Process {
	
	private int processId;
    private String processName;
    private String status;
    
		public Process(int processId, String processName, String status) {
			super();
			this.processId = processId;
			this.processName = processName;
			this.status = status;
		}

		public int getProcessId() {
			return processId;
		}

		public void setProcessId(int processId) {
			this.processId = processId;
		}

		public String getProcessName() {
			return processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
    
			 public String toString() {
			        return "Process{" +
			                "processId=" + processId +
			                ", processName='" + processName + '\'' +
			                ", status='" + status + '\'' +
			                '}';
			    }

			@Override
			public int hashCode() {
				return Objects.hash(processId, processName, status);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Process other = (Process) obj;
				return processId == other.processId && Objects.equals(processName, other.processName)
						&& Objects.equals(status, other.status);
				
			}

		
}
