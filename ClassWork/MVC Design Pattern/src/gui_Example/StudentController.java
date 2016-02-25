package gui_Example;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class StudentController {

    public StudentController(Student model, WindowView window) {
        window.setokButtonListener(new OkButtonListener() {
            @Override
            public void okButtonClicked(OKButtonEventObject ev) {
                model.setName(ev.getName());
                model.setId(ev.getId());
                String str = model.getName() + " says hello.";
                window.setNameField(str);
                window.setIdField(model.getId());
            }
        });
    }
    
}
