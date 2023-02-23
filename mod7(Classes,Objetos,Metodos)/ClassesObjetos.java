/**
 * Criado por Artem em 22/02/2023
 */

package br.com.artem;

public class ClassesObjetos {

public static void main(String[] args) {
	 Person person1 = new Person();
	   person1.name = "Tiago";
		 person1.age = 35;
		   person1.speak();
	          person1.sayHello();
	 Person person2 = new Person();
	   person2.name = "Eduardo";
		 person2.age = 22;
		   person2.speak();
		      person2.sayHello();
	}

}
class Person{
	String name;
	int age;
	
	/**
	 * criei o metodo "void"
	 */
	
	void speak() {
		System.out.println("Meu nome é "+ name+","+ "tenho "+age+" anos");
	}
	void sayHello() {
		System.out.println("Hello");
	}
}