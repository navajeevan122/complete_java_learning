public class StringMethods {

    public static void main(String[] args) {
        String s1="Hello World";
        String s2="hello world";
        System.out.println("Length of the String: "+s1.length());

        System.out.println("Specific character: "+s1.charAt(6));

        System.out.println("Sub-String: "+s1.substring(6));

        System.out.println("Sub-String from specific range: "+s1.substring(6,11));

        System.out.println("concat String: "+s1.concat(s2));

        System.out.println("Index of String: "+s1.indexOf("World"));

        System.out.println("last index of the String:"+s1.lastIndexOf("l"));

        System.out.println("String are equal or not: "+s1.equals("Hello World"));

        System.out.println("Ignoring the case and checking strings are equal or not: "+s1.equalsIgnoreCase(s2));

        System.out.println("Compare the strings: "+s1.compareTo(s2));

        System.out.println("Compare Strings Ignoring the case: "+s1.compareToIgnoreCase(s2));

        System.out.println("To lower Case: "+s1.toLowerCase());

        System.out.println("To upper case: "+s2.toUpperCase());

        String t="  hello   world   ";

        System.out.println("Remove unwanted spaces: "+t.trim());

        System.out.println("replace method: "+s1.replace("World","Java"));

        System.out.println("String Contains another string: "+s1.contains("World"));

        char[] ch=s1.toCharArray();
        System.out.print("string to char array: ");

        for(char c:ch)
        {
            System.out.print(c+" ");
        }
        System.out.println();


    }
    
}
