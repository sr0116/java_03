package main;

import service.BankService;
import utils.BankUtils;

public class BankApp {
	public static void main(String[] args) {
		while(true){
			System.out.println(""
					+ " ▄▄▄▄▄▄▄     ▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄    ▄ ▄▄▄   ▄ \r\n"
					+ "█       █   █   █  ▄    █       █  █  █ █   █ █ █\r\n"
					+ "█▄     ▄█   █   █ █▄█   █   ▄   █   █▄█ █   █▄█ █\r\n"
					+ "  █   █  ▄  █   █       █  █▄█  █       █      ▄█\r\n"
					+ "  █   █ █ █▄█   █  ▄   ██       █  ▄    █     █▄ \r\n"
					+ "  █   █ █       █ █▄█   █   ▄   █ █ █   █    ▄  █\r\n"
					+ "  █▄▄▄█ █▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█▄▄█ █▄▄█▄█  █▄▄█▄▄▄█ █▄█\r\n"
					+ "");
			System.out.println("===================================================");
			BankService.getInstance().menu();
		}
	}

}
