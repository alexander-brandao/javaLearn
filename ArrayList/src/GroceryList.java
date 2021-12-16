import java.util.ArrayList;

public class GroceryList {

    // array object
    private ArrayList<String> groceryList = new ArrayList<String>();

    //method that add items to the Grocery List
    public void addGroceryList(String item){
            groceryList.add(item);
    }

    //method that print the grocery list
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //method that modify grocery items
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item" + (position+1) + " has been modified");
    }

    //method that remove grocery item
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //method that find item
    public String findItem(String searchItem) {
    //        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

}
