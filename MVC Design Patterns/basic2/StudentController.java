package basic2;

import java.util.Arrays;

public class StudentController {
	
	   private Student model;
	   private WindowView view;
	   
	   private String studentName;
	   private String studentId;

	   public StudentController(Student model, WindowView view){
	      this.model = model;
	      this.view = view;
	   }
	 
	   public void setStudentName(String name){
	      model.setName(name);	
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }
	   
	   public String[] getStudentDetails() {
		   return view.getStudentDetails();
	   }
	   
	   public void setStudentDetails(String[] info) {
		   model.setName(info[0]);
		   model.setIdNum(info[1]);
	   }
	   
	   public void setStudentIdNum(String idNum){
	      model.setIdNum(idNum);		
	   }

	   public String getStudentIdNum(){
	      return model.getIdNum();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(model.getName(), model.getIdNum());
	   }	
	}