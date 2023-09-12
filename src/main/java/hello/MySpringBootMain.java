package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootApplication;

@MySpringBootApplication
public class MySpringBootMain {

    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        // MySpringBootMain.class 기능을 쓰겠다. 현재는 Component scan 기능을 사용함
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
