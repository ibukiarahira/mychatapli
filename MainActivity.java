package com.example.mychatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends Activity {

    //これがないと表示されない
    //springのset的なもの
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap icon1 = BitmapFactory.decodeResource(getResources(), jp.bassaer.chatmessageview.R.drawable.face_1);

        Message message1 = new Message();
        message1.setUserIcon(icon1);
        message1.setUserName(name);
        message1.setMessageText(text1);
        message1.setRightMessage(true);

        //宣言
        ArrayList<Message> messages = new ArrayList<>();

        messages.add(message1);

        MessageView messageView  = (MessageView) findViewById(R.id.message_view);

        messageView.init(messages);
    }
}
