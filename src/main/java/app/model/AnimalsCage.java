package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.*;

@Component
public class AnimalsCage {
    @Autowired
    private Timer bean;
    @Autowired
    private Animal animal;


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(bean.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return bean;
    }
}
