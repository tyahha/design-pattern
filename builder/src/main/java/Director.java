public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("morning and noon");
        builder.makeItems(new String[]{
                "Good morning",
                "Hello"
        });
        builder.makeString("evening");
        builder.makeItems(new String[]{
                "Good evening",
                "Good night",
                "Good bye"
        });
        builder.close();
    }
}
