package com.wuzh.adapter;

import java.util.ArrayList;
import java.util.List;

public class MouYiMediaPlayer implements MediaPlayer,VideoPlayer {
    private List<String> playlist = new ArrayList<>();

    public MouYiMediaPlayer() {
        playlist.add("笑傲江湖");
        playlist.add("唐朝诡事录之西行");
    }
    @Override
    public void play(String videoName) {
        if(findVideo(videoName)){
            System.out.println("使用某艺视频播放器播放" + videoName );
        }else{
            System.out.println("没有找到" + videoName + "的播放列表");
        }
    }

    @Override
    public boolean findVideo(String videoName) {
        return playlist.contains(videoName);
    }
}
