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
