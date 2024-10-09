
la structure de mon projet 

othello/
│
├── src/
│   ├── othello/
│   │   ├── Main.java        // Le fichier contenant la méthode main
│   │
│   ├── othello/game/
│   │   ├── Game.java        // Gère la logique générale du jeu
│   │   ├── Board.java       // Représente le plateau de jeu
│   │
│   ├── othello/player/
│   │   ├── Player.java      // Gère les informations des joueurs
│   │
│   ├── othello/pawn/
│   │   ├── Pawn.java        // Gère les pions (noir/blanc) et leurs changements de couleur
│
├── build/  // contient les fichiers compilé




commande pour compiler : "javac -d build src/othello/Main.java src/othello/game/*.java src/othello/player/*.java src/othello/pawn/*.java"

commende pour creation jar : "jar cvfe othello.jar othello.Main -C build ."

commende pour exucition : "java -jar othello.jar"