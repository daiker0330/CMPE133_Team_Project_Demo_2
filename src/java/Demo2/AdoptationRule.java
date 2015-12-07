/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo2;

import java.util.ArrayList;

/**
 *
 * @author yunfan
 */
public class AdoptationRule extends AnyRule{
    private static int maxCourse = 4;
    
    public boolean check(ArrayList<Object> arr){
        if(arr.size()>=AdoptationRule.maxCourse){
            return false;
        }
        else{
            return true;
        }
    }
}
