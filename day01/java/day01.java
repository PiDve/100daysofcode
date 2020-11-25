import java.io.IOException;

class day01 {

    public static int calcYear(int year){
        return year*365;
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Qual o ano? ");  
        int year = System.in.read();

        System.out.printf("Ano: %d Dias: %d \n",year, calcYear(year));
    }  
}  

// C:\ProgramData\Oracle\Java\javapath
// C:\Program Files (x86)\Common Files\Oracle\Java\javapath
// javac day01.java
// java day01