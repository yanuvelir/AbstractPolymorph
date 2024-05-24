public class GroupOfAuto {

    private Auto[] group;

    public GroupOfAuto(int amount) {
        group = new Auto[amount];
    }

    public void add(Auto automobile) {
        // Check if the group is already full
        boolean groupFull = true;
        for (Auto auto : group) {
            if (auto == null) {
                groupFull = false;
                break;
            }
        }

        if (groupFull) {
            System.out.println("Exceeded amount of group");
            return;
        }

        // Add the automobile to the group
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = automobile;
                System.out.println("Auto " + automobile.getClass().getName() + " " + automobile.getName() +
                        " has been added to the group. The order number is: " + (i + 1));
                break;
            }
        }
    }
}

