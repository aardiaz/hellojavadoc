package com.annot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MathTSImpl implements TeacherService{

	@Override
	public void teach() {
		
		System.out.println(".....teaching math");
	}

}
