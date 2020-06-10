package object_Oriented_Programming_Concept_1;

public class R4_MethodOverLoading {

	public static void main(String[] args) {
		
		R4_MethodOverLoading obj = new R4_MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);

	}
	
	public void sum() {
		System.out.println("Zero input method");
	}
	
	public void sum(int i) {
		System.out.println("input method only i");// this is called method over loading
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		System.out.println("input method i and j");// this is called method over loading
		System.out.println(i + j);
	}

}
