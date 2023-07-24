package com.aspire.LmsProject.model;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name ="user_entity")

public class UserEntity {
	@Id
	
	 @GeneratedValue(generator="system-uuid")
	 
	 @GenericGenerator(name="system-uuid", strategy = "uuid")
	 
	private String employee_id;
	private String employee_name;
	private String email_id;
	private String leave_type;
	private int leave_eligible;
	private int leave_taken;
	private int leave_remaining;
	private String ace_id;
	
	 
//    public UserEntity() {
//        this.ace_id= generateAceId();
//        this.employee_id= ace_id;
//    }
//
//    private static int staticNumber = 10000;
//
//    private String generateAceId() {
//        String prefix = "ACE";
//
//        staticNumber++;
//
//        StringBuilder aceIdBuilder = new StringBuilder(prefix);
//        aceIdBuilder.append(staticNumber);
//
//        return aceIdBuilder.toString();
//    }
//
//    private void setAceid(String aceid) {
//       
//    }
}
	
	


