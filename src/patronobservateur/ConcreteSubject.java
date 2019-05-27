/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservateur;

import java.util.ArrayList;

/**

 */
public class ConcreteSubject extends AbstractSujet {

    private int state ;
    public ConcreteSubject(int state)
    {
        super();
        this.state=state;
        super.setListobs(new ArrayList<IObserver>());
    }
    public int getstate(){
        return state;
    }
    public void setstate(int state)
    {
        this.state=state;
        super.notifier();
    }

}
