package com.facade;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
// 外观类
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstanc();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready() {
        this.popcorn.on();
        this.popcorn.pop();
        this.dvdPlayer.on();
        this.projector.on();
        this.projector.focus();
    }

    public void play() {
        this.dvdPlayer.play();
    }

    public void pause() {
        this.dvdPlayer.pause();
    }

    public void end() {
        this.popcorn.off();
        this.dvdPlayer.off();
        this.projector.off();
    }

}
