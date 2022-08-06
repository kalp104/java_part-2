// id : 21CE084
// Name : kalp pandya
// Develop a Program that illustrate method overloading concept.
class method_overloading {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From method m1()");
    }

    protected void m2()
    {
        System.out.println("From method m2()");
    }
}

class Child extends method_overloading {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility

    public void m2()
    {
        System.out.println("From child m2()");
    }
}

// Driver class
class Main {
    public static void main(String[] args)
    {
        method_overloading obj1 = new method_overloading();
        obj1.m2();
        method_overloading obj2 = new Child();
        obj2.m2();
    }
}
