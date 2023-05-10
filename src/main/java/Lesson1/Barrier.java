package Lesson1;

public abstract class Barrier {
    public abstract void doIt(Competitor competitor);
}

class Wall extends Barrier {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Pool extends Barrier {
    int length;

    public Pool(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }

    private double length;

    public Pool(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomePool(CanSwim swimmer) {
        return swimmer.swim(this);
    }
}

class Cross extends Barrier {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}

class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Cat("Кузя"), new Turtle("Гриша"), new Wolf("Рекс")};
        Barrier[] barriers = {new Cross(80), new Wall(5), new Water(3)};

        for (Competitor c : competitors) {
            for (Barrier b : barriers) {
                b.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}