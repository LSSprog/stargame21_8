package com.star.app.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.star.app.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new StarGame(), config);
	}

	// Прикрутить что-нибудь на своё усмотрение.
	// Добавил появление нового бота через 5 секунд после начала нового уровня
	// Чтобы перейти на след уровень надо помимо астероидов и бота уничтожить
	// на след уровне уже новые астероиды и новый бот через 5 сек после начала раунда
}
