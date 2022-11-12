public class Main {
    public static void main(String[] args) {

        Site rs = new ResidentialSite(12, 10);
        System.out.println("Bill Amount for Residental Site: " + rs.getBillableAmount());

        Site ls = new LifelineSite(12, 10);
        System.out.println("Bill Amount for Lifeline Site: " + ls.getBillableAmount());
    }
}