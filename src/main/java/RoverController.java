public class RoverController {
    private Rover rover;

    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String execute(String mission) throws Exception {
        String[] info = mission.split(",");
        if (info.length <= 4) {
            return "";
        }
        Area area = new Area(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
        Rover rover = new Rover();
        rover.land(area, Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4]);

        for (int i = 4; i < info.length; i++) {
            executeOneCommend(info, rover, i);
        }
        return rover.getPosition();
    }

    private void executeOneCommend(String[] info, Rover rover, int i) throws Exception {
        if ("M".equals(info[i])) {
            rover.move();
        } else if ("L".equals(info[i])) {
            rover.turnLeft();
        } else if ("R".equals(info[i])) {
            rover.turnRight();
        }
    }
}