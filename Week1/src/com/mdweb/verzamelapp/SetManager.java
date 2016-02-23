/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdweb.verzamelapp;

import java.util.ArrayList;


/**
 *
 * @author Dennis
 */
public class SetManager {
   private static SetManager singletonObject;
   public ArrayList<Set> setList;
   
   private SetManager() {
       setList = new ArrayList<Set>();
   }
   
   public static SetManager getSingletonObject() {
       if (singletonObject == null) {
       singletonObject = new SetManager();
       }
       return singletonObject;
   }
   
   public void addSet(Set set){
      setList.add(set);
   }
}
