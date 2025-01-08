package work;
// 定义抽象类Animal
abstract class Animal {
    // 抽象方法eat
    abstract void eat();

    // 非抽象方法sleep
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// 定义接口Swim
interface Swim {
    // 抽象方法swim
    void swim();
}

// 定义Animal的子类Tiger实现Swim接口
class Tiger extends Animal implements Swim {
    // 实现Animal的抽象方法eat
    @Override
    void eat() {
        System.out.println("Tiger is eating.");
    }

    // 实现Swim接口的抽象方法swim
    @Override
    public void swim() {
        System.out.println("Tiger is swimming.");
    }
}

