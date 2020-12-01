package ru.example.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music beanTest =  context.getBean("musicBean", RockMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(beanTest);
//        musicPlayer.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("Player name " + musicPlayer.getName());
        System.out.println("Volume " + musicPlayer.getVolume());

        context.close();

    }
}
