package frc.robot;
import static edu.wpi.first.wpilibj.XboxController.Axis.kLeftTrigger;
import static edu.wpi.first.wpilibj.XboxController.Axis.kLeftX;
import static edu.wpi.first.wpilibj.XboxController.Axis.kLeftY;
import static edu.wpi.first.wpilibj.XboxController.Axis.kRightTrigger;
import static edu.wpi.first.wpilibj.XboxController.Axis.kRightX;
import static edu.wpi.first.wpilibj.XboxController.Axis.kRightY;
import static edu.wpi.first.wpilibj.XboxController.Button.kA;
import static edu.wpi.first.wpilibj.XboxController.Button.kLeftBumper;
import static edu.wpi.first.wpilibj.XboxController.Button.kLeftStick;
import static edu.wpi.first.wpilibj.XboxController.Button.kRightBumper;
import static edu.wpi.first.wpilibj.XboxController.Button.kX;
import static edu.wpi.first.wpilibj.XboxController.Button.kY;
import static frc.robot.Konstants.IntakeConstants.kJoystickDeadband;
import static frc.robot.utils.SKTrigger.INPUT_TYPE.AXIS;
import static frc.robot.utils.SKTrigger.INPUT_TYPE.BUTTON;
import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.utils.CANPort;
import frc.robot.utils.SKTrigger;
import frc.robot.utils.filters.DeadbandFilter;
import frc.robot.utils.filters.FilteredAxis;
import frc.robot.utils.filters.FilteredXboxController;

public class Ports
{
    /*
     * Ports associated with the driver controller.
     */
    public static class DriverPorts
    {
        // Driver Controller set to Xbox Controller. The driver has the ability to translate and rotate
        // the robot, and is additionally able to intake gamepieces.
        public static final GenericHID kDriver = new FilteredXboxController(0).getHID();
        
        // Button ports related to robot movement.
        public static final FilteredAxis kTranslationXPort = new FilteredAxis(() -> kDriver.getRawAxis(kLeftY.value));
        public static final FilteredAxis kTranslationYPort = new FilteredAxis(() -> kDriver.getRawAxis(kLeftX.value));
        public static final FilteredAxis kRotationPort = new FilteredAxis(() -> kDriver.getRawAxis(kRightX.value));
        public static final SKTrigger kResetGyroPos = new SKTrigger(kDriver, kLeftStick.value, BUTTON);
        public static final SKTrigger kRobotCentricMode = new SKTrigger(kDriver, kRightBumper.value, BUTTON);
        public static final SKTrigger kSlowMode = new SKTrigger(kDriver, kLeftBumper.value, BUTTON);
        
        // Button ports related to intake control, such as intaking and ejecting.
        public static final SKTrigger kIntake = new SKTrigger(kDriver, kRightTrigger.value, AXIS);
        public static final SKTrigger kEject = new SKTrigger(kDriver, kLeftTrigger.value, AXIS);
    }

    /*
     *  Ports associated with the operator controller.
     */
    public static class OperatorPorts
    {
        // Operator Controller set to Xbox Controller. The operator has the ability to control the intake position,
        // intake rollers, and the launcher.
        public static final GenericHID kOperator = new FilteredXboxController(1).getHID();

        // Button ports related to intake control, such as intaking and ejecting.
        public static final SKTrigger kIntake = new SKTrigger(kOperator, kRightTrigger.value, AXIS);
        public static final SKTrigger kEject = new SKTrigger(kOperator, kLeftTrigger.value, AXIS);

        // Button ports related to intake movement, such as moving up or down.
        public static final FilteredAxis kIntakeAxis = new FilteredAxis(() -> kOperator.getRawAxis(kRightY.value), new DeadbandFilter(kJoystickDeadband));
        public static final SKTrigger kFloorAngle = new SKTrigger(kOperator, kA.value, BUTTON);
        public static final SKTrigger kZeroAngle = new SKTrigger(kOperator, kY.value, BUTTON);
        public static final SKTrigger kFreightAngle = new SKTrigger(kOperator, kX.value, BUTTON);

        // Button ports related to launcher control, such as moving up or down.
        public static final SKTrigger kLaunchScrap = new SKTrigger(kOperator, kRightBumper.value, BUTTON);
    }

    /*
     *  Ports for the SKT25Drivetrain subsystem.
     */
    public static class drivePorts
    {
        private static final String busName = "";

        // CAN IDs for the four motors associated with our tank drive, matching the IDs set in
        // REV Hardware Client.
        public static final CANPort kLeftLeader = new CANPort(10, busName);
        public static final CANPort kLeftFollower = new CANPort(11, busName);
        public static final CANPort kRightLeader = new CANPort(12, busName);
        public static final CANPort kRightFollower = new CANPort(13, busName);
    }

    /*
     *  Ports for the SKT25Intake subsystem.
     */
    public static class intakePorts 
    {
        // Tells which CAN bus to use; empty string means default bus.
        private static final String busName = "";

        // CAN IDs for the intake motors, matching the IDs set in REV Hardware Client.
        public static final CANPort kIntakeMotor = new CANPort(40, busName);
        public static final CANPort kArmMotor = new CANPort(41, busName);
    }
    
    /*
     *  Ports for the SKT25Launcher subsystem.
     */
    public static class launcherPorts
    {
        // Tells which CAN bus to use; empty string means default bus.
        private static final String busName = "";

        // CAN ID for the launcher motor, matching the ID set in REV Hardware Client.
        public static final CANPort kLauncherMotor = new CANPort(50, busName);
    }
}