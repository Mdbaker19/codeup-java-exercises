package groceries;

public class Grocery {

    private String itemName;
    private String category;
    private Integer count;

    public Grocery(String item, String category, Integer count){
        this.itemName = item;
        this.category = category;
        this.count = count;
    }

    public void setItemName(String name){
        this.itemName = name;
    }
    public String getItemName(){
        return this.itemName;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCount(Integer count){
        this.count = count;
    }
    public Integer getCount(){
        return this.count;
    }


}
