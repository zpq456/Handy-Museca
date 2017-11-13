package kr.ac.zipokun.handymuseca.DataBase;

/**
 * Created by Owner on 2017-10-06.
 * 모델
 * 데이터 베이스에 저장하고 사용자 인터페이스에 표시할 데이터를 포함
 */

public class Comment {
    private  long id;
    private String comment;

    @Override
    public String toString(){
        return comment;
    }

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}
}
