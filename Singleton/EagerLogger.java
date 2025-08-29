class EagerLogger{

    public static final EagerLogger logger = new EagerLogger();

    private EagerLogger() {
        System.out.println("EagerLogger constructor called");
    }
    
    public static EagerLogger getInstance() {
        return logger;
    }

    public static void log(String s) {
        System.out.println(s);
    }
}