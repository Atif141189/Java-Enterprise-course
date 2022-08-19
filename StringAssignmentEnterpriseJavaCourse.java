package in.ineuron.main;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;

public class StringAssignmentEnterpriseJavaCourse {

	public static void main(String[] args) {
		
		
		
//		1. WAP to reverse a String.
//		Input: “iNeuron”
//		Output: “norueNi”
		
		//Approach 1: Immutable String
		
		//Scanner obj=new Scanner(System.in);
		
		//String strInput=obj.nextLine();
		
		System.out.println("1. Program to reverse a String-(2 Approaches followed):");
		
		System.out.println("-----");
		
		String input1="iNeuron";
		
		String reverseString1="";
		
		for(int i=input1.length()-1;i>=0;i--)
		{
			reverseString1=reverseString1+input1.charAt(i);
		}
		
		System.out.println(reverseString1);
		
		//obj.close();
		
		System.out.println("-----");
		
		//Approach 2:Mutable String--->By using StringBuilder class
		
		StringBuilder sb=new StringBuilder("iNeuron");
		
		StringBuilder rvrString=sb.reverse();
		
		System.out.println(rvrString);
		
		System.out.println("****************************************************");
		
		
		//2. WAP to reverse a sentence while preserving the position.
		
		System.out.println("2. Program to reverse a sentence while preserving the position:");
		
		System.out.println("-----");
		
		String strInput2="Think Twice";
		
		String strArr[]=strInput2.split(" ");
		
		
		
        //String reverseString2="";
//		
//		for(int i=strArr.length-1;i>=0;i--)
//		{
//			reverseString2=strArr[i]+" "+reverseString2;
//		}
//		
//		System.out.println(reverseString2);
		
		
		//System.out.println(strArr.length-1);
		
		StringBuilder sb2=new StringBuilder();
		
		for(int i=strArr.length-1;i>=0;i--)
		{
			
			sb2.append(" "+strArr[i]);
			
			
		}
		
		System.out.println(sb2.reverse());
		
		System.out.println("****************************************************");
		
		//7.Program to count the number of Vowels and Consonants of a String value.
		
		/*
		 * 
		 * Program is improved by removing the duplicates in the input String
		 * 
		 */
		
		System.out.println("7. Program to to count the number of Vowels and Consonants of a String value");
		
		System.out.println("-----");
		
		String strInputtt="Hossain".toLowerCase();
		
		int vowelCount=0;
		
		int consCount=0;
		
		
		
		String resStrInputtt="";
		
		for(int i=0;i<strInputtt.toLowerCase().length();i++)
		{
			char ch=strInputtt.charAt(i);
			
			if(resStrInputtt.indexOf(ch)<0)
			{
				resStrInputtt=resStrInputtt+ch;
			}
		}
		
		System.out.println(resStrInputtt);
		
		for(int i=0;i<resStrInputtt.length();i++)
		{
			if(resStrInputtt.charAt(i)=='a'||resStrInputtt.charAt(i)=='e'||resStrInputtt.charAt(i)=='i'||resStrInputtt.charAt(i)=='o'||resStrInputtt.charAt(i)=='u')
			{
				vowelCount++;
			}
			else
			{
				consCount++;
			}
		}
		
		System.out.println("Vowels :"+" "+vowelCount+" "+"and"+" "+"Consonant :"+" "+consCount);
		
		System.out.println("****************************************************");
		
		//Program to count number of special characters.
		
		System.out.println("8. Program to count number of special characters");
		
		System.out.println("-----");
		
		String strinputttt="abc$******123*";
		
		int spclCharacterCount=0;
		
		for(int i=0;i<strinputttt.length();i++)
		{
			
			if(strinputttt.toLowerCase().charAt(i)>='a' && strinputttt.toLowerCase().charAt(i)<='z'||strinputttt.toLowerCase().charAt(i)>='0' && strinputttt.toLowerCase().charAt(i)<='9')
			{
				continue;
			}
			else
			{
				spclCharacterCount++;
				
			}
			
		}
		
		System.out.println("Count ofspecialcharacters :"+" "+spclCharacterCount);
		
		System.out.println("****************************************************");
		
		//6. WAP to sort a String Alphabetically.
		
		/*
		 * 
		 * Program is improved by removing the duplicates in the input String
		 * 
		 */
		
		System.out.println("6. Program to sort a String Alphabetically.");
		
		System.out.println("-----");
		
		int temp;
		
		//Scanner obj=new Scanner(System.in);
		
		//System.out.println("Enter the string to sort alphabaticaly :");
		
		//String str=obj.nextLine().toLowerCase();
		
		String str="zbceeeeefdddd".toLowerCase();
		
		String reString="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(reString.indexOf(ch)<0)
			{
				reString=reString+ch;
			}
			
			
		}
		
		char charArr[]=reString.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			for(int j=i+1;j<charArr.length;j++)
			{
				if(charArr[i]>charArr[j])
				{
					temp=charArr[i];
					
					charArr[i]=charArr[j];
					
					charArr[j]=(char)temp;
					
				}
			}
		}
		
		StringBuilder sbsrtStr=new StringBuilder();
		
		for(int i=0;i<charArr.length;i++)
		{
			sbsrtStr.append(charArr[i]);
		}
		
		System.err.println("Sorted string alphabaticaly :"+" "+sbsrtStr.toString());
		
		//obj.close();
		
		System.out.println("****************************************************");
		
		//5. WAP to print repeatedly occurring characters in the given String.
		
		System.out.println("5. Program to print repeatedly occurring characters in the given String");
		
		System.out.println("-----");
		
		//Input String
		
		String strInptttt="Aatif";
		
		//Converting to character array
		
		char []ch=strInptttt.toLowerCase().toCharArray();
		
		int count;
		
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					
					ch[j]='*';
				}
				
			}
			if(count>1 && ch[i]!='*')
			{
				System.out.println("Repeated character is string is :"+" "+ch[i]);
			}
		}
		
		System.out.println("****************************************************");
		
		System.out.println("4. Program to check if the String is a Pangram or not.");
		
		System.out.println("-----");
		
		/*
		 * 
		 * Program is improved by removing the duplicates in the input String
		 * 
		 */
		
		String strInpttttt="abcdefghijklmnopqrstuvwxyzz".toLowerCase();
		
		String resString="";
		
		for(int i=0;i<strInpttttt.length();i++)
		{
			char chr=strInpttttt.charAt(i);
			
			if(resString.indexOf(chr)<0)
			{
				resString=resString+chr;
			}
		}
		
		
		int counttttt=0;
		
		for(int i=0;i<resString.length();i++)
		{
			
			
			
			if(resString.charAt(i)>='a' && resString.charAt(i)<='z')
			{
				counttttt++;
			}
		}
		
		if(counttttt==26)
		{
			System.out.println("String is Pangram");
		}
		else
		{
			
			System.out.println("String is not Pangram");
			
		}
		
		System.out.println("****************************************************");
		
		System.out.println("3. Program to check if the String is Anagram or not.");
		
		System.out.println("-----");
		
		String strr11="mangoo";
		String strr22="ogmnao";
		
		char []chhArr1=strr11.toLowerCase().toCharArray();
		
		char []chhArr2=strr22.toLowerCase().toCharArray();
		
		Arrays.sort(chhArr1);
			
		Arrays.sort(chhArr2);
		
		if(String.valueOf(chhArr1).equals(String.valueOf(chhArr2)))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
		
		
		
		
		
	
	}

}


