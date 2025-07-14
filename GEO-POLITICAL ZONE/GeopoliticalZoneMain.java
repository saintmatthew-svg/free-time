import java.util.Scanner;
public class GeopoliticalZoneMain {

    public static String validateInput(String state) {
        if (state.matches("\\d+")) throw new IllegalArgumentException("Invalid state");
        if(state == null || state.trim().isEmpty()) throw new IllegalArgumentException("Invalid state: State is null or empty");
        return "Invalid state";
    }

    public static GeoPoliticalZone findZone(String state) {
        validateInput(state);
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            for (String zoneState : zone.getStates()) {
                if (zoneState.equalsIgnoreCase(state.trim())) {
                    return zone;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Nigerian state: ");
        String inputState = scanner.nextLine();
        validateInput(inputState);
        System.out.println("This is your Geo-Political zone in Nigeria: " + findZone(inputState));
    }
}
