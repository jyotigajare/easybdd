package stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Student;

public class Step7 {
	
	@Given("praful sir send the registration link")
	public void praful_sir_send_the_registration_link() {
		Assert.assertEquals("jyoti", "jyoti");
		System.out.print("praful sir send the registration");
		
	}

	@When("student fill the information")
	public void student_fill_the_information(List<Student> list)
	
			 {
		
		for(Student st:list) {
			
		
		System.out.println(st);
		}
	}

	@When("click the \"registrationbutton\"and login the zoom meeting")
	public void click_the_registrationbutton_and_login_the_zoom_meeting() {
		Assert.assertEquals("jyoti", "jyoti");
		System.out.println("click button");
	}

	@Then("see the sucess message")
	public void see_the_sucess_message() {
		System.out.println("sucess message");
	}
@DataTableType
public Student m1(Map<String, String> map) {
	return new Student(map.get("name"), map.get("address"), map.get("phone"));
	
}


		
}
