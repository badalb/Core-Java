package com.test.state;

public class PlayingState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("Current state is Playing state, moving to Standby state");
		context.setState(new StandbyState());
	}
}