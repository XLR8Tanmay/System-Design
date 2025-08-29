class BillPughSingletonLogger {
    private BillPughSingletonLogger() {
        System.out.println("BillPughLogger constructor called");
    }
    
    class LogHolder {
        public static final BillPughSingletonLogger logger = new BillPughSingletonLogger();
    }

    public static BillPughSingletonLogger getInstance() {
        return LogHolder.logger;
    }

    public static void log(String s) {
        System.out.println(s);
    }
}