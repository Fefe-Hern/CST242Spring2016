package gradeObservers;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John", 2.0);
		
		GpaObserver observer1 = new GpaObserver(s);
		s.setGpa(1.0);
		s.setGpa(2.0);
		s.setGpa(3.0);
		GpaObserver observer2 = new GpaObserver(s);
		s.setGpa(2.2);
		s.setGpa(3.3);
		s.setGpa(4.4);
		s.unregister(observer2);
		s.setGpa(2.2);
		s.setGpa(3.3);
		s.setGpa(4.4);
	}

}
