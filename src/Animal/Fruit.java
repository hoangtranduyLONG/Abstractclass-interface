package Animal;
    public abstract class Fruit implements Edible{
        @Override
        public String howToEat() {
            return "can't eat";
        }
}
