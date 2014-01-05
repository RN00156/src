package tn.rndev.rxo;

import 	tn.rndev.rxo.core.TestClass;
import 	tn.rndev.rxo.test.CreateObjectDemo;

public class Main {
	public static void main(String[] args) {
		//entry point

		System.out.println("Здравствуй, мир!");

		TestClass myTestClass = new TestClass();

		System.out.println(myTestClass.getTestVar() + "\n~~~~~~~~~~~~~");


		CreateObjectDemo myNewObjectDemo = new CreateObjectDemo();

		myNewObjectDemo.runDemo();

		System.out.println("~~~~~~~~~~~~~\n");
		System.out.println("~~~~~~~~~~~~~\n");

		Integer myInt = 3;
	}
}