package tk.ebalsa.strutsok.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;


@Results({
	   @Result(name="success", location="/success.jsp"),
	   @Result(name="input", location="/index.jsp")
	})
	public class myclassAction extends ActionSupport{
	   private String name;
	   private int age;

	   @Action(value="/empinfo")
	   public String execute() 
	   {
	       return SUCCESS;
	   }

	   @RequiredFieldValidator( message = "The name is required" )
	   public String getName() {
	       return name;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }

	   @IntRangeFieldValidator(message = "Age must be in between 28 and 65",
	                                      min = "29", max = "65")
	   public int getAge() {
	       return age;
	   }
	   public void setAge(int age) {
	       this.age = age;
	   }
	}