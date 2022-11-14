public class Main {

    public static void main(String[] args) {
        
        // ---------------------------
        // Add members to the family
        // ---------------------------
        Family family = new Family();

        // Add Niece to the family
        family.addNiece("Madya", 11, 5);
        family.addNiece("Ridwan",26, 6);
        family.addNiece("Ilyawan", 9, 3);
        
        // Add Uncle to the family
        family.addUncle("Alucard");
        family.addUncle("Gussion");
        
        // Present : Gussion
        family.findUncle("Gussion").addPresent(family.findNiece("Madya"),"Dagger");

        // Present : Alucard
        family.findUncle("Alucard").addPresent(family.findNiece("Madya"), "Sword");
        family.findUncle("Alucard").addPresent(family.findNiece("Ilyawan"), "Jacket");
        family.findUncle("Alucard").addPresent(family.findNiece("Ridwan"), "Buff");
       
        // List Nieces & Uncle
        family.listNieces();
        family.listUncles();

        // Uncle Presents
        family.findUncle("Gussion").listPresents();
        family.findUncle("Alucard").listPresents();

        // Niece Presented
        family.findNiece("Madya").listPresents();
        family.findNiece("Ilyawan").listPresents();
        
        // clear Presents : Madya
        System.out.println("Clear Presents Madya");
        family.findNiece("Madya").clearPresents();
        family.findNiece("Madya").listPresents();
    }
    
}
