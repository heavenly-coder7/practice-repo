package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevator extends SubsystemBase {

    //right elevator motor

    CANSparkMax r_lift = new CANSparkMax(0, MotorType.kBrushless);

    //left eleator motor 

    CANSparkMax l_lift = new CANSparkMax(0, MotorType.kBrushless);

    public elevator(){
    }
    

    public void setforward(){
        r_lift.set(.75); 
    }

}
