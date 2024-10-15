package com.wuzh.adapter;

import java.util.ArrayList;
import java.util.List;

public class MouXunMediaPlayer implements MediaPlayer,VideoPlayer {
    private List<String> playlist = new ArrayList<>();

    public MouXunMediaPlayer() {
        playlist.add("射雕英雄传");
        playlist.add("倚天屠龙记");
    }
    @Override
    public void play(String videoName) {
        if(findVideo(videoName)){
            System.out.println("使用某讯视频播放器播放" + videoName );
        }else{
            System.out.println("没有找到" + videoName + "的播放列表");
        }
    }

    @Override
    public boolean findVideo(String videoName) {
        return playlist.contains(videoName);
    }
}
