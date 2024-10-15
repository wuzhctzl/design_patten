package com.wuzh.adapter;

public class MyMediaPlayerAdapter implements MediaPlayer{
    // 持有需要适配的播放器实例
    private MouKuMediaPlayer mouKuMediaPlayer;
    private MouXunMediaPlayer mouXunMediaPlayer;
    private MouYiMediaPlayer mouYiMediaPlayer;
    public MyMediaPlayerAdapter(){
        mouKuMediaPlayer = new MouKuMediaPlayer();
        mouXunMediaPlayer = new MouXunMediaPlayer();
        mouYiMediaPlayer = new MouYiMediaPlayer();
    }
    @Override
    public void play(String videoName) {
        if(mouKuMediaPlayer.findVideo(videoName)){
            mouKuMediaPlayer.play(videoName);
        } else if (mouXunMediaPlayer.findVideo(videoName)) {
            mouXunMediaPlayer.play(videoName);
        }else if (mouYiMediaPlayer.findVideo(videoName)) {
            mouYiMediaPlayer.play(videoName);
        }else{
            System.out.println("没有找到可以播放 "+videoName+" 所对应的播放器");
        }
    }
}
