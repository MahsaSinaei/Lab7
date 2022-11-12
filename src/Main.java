public class Main {
    public static void main(String[] args) {
        Site s = new Site(10);
        ResidentialSite rs = new ResidentialSite(s, 12, 10);
        System.out.println("Bill Amount for Residental Site: " + rs.getBillableAmount());

        LifelineSite ls = new LifelineSite(s, 12, 10);
        System.out.println("Bill Amount for Lifeline Site: " + ls.getBillableAmount());
    }
}