package frc.robot.subsystems;
import static frc.robot.Konstants.LauncherConstants.kSpeedTolerance;
import static frc.robot.Ports.launcherPorts.kLauncherMotor;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkBase.ResetMode;

@SuppressWarnings("unused")
public class SKT25Launcher extends SubsystemBase
{
    // Create memory objects for public use.
    SparkMax launcherMotor;
    RelativeEncoder motorEncoder;
    double targetSpeed;

    // Constructor for launcher subsystem.
    public SKT25Launcher()
    {
        
    }

    public void setLauncherSpeed(double launcherSpeed)
    {
        
    }

    // Method to return motor speed, if requested.
    public double getMotorSpeed ()
    {
        // Delete the placeholder and replace it with your code.
        double placeholder = 0.0;
        return placeholder;
    }
    
    // Stop the launcher motor.
    public void stopLauncher()
    {
        
    }

    public void periodic()
    {
    }
    
    public void testPeriodic()
    {
    }
    
    public void testInit()
    {
    }
}

