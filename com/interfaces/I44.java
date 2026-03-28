package com.interfaces;
@FunctionalInterface
public interface I44 {
void m1();
default void m2()
{
	System.out.println("m2()-I4");
}
public static void m3()
{
	System.out.println("m3()-I4");
}
private static void m4()
{
	System.out.println("m4()-I4");
}
}
