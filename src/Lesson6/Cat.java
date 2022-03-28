package Lesson6;

public class Cat extends Animal {
    private final int run_lenght = 200;
    private final double jump_height = 2;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= run_lenght)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jump_height)) System.out.println("jump: true");
        else System.out.println("jump: fase");
    }
}
