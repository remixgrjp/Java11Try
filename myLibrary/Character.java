/**
* javac AndroidStudioProjects\Java11Try\myLibrary\Character.java
*
* jar cfM AndroidStudioProjects\Java11Try\app\libs\MyLibrary20111008.jar -C AndroidStudioProjects\Java11Try myLibrary
*
* AndroidStudioProjects\Java11Try\app\build.gradle
* �`
* dependencies {
* �`
*     implementation files('libs/MyLibrary20111008.jar')
* �`
*/
package myLibrary;

import java.lang.IllegalArgumentException;

public class Character{
	/*
	* @see java.lang.Character.toString( int codePoint )
	*/
	public static String toString( int codePoint )throws IllegalArgumentException{
		return java.lang.Character.toString( codePoint );//Java11
	}
}