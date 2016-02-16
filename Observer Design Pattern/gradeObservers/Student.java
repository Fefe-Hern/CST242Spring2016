package gradeObservers;

import java.util.ArrayList;

public class Student implements Subject {
	
	private ArrayList<Observer> observerList;
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		observerList = new ArrayList<Observer>();
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public void register(Observer newObserver) {
		observerList.add(newObserver);
	}

	@Override
	public void unregister(Observer existingObserver) {
		int index = observerList.indexOf(existingObserver);
		observerList.remove(index);
		System.out.println("Observer " + (index + 1) + " deleted.");
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observerList) {
			o.update(name, gpa);
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObserver();
	}

}
