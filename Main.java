
public class Main {
    public static void main(String[] args) {
        Tree myFavOAKTree =new Tree(120, 20, TreeType.OAK);
        Tree myFavMapleTree =new Tree(110, 20, TreeType.MAPLE);

        Employee employer1 = new Employee("Saman", "Colombo", 10, 10000);

        Employee employer2 = new Employee("Nimal","Kandy",40,80000);

        employer2.raise();

        System.out.println(employer1.salary);
        System.out.println(employer2.salary);




        System.err.println(myFavOAKTree.treeType);

        myFavOAKTree.announceTallTree();
         //reusability

        System.out.println("static instance"+Tree.Trunk_color);

        if (myFavOAKTree.heightFt>100) {
            System.out.println("That's a tall "+myFavOAKTree.treeType+" tree!!");
            
        }

        if (myFavMapleTree.heightFt>100) {
            System.err.println("That's a tall "+myFavMapleTree.treeType+" tree!!");
            
        }
    }
}
