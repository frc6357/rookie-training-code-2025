
package frc.robot.bindings;

// import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Ports;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.SKT25Drivetrain;

import static frc.robot.Ports.DriverPorts.*;

import java.util.Optional;

import static frc.robot.Konstants.OIConstants.*;

public class SC25DrivetrainBinder implements CommandBinder{

    Optional<SKT25Drivetrain> driveSubsystem;

    Trigger slowMode;

    public SC25DrivetrainBinder(Optional<SKT25Drivetrain> driveSubsystem) 
    {
        this.driveSubsystem = driveSubsystem;
        this.slowMode = Ports.DriverPorts.kSlowMode.button;
    }

    @Override
    public void bindButtons() 
    {
        if (!driveSubsystem.isPresent())
        {
            return;
        }
        SKT25Drivetrain drive = driveSubsystem.get();

        drive.setDefaultCommand(new DriveCommand(drive, 
            () -> -kTranslationXPort.getFilteredAxis(),
            () -> -kRotationPort.getFilteredAxis()));

        slowMode.whileTrue(new DriveCommand(drive,
            () -> -kTranslationXPort.getFilteredAxis() * kSlowModePercent,
            () -> -kRotationPort.getFilteredAxis() * kSlowModePercent));
    }
}
