public abstract class Monster extends Entity implements Fighter {

    // поля суперкласса класса
    private int force; //сила повреждения

    // конструктор
    public Monster(String name, int force) {
        super(name);
        this.force = force;
    }

    //метод возвращает силу повреждения
    protected int getForce(){
        return force;
    }

}
