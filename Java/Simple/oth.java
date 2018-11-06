1. startsWith, foreach, toUpperCase

for (String pet: pets) {
            if (pet.startsWith("C")){
                System.out.println(pet.toUpperCase());
            }
        }

2. Проверка на то что первый символ заглавный
 public static boolean startsWithUpperCase(String value) {
        return !(value == null || value.isEmpty()) && Character.isUpperCase(value.charAt(0));
    }

3. Регистрация калбака с помощью интерфейса
(подробности http://developer.alexanderklimov.ru/android/java/interface.php)

public class SubClass {
    interface MyCallback{
        void callBackReturn();
    }

    MyCallback myCallback;

    void registerCallBack(MyCallback callback){
        this.myCallback = callback;
    }

    void doSomething(){
        // Здесь какой-то длительный код
        // Например, тянем кота за хвост

        // вызываем метод обратного вызова
        myCallback.callBackReturn();
    }
}

4. Проверка на то, что объект реализует интерфейса

(класс Pistolero наслодова от Enemy и реализует интерфейс Healable, однако объект pistolero приведен к классу предку Enemy)

Enemy pistolero = new Pistolero(100);
               
        if(pistolero instanceof Healable) {
              Healable healable = (Healable)pistolero;

        }

5. Работа с перечислениями
enum EnemyClassType {
        LIGHT("Лёгкий"),
        HEAVY("Тяжешй"),
        HEAVY2;

        private String description;

        EnemyClassType(String description) {
            this.description = description;
        }

        EnemyClassType() {
            this.description = "";
        }

        public String getDescription() {
            return description;
        }

        public boolean isLight() {
            return this == LIGHT;
        }

        public boolean isHeavy() {
            return this == HEAVY;
        }
    }

    public static void main(String[] args) {
        for (EnemyClassType t : EnemyClassType.values())
            System.out.println(t.ordinal() + ": " + t);

        EnemyClassType type = EnemyClassType.valueOf("HEAVY"); //получение элемента enum по его строковому представлению
        System.out.println(type.getDescription());

        switch (type) {
            case LIGHT:
            case HEAVY:
            case HEAVY2:
                System.out.println("HEAVY2 ...");
                break;
        }
    }
    