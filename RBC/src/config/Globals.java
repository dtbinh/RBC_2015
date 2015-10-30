package config;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;

public class Globals{
	
	public static final boolean debug = true;	
	
	//Strings
	public static final String introMsg = "Robot ready.";
	public static final String pressButton = "Press any button to start!";
	
	//Mechanics
	public static final float wheelDiameter = 3.0f;
	public static final float trackWidth = 18.5f;
	public static final int scoopRotationAngle = 180;
	
	//Sensor Ports
	public static final SensorPort touchPort =  SensorPort.S1;
	public static final SensorPort irPort =  SensorPort.S2;
	public static final SensorPort compassPort =  SensorPort.S3;
	public static final SensorPort usR = SensorPort.S2;
	public static final SensorPort usL = SensorPort.S3;
	
	//Motor Ports
	public static final NXTRegulatedMotor leftMotor =  Motor.A;
	public static final NXTRegulatedMotor rightMotor =  Motor.B;
	public static final NXTRegulatedMotor scoopMotor = Motor.C;
	
	//Speeds
	public static final int travelSpeed = 25;
	public static final int rotateSpeed = 30;
	public static final int liftScoopSpeed = 2000;
	public static final int dropScoopSpeed = 200;
	
	//Navigation
	public static final int distanceTolerance = 25; //mm
	public static final int wallDistance = 100; //mm
	
	public static final int turnAngle = 15;
	public static final int angleToleranceCorrect = 2;
	public static final int turnRadiusCorrect = 6;
	public static final int angleToleranceIncorrect = 6;
	public static final int turnRadiusIncorrect = 16;
	
	public static final int backwardsDistance = 15;
	
	//Flocking
	public static final int minObjectDistance = 22; //cm
	public static final int maxObjectDistance = 150; //cm
	
	//Delays
	public static final int isMovingDelay = 100;
	public static final int backDelay = 500;
}