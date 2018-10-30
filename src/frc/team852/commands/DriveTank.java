package frc.team852.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team852.OI;
import frc.team852.Robot;
import frc.team852.RobotMap;

public class DriveTank extends Command {

    public static DifferentialDrive robotDrive = RobotMap.robotDrive;

    public DriveTank() {

        // List out all the subsystems required for this command

        requires(Robot.tankDrive);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        this.robotDrive.tankDrive(OI.leftStick.getY(), OI.rightStick.getY(),true);
    }

    @Override
    protected boolean isFinished() {
        // Never stop the drivetrain
        return false;
    }

    @Override
    protected void end() {
        this.robotDrive.stop()
    }

    @Override
    protected void interrupted() {
        end();
    }

}
