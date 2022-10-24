package arrayexercise.arrayList;

public class Test {
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        groceryList.addGroceryItem("tomato");
        groceryList.addGroceryItem("milk");
        groceryList.printGroceryList();
        groceryList.modifyGroceryItem("tomato", "tomatoo");
        groceryList.printGroceryList();
    }
}
