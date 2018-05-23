public class Main {
    private static void usage() {
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        String arg = args[0];
        if (arg.equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (arg.equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println("created file: " + result);
        } else {
            usage();
            System.exit(0);
        }
    }
}
