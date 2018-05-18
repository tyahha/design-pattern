public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("create id card of " +  owner);
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("use " +  owner + "'s card");
    }
    public String getOwner() {
        return owner;
    }
}
