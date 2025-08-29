class Main {
    public static void main(String[] args) {
        EagerLogger eagerlogger = EagerLogger.getInstance();
        eagerlogger.log("Hello there, calling from eagerlogger");

        EagerLogger eagerlogger2 = EagerLogger.getInstance();
        eagerlogger2.log("Calling from eagerlogger2 instance");

        System.out.println("Checking if eagerlogger and eagerlogger2 belong to same instance: " + (eagerlogger == eagerlogger2));

        LazyLogger lazyLogger = LazyLogger.getInstance();
        lazyLogger.log("Calling from lazylogger instance");

        LazyLogger lazyLogger2 = LazyLogger.getInstance();
        lazyLogger2.log("Calling from lazylogger2 instance");

        System.out.println("Checking if lazyLogger and lazyLogger2 belong to same instance: " + (lazyLogger == lazyLogger2));

        DoubleCheckLockingLogger dclLogger = DoubleCheckLockingLogger.getInstance();
        dclLogger.log("Calling from DoubleCheckLockingLogger instance");

        BillPughSingletonLogger billPughLogger = BillPughSingletonLogger.getInstance();
        billPughLogger.log("Calling from BillPughSingletonLogger instance");
    }
}