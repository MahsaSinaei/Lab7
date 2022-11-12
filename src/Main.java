public class Main {
    public static void main(String[] args) {

        Site rs = new ResidentialSite(10, 10, 10);
        System.out.println("Bill Amount for Residential Site: " + rs.getBillableAmount());

        Site ls = new LifelineSite(10, 10, 10);
        System.out.println("Bill Amount for Lifeline Site: " + ls.getBillableAmount());
    }
}