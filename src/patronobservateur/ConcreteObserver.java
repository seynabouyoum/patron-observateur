/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservateur;

/**

 */
public class ConcreteObserver extends ConcreteSubject implements IObserver  {

    public ConcreteObserver(int state) {
        super(state);
    }

   // @Override
    public void update() {

           System.out.println("changement bien mis a jour");

    }

}
