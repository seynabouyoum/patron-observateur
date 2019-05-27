/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservateur;

import static java.io.FileDescriptor.in;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import static javax.management.Query.in;

/**
 *
 *
 */
public abstract class AbstractSujet {
    private ArrayList<IObserver> Listobs;
    public ArrayList<IObserver> getListobs(){
        return Listobs;
    }
    public void setListobs(ArrayList<IObserver> Listobs)
    {
        this.Listobs=Listobs;
    }

    public void register (IObserver o){
    Listobs.add(o);
    }
    public void unregister(IObserver o){
    if(o !=null){
    Listobs.remove(o);

    }
    }

    public void notifier(){
        for(IObserver obs : this.getListobs())
        obs.update();

    }
    }

