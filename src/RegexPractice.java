public class RegexPractice {
    public static void main(String[] args) {
        //Word letters - latin, numbers, _
        System.out.println("1at".matches("\\wat")); //to use a backslash in strings - you have to backslash it aswell
        System.out.println("xYz".matches("\\w\\w\\w")); //any 3-letter word
        //Digits - only numbers
        System.out.println("1ab".matches("\\dab")); // \d - decimal
        System.out.println("321-333-7652".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        //Quantifier - to quantify how many times we want a character to match
        System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));
        System.out.println("321.333.7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}")); // \s -> space
        System.out.println("321 333 7652".matches("\\d{3}\\s\\d{3}\\s\\d{4}"));
        System.out.println("321  333   7652".matches("\\d{3}\\s+\\d{3}\\s+\\d{4}")); //one or more
        System.out.println("3213337652".matches("\\d{3}\\s*\\d{3}\\s*\\d{4}")); //zero or more
        System.out.println("321 3337652".matches("\\d{3}\\s?\\d{3}\\s?\\d{4}")); //zero or one

        System.out.println("777 052 643".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}")); //3 to 4 digits
        System.out.println("777 052 643".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,}")); //atleast 3 digits
        //Grouping patterns
        System.out.println("321-333-7652".matches("(\\d{3}[-,.\\s]?){2}\\d{4}")); //quantifying grouped patterns
        System.out.println("333 7652".matches("(\\d{3}[-,.\\s]?){1,2}\\d{4}"));

        System.out.println("1.232.333.2365".matches("\\d[-.,\\s]?(\\d{3}[-.,\\s]?){2}\\d{3,4}"));
        System.out.println("232.333.2365".matches("(\\d[-.,\\s]?)?(\\d{3}[-.,\\s]?){2}\\d{3,4}"));
        System.out.println("1.232.333.2365".matches("(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){2}\\d{3,4}"));
    }
}
