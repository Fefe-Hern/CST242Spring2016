package controller;

import model.Student;
import view.OKButtonEventObject;
import view.OKButtonListener;
import view.WindowView;

public class StudentController {
	
	public StudentController(Student model, WindowView window) {
		window.setOKButtonListener(new OKButtonListener() {

			@Override
			public void okButtonClicked(OKButtonEventObject ev) {
				model.setName(ev.getName());
				model.setId(ev.getId());
				// change the data a bit
				String str = model.getName() + " says hello";
				window.setNameField(str);
				window.setIdField(model.getId());
			}
		});
	}
}
