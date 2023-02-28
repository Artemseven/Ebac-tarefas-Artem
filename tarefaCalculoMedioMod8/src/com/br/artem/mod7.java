package com.br.artem;

public class mod7{

	public static void main(String[] args) {
   
		                     // projeto1 
  byte name = 5;
  short name_1 = 32500;
  int name_2 = 231231123;
  long name_3 = 1527893457;
  
  float name_4 = 32.14f;
  double name_5 = 33.1515d;
  
  System.out.println(name);
  System.out.println(name_1);
  System.out.println(name_2);
  System.out.println(name_3);
  System.out.println(name_4);
  System.out.println(name_5);
  
  {                // projeto2 
               int myInt = 5;
                 if(myInt<10) {
	               System.out.println("certo");
               } else if(myInt<20){
	               System.out.println("nao certo");
               }
	        }
  {
                        // projeto3
    boolean isGoodWeather = true;
    boolean isNight = false;
    if (isNight) {
    	System.out.println("Sleep");
    }
    if (!isNight && isGoodWeather) {
    	System.out.println("Walk");
    }
    if (!isNight && !isGoodWeather) {
    	System.out.println("Read a book");
    }
    }
	}
}
    