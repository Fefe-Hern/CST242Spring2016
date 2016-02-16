package basic1;
public class StudentController {
	
	   private Student model;
	   private StudentView view;

	   public StudentController(Student model, StudentView view){
	      this.model = model;
	      this.view = view;
	   }
	   
	   public void getStudentInfo() {
		   String info[] = view.getStudentDetails();
		   String name =info[0];
		   String id = info[1];
		   setStudentName(name);
		   setStudentIdNum(id);
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