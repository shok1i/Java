package Work_22;

// Интерфейс стула
interface chair {
    void sit();
}

// Реализация Викторианского стула
class Victorianchair implements chair {
    @Override
    public void sit() {
        System.out.println("Сел на Викторианский стул.");
    }
}

// Реализация Многофункционального стула
class Funcionalchair implements chair {
    @Override
    public void sit() {
        System.out.println("Сел на Многофункциональный стул.");
    }
}

// Реализация Магического стула
class Magicchair implements chair {
    @Override
    public void sit() {
        System.out.println("Сел на Магический стул.");
    }
}

// Абстрактная фабрика для создания стульев
abstract class ChairsFabric {
    public abstract chair createChair();
}

// Конкретная фабрика для Викторианских стульев
class VectorialChairsFabric extends ChairsFabric {
    @Override
    public chair createChair() {
        return new Victorianchair();
    }
}

// Конкретная фабрика для Многофункциональных стульев
class FunctionalChairsFabric extends ChairsFabric {
    @Override
    public chair createChair() {
        return new Funcionalchair();
    }
}

// Конкретная фабрика для Магических стульев
class MagicChairsFabric extends ChairsFabric {
    @Override
    public chair createChair() {
        return new Magicchair();
    }
}

// Клиент, который использует chair в методе Sit
class Client {
    public static void Sit(chair ch) {
        System.out.println("Клиент сел на стул.");
        ch.sit();
    }
}

public class Main {
    public static void main(String[] args) {
        ChairsFabric VectorialChairsFabric = new VectorialChairsFabric();
        chair vc = VectorialChairsFabric.createChair();

        ChairsFabric FunctionalChairsFabric = new FunctionalChairsFabric();
        chair mc = FunctionalChairsFabric.createChair();

        ChairsFabric MagicChairsFabric = new MagicChairsFabric();
        chair magc = MagicChairsFabric.createChair();

        Client cl = new Client();
        Client.Sit(vc);
        Client.Sit(mc);
        Client.Sit(magc);
    }
}