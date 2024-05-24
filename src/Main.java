public class Main {
    public static void main(String[] args) {

        GroupOfAuto groupOfSedan = new GroupOfAuto(4);
        groupOfSedan.Add(new Sedan(" Volvo"));
        groupOfSedan.Add(new Sedan(" Porsche"));
        groupOfSedan.Add(new Sedan(" Opel"));
        groupOfSedan.Add(new Sedan(" Dodge"));

        GroupOfAuto groupOfRoadster = new GroupOfAuto(2);
        groupOfRoadster.Add(new Roadster(" Mazda"));
        groupOfRoadster.Add(new Roadster(" Honda"));
        groupOfRoadster.Add(new Roadster(" Renault"));
    }
}