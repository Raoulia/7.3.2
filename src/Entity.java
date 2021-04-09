abstract public class Entity {

    //поля супер-супер класса
    protected String name; //у всех объектов есть имя
    protected boolean destroyed = false; //разрушиться (умереть) может любой объект
    private int hp = 15; //здоровье

    //конструктор супер-супер класса
    public Entity(String name) {
        this.name = name;
        System.out.println("Object " + this.name + " was created");
    }

    //метод выводит true если объект мёртв или разрушен
    public boolean isDestroyed() {
        return destroyed;
    }

    //метод считает здоровье объекта
    protected boolean damage(int dhp) {
        hp -= dhp;
        if ((hp < 0) || (hp == 0)) {
            destroyed = true;
            System.out.println("Object " + this.name + " was destroyed");
            return true;
        } else {
            return false;
        }
    }

}
