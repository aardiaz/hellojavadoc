package com.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component//(value = "colz") //allow spring to create bean
public class College {
	
	@Value("KEC")
	private String name;
	@Value("01499887")
	private String phone;
	
	@Autowired //bean injection
	private Student s;
	
	
	@Autowired
    @Qualifier("nepaliTSImpl")
	private TeacherService  ts;
	
    public void printCollege() {
    	System.out.println("College Name  = "+name);
    	System.out.println("Phone = "+phone);
    	
    	s.printStudent();
    	ts.teach();
    }

}
