package multipleView;

public class Controller {
	
	private View view;
	private Student model;
	
	
	public Controller(Student model, View view) {
	
		view.setGUIVIEWListener(new GUIVIEW1Listener() {

			@Override
			public void okButtonClicked(GUIView1EventObject ev) {
				model.setName(ev.getName());
				model.setId(ev.getId());
				
				
			}
			
		});
		
	}

}
