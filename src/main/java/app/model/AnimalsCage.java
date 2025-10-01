package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.*;

@Component
public class AnimalsCage {
    private Timer timer;
    @Autowired
    @Qualifier("dogbean")
    private Animal animal;

    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }
    public Timer getTimer() {
        return timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }


}
