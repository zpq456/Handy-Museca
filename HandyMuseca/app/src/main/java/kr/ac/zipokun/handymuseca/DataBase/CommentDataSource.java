package kr.ac.zipokun.handymuseca.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Owner on 2017-10-06.
 * DAO
 * 데이터베이스 연결을 유지 관리, 새 주석 추가 및 모든 주석 가져오기
 */

public class CommentDataSource {
    //database fields
    private SQLiteDatabase database;
    private DBHelper dbHelper;
    private String[] allColumns = { DBHelper.COLUMN_ID,
                    DBHelper.COLUMN_COMMENT };

    public CommentDataSource(Context context){
        dbHelper = new DBHelper(context);
    }

    public void open() throws SQLException{
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    public Comment createComment(String comment){
        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_COMMENT, comment);
        long insertId = database.insert(DBHelper.TABLE_COMMENTS, null, values);
        Cursor cursor = database.query(DBHelper.TABLE_COMMENTS,
                allColumns, DBHelper.COLUMN_ID + " = " + insertId, null,
                null, null, null);
        cursor.moveToFirst();
        Comment newComment = cursorToComment(cursor);
        cursor.close();
        return newComment;
    }
    public void deleteComment(Comment comment){
        long id = comment.getId();
        System.out.println("Comment deleted with id: " + id);
        database.delete(DBHelper.TABLE_COMMENTS, DBHelper.COLUMN_ID + " = " + id, null);
    }

    public List<Comment> getAllComments(){
        List<Comment> comments = new ArrayList<Comment>();

        Cursor cursor = database.query(DBHelper.TABLE_COMMENTS,
                allColumns, null, null, null, null, null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            Comment comment = cursorToComment(cursor);
            comments.add(comment);
            cursor.moveToFirst();
        }
        cursor.close();
        return comments;
    }

    private Comment cursorToComment(Cursor cursor){
        Comment comment = new Comment();
        comment.setId(cursor.getLong(0));
        comment.setComment(cursor.getString(1));
        return comment;
    }
}

