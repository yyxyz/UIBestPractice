package com.example.uibestpractice;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: com.example.uibestpractice.Message.java
 * @author: yyxyz
 * @date: 2016-04-14 15:12
 */
public class Message {
    private static final String TAG = "Message";
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;

    private String content;
    private int type;

    public Message(String content, int type)
    {
        this.content = content;
        this.type = type;
    }

    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }
}
