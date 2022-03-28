package Lesson6;

public class Dog extends Animal{

    private final int run_lenght = 500;
    private final int swim_lenght = 10;
    private final double jump_height = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= run_lenght)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= swim_lenght)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jump_height)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }

}
