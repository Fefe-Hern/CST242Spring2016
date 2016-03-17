package rocketSubjectObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Subject {
   private List<Observer> observers = new ArrayList<>();
   private double state;

   public double getState() {
      return state;
   }

   public void setState(double state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
