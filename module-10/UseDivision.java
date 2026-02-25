public class UseDivision {
    public static void main(String[] args) {

        // Two InternationalDivision objects
        InternationalDivision intDiv1 =
                new InternationalDivision("Global Tech", 1001, "Germany", "German");

        InternationalDivision intDiv2 =
                new InternationalDivision("Asia-Pacific Sales", 1002, "Japan", "Japanese");

        // Two DomesticDivision objects
        DomesticDivision domDiv1 =
                new DomesticDivision("East Coast Operations", 2001, "New York");

        DomesticDivision domDiv2 =
                new DomesticDivision("West Coast Operations", 2002, "California");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}