import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }

  public void sellItem(int index){
    if(index < itemList.size() && index >= 0)
    {
      Item sold = itemList.get(index);
      earnings += sold.getCost();
      System.out.printf("Sold %s for %.2f.%n", sold.getName(), sold.getCost());
    } 
    else 
    {
      System.out.println("Invalid. There is/are only " + itemList.size() + " item/items in the store.");
    }
  }
  
  public void sellItem(String name){
    boolean found = false;
      for(Item item : itemList)
      {
        if(item.getName().equals(name))
        {
          earnings += item.getCost();
          System.out.printf("Sold %s for %.2f.%n", item.getName(), item.getCost());
          found = true;
          break;
        }
      }
      if(!found)
      {
        System.out.println("The store does not sell " + name + ".");
      }
  }

  public void sellItem(Item i){
    if(itemList.contains(i))
    {
      earnings += i.getCost();
      System.out.printf("Sold %s for %.2f.%n", i.getName(), i.getCost());
    } 
    else 
    {
      System.out.println("The store does not sell this item.");
    }
  }

  public void addItem(Item i){
    itemList.add(i);
  }

  public void filterType(String type){
    for(Item i : itemList)
    {
      if(i.getType().equals(type))
      {
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
    }
  }

  public void filterCheap(double maxCost){
    for(Item i : itemList)
    {
      if(i.getCost() <= maxCost)
      {
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
    }
  }

  public void filterExpensive(double minCost){
    for(Item i : itemList)
    {
      if(i.getCost() >= minCost)
      {
        System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
  }
  }

  public static void printStats(){
    for(Store s : storeList)
    {
      System.out.printf("Store Name: %s%nEarnings: %.2f%n", s.getName(), s.getEarnings());
    }
  }
}
