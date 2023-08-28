import java.util.TreeMap;
public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        TreeMap<Hero, Flower> heroFlowerMap = new TreeMap<>();
        heroFlowerMap.put(hulk, rose);
        heroFlowerMap.put(thor, rose);
        heroFlowerMap.put(scarletWitch, rose);
        heroFlowerMap.put(vision, tulip);
        heroFlowerMap.put(captainAmerica, lily);
        heroFlowerMap.put(doctorStrange, violet);
        heroFlowerMap.put(blackWidow, violet);


        System.out.println("Is begonia in the TreeMap? " + heroFlowerMap.containsValue(begonia));

        for (Hero hero : heroFlowerMap.keySet()) {
            System.out.println(hero.getName() + " has a " + heroFlowerMap.get(hero).getName());
        }

    }
}