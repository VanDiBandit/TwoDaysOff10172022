package UseCase;

public class InterfaceSegregationPrinciple {

    public class InterfaceSegregationPrinciple {

        public static void main(String[] args) {

        }
    }

    interface Worker {
        void work();
    }

    interface Sleeping {
        void sleep();
    }

    class Human implements Worker, Sleeping {

        @Override
        public void work() {}

        @Override
        public void sleep() {}
    }

    class Robot implements Worker {

        @Override
        public void work() {}
    }