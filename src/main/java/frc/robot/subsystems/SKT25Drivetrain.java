package frc.robot.subsystems;
import static frc.robot.Ports.drivePorts.kLeftFollower;
import static frc.robot.Ports.drivePorts.kLeftLeader;
import static frc.robot.Ports.drivePorts.kRightFollower;
import static frc.robot.Ports.drivePorts.kRightLeader;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

@SuppressWarnings("unused")
public class SKT25Drivetrain extends SubsystemBase 
{
    SparkMax leftLeader;
    SparkMax leftFollower;
    SparkMax rightLeader;
    SparkMax rightFollower;
    DifferentialDrive diffDrive;

    /*
     * Drivetrain constructor (used to initialize motor objects).
     */
    public SKT25Drivetrain() 
    {
        // Initialize the four motor objects.
        
        
        
        

        // Initialize the differential drive object.
        

        // Set CAN timeouts to 250ms to reduce log spam during CAN bus issues.
        
        
        
        

        // Build a base config we can clone into each motor config.
        
        
        
        
        
        // Set configuration to follow leader and then apply it to corresponding
        // follower. Resetting in case a new controller is swapped
        // in and persisting in case of a controller reset due to breaker trip
        
        
        
        

        // Remove following, then apply config to right leader
        
        
        // Set conifg to inverted and then apply to left leader. Set Left side inverted
        // so that postive values drive both sides forward
        
        
    }

    /*
     * Method to drive the robot using arcade controls.
     */
    public void driveArcade(double xSpeed, double zRotation) 
    {
        // Apply arcadeDrive to the diffDrive object.
        
    }
}
