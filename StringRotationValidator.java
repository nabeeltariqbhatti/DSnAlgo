public class StringRotationValidator {
     	public static boolean isSubString(String s1,String s2){
	      StringBuilder sb = new StringBuilder(s1);
	      for(int i=1;i<s1.length();i++){
          sb.append(s1.substring(i-1,i));
          sb.delete(0,1);
          if(sb.toString().equalsIgnoreCase(s2)){
             return true;
          }
      }
         return false;
	}
     public static boolean isRotation(String s1,String s2){
		if(s1==null||s2==null||s1.length()!=s2.length())
			return false;
		if(s1.equals("")&&s2.equals(""))
			return true;
		return isSubString(s1,s2);
	}

   public static void main(String[] args) {
  
      String s1= "thankyou";
      String s2 = "ankyouth";
     System.out.println(isRotation(s1,s2));
    
      
   }
}
