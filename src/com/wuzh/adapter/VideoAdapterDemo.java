package com.wuzh.adapter;

import java.sql.DriverManager;

public class VideoAdapterDemo {

    public static void main(String[] args) {
        // 原有的某酷播放器接口
        MediaPlayer mediaPlayer = new MouKuMediaPlayer();
        mediaPlayer.play("边水往事");
        mediaPlayer.play("唐朝诡事录之西行");
        System.out.println("****************************************************************");
        // 使用适配器模式
        MediaPlayer mediaPlayer2 = new MyMediaPlayerAdapter();
        mediaPlayer2.play("天龙八部");
        mediaPlayer2.play("唐朝诡事录之西行");
        mediaPlayer2.play("边水往事");
        mediaPlayer2.play("警察故事");
    }

}
