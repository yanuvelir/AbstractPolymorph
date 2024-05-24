public class GroupOfAuto {

    private Auto[] group;
    public GroupOfAuto(int amount){
        group = new Auto[amount];
    }

    public void Add(Auto automobile){

        for(int i=0; i<group.length; i++){
            if(group[i] == null){
                group[i] = automobile;
                System.out.println("Auto " +automobile.getClass().getName()+ "" + automobile.getName()
                        + " has added to the group. The order number is: " + (i+1));
                break;
            }
        }
    }
}
