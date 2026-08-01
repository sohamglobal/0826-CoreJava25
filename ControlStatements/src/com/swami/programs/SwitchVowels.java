package com.swami.programs;

public class SwitchVowels {

	public static void main(String[] args) {
		// equality
		char ch='a';
		switch(ch)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");
		}
	}

}
