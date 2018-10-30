package frc.team852.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team852.RobotMap;
import frc.team852.commands.DriveTank;

public class TankDrive extends Subsystem {

    DifferentialDrive robotDrive = RobotMap.robotDrive;

    SpeedControllerGroup leftDriveMotors = RobotMap.leftDrive;
    SpeedControllerGroup rightDriveMotors = RobotMap.rightDrive;

    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new DriveTank());

    }

    public void stop(){
        robotDrive.stopMotors();
    }

}
