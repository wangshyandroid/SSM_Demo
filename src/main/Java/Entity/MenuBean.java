package Entity;

import java.util.List;

/**
 * Created by wangshy on 17/12/1.
 */
public class MenuBean {
    private int id;
    private String title;
    private String tags;
    private String imtro;
    private String ingredients;
    private String burden;
    private String albums;
    private List<StepsBean> stepsBeanList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImtro() {
        return imtro;
    }

    public void setImtro(String imtro) {
        this.imtro = imtro;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    public String getAlbums() {
        return albums;
    }

    public void setAlbums(String albums) {
        this.albums = albums;
    }

    public List<StepsBean> getStepsBeanList() {
        return stepsBeanList;
    }

    public void setStepsBeanList(List<StepsBean> stepsBeanList) {
        this.stepsBeanList = stepsBeanList;
    }

    @Override
    public String toString() {

        return "MenuBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tags='" + tags + '\'' +
                ", imtro='" + imtro + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", burden='" + burden + '\'' +
                ", albums='" + albums + '\'' +
                ", stepsBeanList=" + stepsBeanList +
                '}';
    }
}
