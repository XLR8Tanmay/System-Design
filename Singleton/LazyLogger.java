class LazyLogger{
    public static LazyLogger logger;
    private LazyLogger() {
        System.out.println("LazyLogger constructor called");
    }

    public static LazyLogger getInstance() {
        if(logger == null) {
            logger = new LazyLogger();
        }
        return logger;
    }

    public static void log(String s) {
        System.out.println(s);
    }
}