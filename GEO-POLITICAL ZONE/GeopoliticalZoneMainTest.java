import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class GeopoliticalZoneMainTest {

    @Test
    public void testStateInputNotNumbers() {
        try {
            String state = "1234";
        } catch (IllegalArgumentException e) {
            GeopoliticalZoneMain geo = new GeopoliticalZoneMain();
            String state = "1234";
            geo.validateInput(state);
            throw new IllegalArgumentException("Invalid state");
        }
    }

    @Test
    public void testStateInputNotNullOrEmpty() {
        try {
            String state = null;
        } catch (IllegalArgumentException e) {
            GeopoliticalZoneMain geo = new GeopoliticalZoneMain();
            String state = null;
            geo.validateInput(state);
            throw new IllegalArgumentException("Invalid state: State is null or empty");
        }
    }

    @Test
    public void testFindZone() {
        assertEquals(GeoPoliticalZone.SOUTH_WEST, GeopoliticalZoneMain.findZone("Lagos"));
        assertEquals(GeoPoliticalZone.NORTH_EAST, GeopoliticalZoneMain.findZone("Borno"));
        assertEquals(GeoPoliticalZone.SOUTH_SOUTH, GeopoliticalZoneMain.findZone("Rivers"));
        assertNull(GeopoliticalZoneMain.findZone("California"));
    }

}