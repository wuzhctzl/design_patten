package com.wuzh.adapter;

import java.util.ArrayList;
import java.util.List;

public class MouKuMediaPlayer implements MediaPlayer,VideoPlayer {
    private List<String> playlist = new ArrayList<>();
    public MouKuMediaPlayer() {
        playlist.add("天龙八部");
        playlist.add("边水往事");
        playlist.add("三国演义");
    }
    @Override
    public void play(String videoName) {
        if(findVideo(videoName)){
            System.out.println("使用某酷视频播放器播放" + videoName );
        }else{
            System.out.println("没有找到" + videoName + "的播放列表");
        }
    }

    @Override
    public boolean findVideo(String videoName) {
        return playlist.contains(videoName);
    }
}
