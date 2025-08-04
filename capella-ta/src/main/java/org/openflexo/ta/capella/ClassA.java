package org.openflexo.ta.capella;

public class ClassA {
	public static class SuperClass{
		
	}
	
	public static class SubClass extends SuperClass{
		
	}
	
	public Class<? extends SuperClass> getClassSuperClass(){
		return SuperClass.class;	
	}
	
	public static class ClassB extends ClassA{
		@Override
		public Class<? extends SubClass> getClassSuperClass(){
			return SubClass.class;
		}
	}
}
