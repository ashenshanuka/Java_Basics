public class Main {
    public static void main(String[] args) {
        Tree myFavOAKTree =new Tree(120, 20, TreeType.OAK);
        Tree myFavMapleTree =new Tree(110, 20, TreeType.MAPLE);

        System.err.println(myFavOAKTree.treeType);

        myFavOAKTree.announceTallTree();
         //reusability

        if (myFavOAKTree.heightFt>100) {
            System.out.println("That's a tall "+myFavOAKTree.treeType+" tree!!");
            
        }

        if (myFavMapleTree.heightFt>100) {
            System.err.println("That's a tall "+myFavMapleTree.treeType+" tree!!");
            
        }
    }
}
