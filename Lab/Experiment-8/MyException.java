class MyException extends Exception {
    String msg;
    MyException(String s) {
        msg = s;
    }

    void printMessage() {
        System.out.println("Custom Exception Message: " + msg);
    }
}
