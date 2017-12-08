package Entity;

/**
 * Created by wangshy on 17/12/1.
 */
public class StepsBean {
    private int id;
    private String img;
    private String step;

    private int menu_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    @Override
    public String toString() {
        return "StepsBean{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", step='" + step + '\'' +
                '}';
    }
}
