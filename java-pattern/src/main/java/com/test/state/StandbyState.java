package com.test.state;

public class StandbyState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("Current state is Standby state moving to Playing state");
		context.setState(new PlayingState());
	}
}