/*
  Problem:
  You are working in an office with an old coffee machine that dispenses two different coffee flavours. 
  However, the new boss wants to add a new coffee machine with a touchscreen that 
  can also connect to the old coffee machine. Complete the provided code to add an adapter so that 
  the new touchscreen will  to work with the old coffee machine. Use the following UML class diagram for a guide:
*/


CoffeeMachineInterface.java

public interface CoffeeMachineInterface {

  public void chooseFirstSelection();
  public void chosseSecondSelection();


}


OldCoffeeMachine.java

public class OldCoffeeMachine {

  public void selectA() {
    System.out.println("A");
  };
  public void selectB(){
    System.out.println("B");
  };

}


CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

  OldCoffeeMachine oldCoffeeMachine;

  public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
    this.oldCoffeeMachine = oldCoffeeMachine;
  }

  public void chooseFirstSelection() {
    oldCoffeeMachine.selectA(); 
  }

  public void chooseSecondSelection() {
    oldCoffeeMachine.selectB();
  }

}
