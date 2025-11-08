package frc.robot;
import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.Degrees;
import static edu.wpi.first.units.Units.DegreesPerSecond;
import static edu.wpi.first.units.Units.Inches;
import static edu.wpi.first.units.Units.KilogramSquareMeters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.Radians;
import static edu.wpi.first.units.Units.RadiansPerSecond;
import static edu.wpi.first.units.Units.Rotations;
import static edu.wpi.first.units.Units.RotationsPerSecond;
import static edu.wpi.first.units.Units.Volts;
import java.util.HashMap;
import java.util.List;
import com.ctre.phoenix6.CANBus;    
import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.Pigeon2Configuration;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;
import com.pathplanner.lib.config.PIDConstants;
import com.pathplanner.lib.config.RobotConfig;
import com.pathplanner.lib.controllers.PPHolonomicDriveController;
import com.pathplanner.lib.controllers.PathFollowingController;
import com.pathplanner.lib.config.PIDConstants;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.LimitSwitchConfig.Type;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.measure.Angle;

@SuppressWarnings("unused")
public final class Konstants
{
    /*
     * Constants for the intake subsystem.
     */
    public static final class IntakeConstants
    {
      public static enum ArmPosition
      {
        // Enum positions for the intake's angle, inclusing a zero position,
        // freight position, and floor position.
        kZeroPositionAngle(0),
        kFreightAngle(0),
        kFloorAngle(0);
        
        // Angle associated with each position in degrees.
        public final double angle;
        ArmPosition(double angle)
        {
            this.angle = angle;
        }
      }

      // PID values for arm motion control.
      public static final double kArmP = 0.3;
      public static final double kArmI = 0.0;
      public static final double kArmD = 0.0;
      public static final double kArmV = 0.0;
      public static final double kArmFF = 0.0;

      // Maximum motion limits for motion control of the intake arm.
      public static final double kArmCruiseVel = .15;    // rot/sec
      public static final double kArmTargetAccel = .65; // rot/sec^2
      public static final double kArmTargetJerk = 4.5; // rot/sec^3
      public static final double kArmTolerance = 2.5; // degrees

      // Joystick control values for manual movement of the intake arm.
      public static final double kJoystickChange   = 0.05;    // Manual setpoint value for units from 0.0 - 1.0 moved per second
      public static final double kJoystickDeadband = 0.3;    // Manual arm movement axis deadband
      public static final boolean kJoystickReversed = true; // Whether joystick control is reversed or not.. usually true.

      // Speeds for intake rollers and arm movement.
      public static final double kArmSpeed = 0.3;
      public static final double kRollerSpeed = 0.7;
      public static final double kRollerSlowSpeed = 0.50;
      public static final double kRollerSuperSpeed = 0.8;
      public static final double kRollerStop = 0;

      // Current limits for the intake motors, unsuring they don't draw too
      // and cause batteries to brown out (limits in Amps; time in seconds).
      public static final CurrentLimitsConfigs kIntakeCurrentLimitsConfigs = 
        new CurrentLimitsConfigs()
          .withStatorCurrentLimitEnable(true)
          .withStatorCurrentLimit(50)
          .withSupplyCurrentLimitEnable(true)
          .withSupplyCurrentLimit(40)
          .withSupplyCurrentLowerLimit(20)
          .withSupplyCurrentLowerTime(0.3);
    }

    /*
     * Constants for the launcher subsystem.
     */
    public static final class LauncherConstants
    {
      // Speeds for the launcher motors.
      public static final double kLauncherSpeed = -0.7; 
      public static final double kStopSpeed = 0.0;
      public static final double kSpeedTolerance = 0.03;
    }

    /*
     * Constants for operator interface (OI) such as joysticks and controllers.
     */
    public static final class OIConstants
    {
        // Controller constraints.
        public static final double kDriveCoeff = 1;
        public static final double kRotationCoeff = 1;
        public static final double kJoystickDeadband = 0.15;
        public static final double kSlowModePercent = 0.6;
        public static final double kSlowModeRotationPercent = 0.5;
        public static final double kAccelLimit = 2;
    }   

    // The file that is used for system instantiation at runtime
    public static final String SUBSYSTEMFILE = "Subsystems.json";
}