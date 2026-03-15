package week5.no5;

class Bound<T extends A> {

    private T objRef;

    public Bound(T obj) {
        this.objRef = obj;
    }

    public void doRunTest() {
        this.objRef.displayClass();
    }
}

class A {

    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {

    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {

    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}



