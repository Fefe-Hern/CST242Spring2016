package basic;
public class StudentController {
	
	   private Student model;
	   private StudentView view;

	   public StudentController(Student model, StudentView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setStudentName(String name){
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
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