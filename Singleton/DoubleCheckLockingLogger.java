class DoubleCheckLockingLogger {
    public static volatile DoubleCheckLockingLogger logger;

    private DoubleCheckLockingLogger() {
        System.out.println("DoubleCheckLockingLogger constructor called");
    }

    public static DoubleCheckLockingLogger getInstance() {
        if (logger == null) {
            synchronized (DoubleCheckLockingLogger.class) {
                if(logger == null) {
                    logger = new DoubleCheckLockingLogger();
                }
            }
        }
        return logger;
    }

    public static void log(String s) {
        System.out.println(s);
    }
}