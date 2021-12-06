package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {

        Logger l = new ConsoleLogger();

        if (args.length == 1 && args[0].equals("-interactive")) {

            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
            Player player = new HumanPlayer();
            Simulation sim = new Simulation(player);
            sim.initialize(randomNumber);
            sim.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
    }
}



