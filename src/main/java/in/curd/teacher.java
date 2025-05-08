package in.curd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class teacher {
	@Id
	private int tid;
	private String tname;
	private String city;
	public teacher() {
		// TODO Auto-generated constructor stub
	}
	
	
	public teacher(int tid, String tname, String city) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.city = city;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "teacher [tid=" + tid + ", tname=" + tname + ", city=" + city + "]";
	}
	
	

}
