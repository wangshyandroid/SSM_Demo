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
    private List<String> albums;
    private String album;
    private List<StepsBeana> steps;


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

    public List<String> getAlbums() {
        return albums;
    }

    public void setAlbums(List<String> albums) {
        this.albums = albums;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public List<StepsBeana> getSteps() {
        return steps;
    }

    public void setSteps(List<StepsBeana> steps) {
        this.steps = steps;
    }

}
