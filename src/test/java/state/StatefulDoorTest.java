package state;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StatefulDoorTest {

    @Test
    public void theDoorShouldBeClosedWhenItIsCreated()
    {
        StatefulDoor door = new StatefulDoor();
        assertTrue(door.isClosed());
    }

    @Test
    public void theDoorCanBeOpened()
    {
        StatefulDoor door = new StatefulDoor();
        door.open();
        assertTrue(door.isOpen());
    }

    @Test
    public void theDoorCanBeClosed()
    {
        StatefulDoor door = new StatefulDoor();
        door.open();
        door.close();

        assertTrue(door.isClosed());
    }

}
