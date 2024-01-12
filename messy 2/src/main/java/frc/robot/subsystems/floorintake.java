package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxAlternateEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class floorintake extends SubsystemBase {

    CANSparkMax motor = new CANSparkMax(0, MotorType .kBrushless);

    //line breaksensor
    private AnalogInput beam;

    
    public floorintake(){

    }
    
}
