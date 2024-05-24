public class GroupOfSedans {

    private Sedan[] group;
    public GroupOfSedans(int amount){
        group = new Sedan[amount];
    }

    public void Add(Sedan sedan){

        for(int i=0; i<group.length; i++){
            if(group[i] == null){
                group[i] = sedan;
                System.out.println("Sedan " + sedan.getName()
                        + " has added to the group. His number is: " + (i+1));
            }
        }
    }
}
