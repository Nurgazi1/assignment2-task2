void main() {
    Car car = new Car("Samsara", 2010, 25000, true, 4);
    Bus bus = new Bus("MAN", 2000, 50000, 30, false);
    Servicable s = new Car("Samsara", 2010, 25000, true, 4);
    Servicable s1 = new Bus("MAN", 2000, 50000, 30, false);


    System.out.println(car);
    System.out.println(bus);

    s.performService();
    s1.performService();

}
