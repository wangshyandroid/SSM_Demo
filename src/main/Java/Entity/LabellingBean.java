package Entity;

import java.io.Serializable;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/20
 */
public class LabellingBean implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;
    private int id;
    private String name;
    private int cId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }
}
