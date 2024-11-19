package moonRoverProject;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {
    private AtRest atRest;
    private MoveForward moveForward;
    private MoveBackward moveBackward;
    private Rover rover;

    @Before
    public void setUp() {
        atRest = new AtRest();
        moveForward = new MoveForward();
        moveBackward = new MoveBackward();
        rover = new Rover();
    }

    // AtRest State Tests
    @Test
    public void testAtRestInitialState() {
        assertEquals("At Rest", atRest.name);
        assertEquals("None", atRest.subState);
    }

    @Test
    public void testAtRestRightPedal() {
        // Valid case - press once
        assertTrue(atRest.pressRightPedal(1));
        
        // Invalid cases
        assertFalse(atRest.pressRightPedal(2));
        assertFalse(atRest.pressRightPedal(3));
    }

    @Test
    public void testAtRestLeftPedalForTime() {
        // Valid case - press for 5 seconds
        assertTrue(atRest.pressLeftPedalForTime(5));
        
        // Invalid cases
        assertFalse(atRest.pressLeftPedalForTime(3));
        assertFalse(atRest.pressLeftPedalForTime(2));
    }

    // MoveForward State Tests
    @Test
    public void testMoveForwardInitialState() {
        assertEquals("Move Forward", moveForward.name);
        assertEquals("Accelerate", moveForward.subState);
    }

    @Test
    public void testMoveForwardRightPedal() {
        // Test transitions with 2 presses
        moveForward.pressRightPedal(2);
        assertEquals("Decelerate", moveForward.subState);
        
        moveForward.pressRightPedal(2);
        assertEquals("Accelerate", moveForward.subState);
        
        // Test return to AtRest with 3 presses
        moveForward.subState = "Decelerate";
        assertTrue(moveForward.pressRightPedal(3));
    }

    @Test
    public void testMoveForwardRightPedalForTime() {
        // Test Accelerate to Constant Speed
        moveForward.pressRightPedalForTime(5);
        assertEquals("Constant Speed", moveForward.subState);
        
        // Test Constant Speed to Decelerate
        moveForward.pressRightPedalForTime(3);
        assertEquals("Decelerate", moveForward.subState);
    }

    // MoveBackward State Tests
    @Test
    public void testMoveBackwardInitialState() {
        assertEquals("Move Backward", moveBackward.name);
        assertEquals("Accelerate", moveBackward.subState);
    }

    @Test
    public void testMoveBackwardLeftPedal() {
        // Test state transitions
        moveBackward.subState = "Constant Speed";
        moveBackward.pressLeftPedal(1);
        assertEquals("Decelerate", moveBackward.subState);
        
        moveBackward.pressLeftPedal(2);
        assertEquals("Accelerate", moveBackward.subState);
        
        // Test return to AtRest
        moveBackward.subState = "Decelerate";
        assertTrue(moveBackward.pressLeftPedal(3));
    }

    @Test
    public void testMoveBackwardLeftPedalForTime() {
        // Test Accelerate to Constant Speed
        moveBackward.voidPressLeftPedalForTime(3);
        assertEquals("Constant Speed", moveBackward.subState);
        
        // Test invalid time
        moveBackward.voidPressLeftPedalForTime(5);
        assertEquals("Constant Speed", moveBackward.subState);
    }

    // Rover Integration Tests
    @Test
    public void testRoverStateTransitions() {
        // Test initial state
        assertEquals("At Rest", rover.currentState.name);
        
        // Test transition to Move Forward
        rover.pressRightPedal(1);
        assertEquals("Move Forward", rover.currentState.name);
        assertEquals("Accelerate", rover.currentState.subState);
        
        // Test transition back to At Rest
        rover.pressRightPedal(2); // To Decelerate
        rover.pressRightPedal(3); // To At Rest
        assertEquals("At Rest", rover.currentState.name);
        
        // Test transition to Move Backward
        rover.pressLeftPedalForTime(5);
        assertEquals("Move Backward", rover.currentState.name);
        assertEquals("Accelerate", rover.currentState.subState);
    }

    @Test
    public void testInvalidTransitions() {
        // Try invalid transition from At Rest
        rover.pressLeftPedal(1);
        assertEquals("At Rest", rover.currentState.name);
        
        // Move to Forward and try invalid transition
        rover.pressRightPedal(1);
        rover.pressLeftPedalForTime(5);
        assertEquals("Move Forward", rover.currentState.name);
        
        // Return to Rest
        rover.pressRightPedal(2); // To Decelerate
        rover.pressRightPedal(3); // To At Rest
        
        // Move to Backward and try invalid transition
        rover.pressLeftPedalForTime(5);
        rover.pressRightPedal(1);
        assertEquals("Move Backward", rover.currentState.name);
    }
}