/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clickable;

/**
 *
 * @author ASUS
 */
interface Clickable {
    void onClick();
}

public class Button {
    private Clickable action;
    
    void setClickAction(Clickable action){
        this.action = action;
    }
    
    void doClick(){
        action.onClick();
    }
}

