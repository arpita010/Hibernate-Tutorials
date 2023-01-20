package com.ManyToMany;
import javax.persistence.*;
import java.util.*;
@Entity
public class Project {
		@Id
		private int pid;

		private String projectName;
		@ManyToMany
		private List<Employee> emps;
		public int getPid() {
			return pid;
		}
		public String getProjectName() {
			return projectName;
		}
		public List<Employee> getEmps() {
			return emps;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public void setEmps(List<Employee> emps) {
			this.emps = emps;
		}
}
