package Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/22
 */
public class AppMenuBean implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;
    private int id;
    private String title;
    private List<LabellingBean> tags;
    private String imtro;
    private String ingredients;
    private String burden;
    private String album;

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

    public List<LabellingBean> getTags() {
        return tags;
    }

    public void setTags(List<LabellingBean> tags) {
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

}
