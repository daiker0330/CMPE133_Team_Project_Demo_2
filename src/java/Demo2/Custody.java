/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo2;

/**
 *
 * @author yunfan
 */
public class Custody extends AnyForm{
    public void addCourse(Child c){
        this.getArr().add(c);
    }
    
    public String print(){
        String msg = new String();
        for(int i=0;i<this.getArr().size();i++){
            Child c = (Child)this.getArr().get(i);
            msg+=c.getId()+"-"+c.getName()+"<br>";
        }
        return msg;
    }
}
