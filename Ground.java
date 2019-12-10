package laba12;

import java.util.Scanner;

public abstract class Ground extends Car {
	private double power;
	private double run;
	private double wheels;

	public Ground() {
	}

	public double getWheels() {
		return wheels;
	}

	public void setWheels(double wheels) {
		this.wheels = wheels;
	}

	public double getRun() {
		return run;
	}

	public void setRun(double run) {
		this.run = run;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void addms() {
		super.addms();
	}

	public void reducems() {
		super.reducems();
	}

	@Override
	public void begin() {
		if (getMs() == 0)
			addms();
	}

	@Override
	public void end() {
		if (getMs() > 0)
			reducems();
	}

	@Override
	public void read() {
		inp = new Scanner(System.in);
		System.out.println("Введите текущую скорость : ");
		setMs(inp.nextDouble());
		System.out.println("Введите ускорение транспорта : ");
		setBoost(inp.nextDouble());
		System.out.println("Введите максимальную скорость : ");
		setMaxms(inp.nextDouble());
		System.out.println("Введите мощность двигателя : ");
		setPower(inp.nextDouble());
		System.out.println("Введите пробег в км : ");
		setRun(inp.nextDouble());
		System.out.println("Введите количество колес : ");
		setWheels(inp.nextDouble());
	}

	@Override
	public void write() {
		System.out.print("Название : " + getName() + ", скорость = " + getMs() + ", ускорение = " + getBoost()
				+ ", максимальная скорость = " + getMaxms() + ", мощность двигателя = " + getPower() + ", пробег = "
				+ getRun() + ", количество колес = " + getWheels());
	}
}
