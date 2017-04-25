package com.test.state;

public class Main {

	public static void main(String[] args) {
		
		MP3PlayerContext ctx = new MP3PlayerContext(new StandbyState());
		ctx.play();
		ctx.play();
	}

}
