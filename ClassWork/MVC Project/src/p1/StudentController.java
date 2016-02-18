package p1;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class StudentController {
    private WindowView view;
    private Student model;

    public StudentController(WindowView view) {
        view.setWindowListener(new WindowListener() {
            @Override
            public void buttonClicked(WindowEvent ev) {
                model = ev.getStudent();
                model.setName(ev.getStudent().getName());
                model.setId(ev.getStudent().getId());
                System.out.println(ev.getSource());
                System.out.println(ev.getStudent());
            }
            
        });
        
    }
    
    
}
