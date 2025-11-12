//EXCEPTIONS
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

class MidException extends BaseException {
    public MidException(String message) {
        super(message);
    }
}

class TopException extends MidException {
    public TopException(String message) {
        super(message);
    }
}


//CLASSES
class A {
    void show() throws BaseException {
        throw new BaseException("Exception from Class A");
    }
}

class B extends A {
    void show() throws MidException {
        throw new MidException("Exception from Class B");
    }
}

class C extends B {
    void show() throws TopException {
        throw new TopException("Exception from Class C");
    }
}

//DRIVER
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {

        A ob1 = new A();
        A ob2 = new B();
        A ob3 = new C();

        try {
            ob2.show();
        }
        catch (TopException e) {
            System.out.println("Caught TopException: " + e.getMessage());
        }
        catch (MidException e) {
            System.out.println("Caught MidException: " + e.getMessage());
        }
        catch (BaseException e) {
            System.out.println("Caught BaseException: " + e.getMessage());
        }
        finally {
            System.out.println("Program execution completed.\nPulkit Kush, 24csu166");
        }
    }
}
