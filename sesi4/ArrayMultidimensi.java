package sesi4;

public class ArrayMultidimensi {
    public static void main(String[] args) {
        String[][] framework = {
            {"Java", "Kotlin"},
            {"React", "Reactjs"},
            {"PHP", "Laravel"},
        };
        for (int i = 0; i < framework.length; i++) {
            System.out.println("Bahasa: " + framework[i][0]);
            System.out.println("Framework: " + framework[i][1]);
            System.out.println("-----------------------------------");
        }
    }
}
