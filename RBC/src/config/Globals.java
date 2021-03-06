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
	public static final float trackWidth = 18.0f;
	public static final int scoopRotationAngle = 180;
	
	//Sensor Ports
	public static final SensorPort usF =  SensorPort.S1;
	public static final SensorPort usR = SensorPort.S2;
	public static final SensorPort usL = SensorPort.S3;
	public static final SensorPort touchPort =  SensorPort.S4;
	
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
	public static final int friendlyRobotFootprint = 50; //cm
	public static final int minForwardDistance = 20; //cm
	public static final int maxForwardDistance = 200; //cm
	
	public static final int backwardsDistance = 15;
	public static final int varianceFactor = 2;
	
	//Flocking
	public static final int sideMinWallDistance = 25; //cm
	public static final int sideMinRobotDistance = 35; //cm
	public static final int sideMaxRobotDistance = 70; //cm
	public static final int dangerZone = 7; //cm
	
	public static final int robotCheckPeriod = 30;
	public static final int windowSize = 5;
	public static final int samplesForFilter = 30;
	
	public static final int forwardMinFlockingDistance = 45; //cm
	public static final int forwardMaxFlockingDistance = 50; //cm
	
	//Delays
	public static final int isMovingDelay = 100;
	public static final int backDelay = 500;
	public static final int msBetweenReadings = 100;
}