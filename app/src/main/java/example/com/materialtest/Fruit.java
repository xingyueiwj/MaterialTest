package example.com.materialtest;

/**
 * Created by Administrator on 2018/2/10 0010.
 */
public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}