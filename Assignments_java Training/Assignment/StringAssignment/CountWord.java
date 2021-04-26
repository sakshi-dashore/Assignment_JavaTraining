package Day9;

public class CountWord {
	static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string1 ="You are best thankyou so much";  
		 String string2 ="Hello";  
		 String string3 ="India Is My Country";  
		 String string4 ="Everyone is doing good here";  
		 String string5 ="Good Morning Everyone";  
         System.out.println(wordcount(string1) + " words");  
         System.out.println(wordcount(string2) + " words");  
         System.out.println(wordcount(string3) + " words");  
         System.out.println(wordcount(string4) + " words");  
         System.out.println(wordcount(string5) + " words");  
	}

}
