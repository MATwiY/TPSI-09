package wizut.tpsi.lab9;

import org.springframework.stereotype.Service;

public class BlogPost {

    public Long id;
    public String title;
    public String content;

    BlogPost(){

    }

    BlogPost(Long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
}
