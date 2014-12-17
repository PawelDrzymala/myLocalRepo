package pl.imsi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;





@ManagedBean(name ="userBean")
@RequestScoped
public class UserBean {
	private String text;
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String date;
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String name="Pawel";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
