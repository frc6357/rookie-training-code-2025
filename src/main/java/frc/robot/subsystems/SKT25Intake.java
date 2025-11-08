package frc.robot.subsystems;
import static edu.wpi.first.units.Units.Degrees;
import static edu.wpi.first.units.Units.Radians;
import static edu.wpi.first.units.Units.Rotations;
import static frc.robot.Ports.intakePorts.kArmMotor;
import static frc.robot.Ports.intakePorts.kIntakeMotor;
import static frc.robot.Konstants.IntakeConstants.*;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import edu.wpi.first.math.controller.ArmFeedforward;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Konstants.IntakeConstants.ArmPosition;

@SuppressWarnings("unused")
public class SKT25Intake extends SubsystemBase
{
    // All memory objects needed for the intake subsystem.
    int gear1Rotation = 1;
    int gear2Rotation = 1;
    int degrees = 360;
    SparkMax intakeMotor;
    SparkMax armMotor;
    SparkMaxConfig armConfig;
    SparkClosedLoopController mPID;
    double mTargetAngle;
    double mCurrentAngle;
    double motorRatio = 12.5;
    RelativeEncoder mEncoder;
    ArmFeedforward armFeedforward;
    boolean isRunning;

    /*
     * Intake constructor (used to initialize our motor object).
     */
    public SKT25Intake()
    {
        // Initialize our motor object.
        
        

        // Initialize arm motor config object.
        

        // Apply arm motor configurations.
        
            
            
            
            
            
            
            
        
            
            
            
        
            
            
        
        // Set mPID and mEncoder objects to get their controller and encoder respectively.
        
        

        // Set the target and current angles to 0.0.
        
        
        
        // Set the encoder position to 0.
        
    }

    /*
     *  ARM (Not intaking related)
     */

    /*
     * Method to reset the encoder's value.
     */
    public void resetEncoder()
    {
        // Set the position of the encoder to 0.
        
    }

    /*
     * Method to set the target angle of the arm based on enum position.
     */
    public void setTargetAngle(ArmPosition position)
    {
        // Set the target angle based on the enum position passed in.
        
    }

    /*
     * Method to get the current position of the arm in degrees.
     */
    public double getArmPosition()
    {
        // Set conversion factor, do the math for your angle, then return the value of angle.
        // Delete placeholder to instead return angle.
        double placeholder = 0.0;
        return placeholder;
    }

    /*
     * Method to set the target angle of the arm in degrees.
     */
    private void setTargetAngle(double angleDegrees)
    {
        // Set your target angle to the passed in angle.
        

        // Display target and current angles on SmartDashboard for tuning purposes.
        

        // Convert angle in degrees to motor rotations, then set the reference for the PID controller.
        
        
        
        
        
        
    }

    /*
     * Method to get the target angle of the arm in degrees.
     */
    public double getTargetArmPosition()
    {
        // Return your target angle.
        // Delete placeholder to instead return angle.
        double placeholder = 0.0;
        return placeholder;
    }

    /*
     * Method to check if the arm is at the target position, during auto and teleop.
     */
    public boolean isArmAtTargetPosition()
    {
        // if the DriverStation is in teleop, use kArmTolerance, else use 0.1 rotations for autonomous.
        
        
        
        
         
        
        // Delete "true" and return whether the arm is at the target position, once the method is complete.
        return true;
    }

    /*
     * Method to hold the arm at its current position.
     */
    public void hold()
    { 
        // If the arm was being run, set the target angle to the arm's current position.
        
        
        
        
        
        
    }

    /*
     * Method to run the arm at a given speed, with gravity compensation.
     */
    public void runArm(double armspeed)
    {
        // Set angleDegrees to the current arm position.
        
        // Calculate the target angle in radians for the cosine function.
        
        
        
        
        // Calculate offset for gravity compensation and set the arm motor speed.
        
        
    }

    /*
     * Method to move the arm to the "intake" position at the start of a match.
     */
    public void leave() 
    {
        // Set the target angle to the zero position angle.
        
    }

    /*
     *  INTAKING (Not arm related)
     */

    /*
     * Method that sets the intake speed to rollerSpeed (speed value).
     */
    public void setIntakeSpeed(double rollerSpeed)
    {
        // Set the roller speed to the passed in roller speed.
        
    }

    /*
     * Method to return motor speed, if requested.
     */
    public double getMotorSpeed ()
    {
        // Return the intake motor speed.
        // Delete placeholder and replace with motor speed, once complete.
        double placeholder = 0.0;
        return placeholder;
    }
    
    /*
     * Method to stop the intake motor.
     */
    public void stopIntake()
    {
        // Call the stopMotor method on intakeMotor.
        
    }

    public void periodic()
    {
    }

    public void testInit()
    {
    }
    
    public void testPeriodic()
    {
    }
}
