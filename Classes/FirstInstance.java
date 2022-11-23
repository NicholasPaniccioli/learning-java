class FirstInstance {
    public static void main (String[] args){
        System.out.println("Paint is " + Car.color);
        System.out.println("Style is " + Car.bodyType);
        System.out.println(Car.accelerate());

        Car Porsche = new Car();
        System.out.println("Porsche paint is " + Porsche.color);
        System.out.println("Porsche style is " + Porsche.bodyType);
        System.out.println(Porsche.accelerate());
    }
}
