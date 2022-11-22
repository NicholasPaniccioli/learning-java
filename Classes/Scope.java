class Scope {
    public static void main (String[] args){

        String txt = "This is a local variable in the main method";
        System.out.println(txt);
        sub();
    }    

    public static void sub(){
        String txt = "This is a local variable in the sub method";
        System.out.println(txt);
    }
}
