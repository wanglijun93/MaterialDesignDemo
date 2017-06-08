package wanglijun.vip.materialdesign;

/**
 * @author wlj
 * @date 2017/6/6
 * @email wanglijundev@gmail.com
 * @packagename wanglijun.vip.materialtest
 * @desc: 展示recyclerview的实体类
 */

public class Fruit {
    //水果名称
    private String name;
    //水果对应图片的ID
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
