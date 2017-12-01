package Entity;

/**
 * Created by wangshy on 17/11/29.
 */
public class JavaSpring {
    private String java_Id;
    private String java_Name;
    private String java_Url;
    private String java_Title;
    private String java_Summary;

    public String getJava_Id() {
        return java_Id;
    }

    public void setJava_Id(String java_Id) {
        this.java_Id = java_Id;
    }

    public String getJava_Name() {
        return java_Name;
    }

    public void setJava_Name(String java_Name) {
        this.java_Name = java_Name;
    }

    public String getJava_Url() {
        return java_Url;
    }

    public void setJava_Url(String java_Url) {
        this.java_Url = java_Url;
    }

    public String getJava_Title() {
        return java_Title;
    }

    public void setJava_Title(String java_Title) {
        this.java_Title = java_Title;
    }

    public String getJava_Summary() {
        return java_Summary;
    }

    public void setJava_Summary(String java_Summary) {
        this.java_Summary = java_Summary;
    }

    @Override
    public String toString() {
        return "JavaSpring{" +
                "java_Id='" + java_Id + '\'' +
                ", java_Name='" + java_Name + '\'' +
                ", java_Url='" + java_Url + '\'' +
                ", java_Title='" + java_Title + '\'' +
                ", java_Summary='" + java_Summary + '\'' +
                '}';
    }
}
