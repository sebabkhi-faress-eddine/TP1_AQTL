import java.sql.Connection;
import java.sql.DriverManager;
public class Application {
// ❌FAILLE DE SÉCURITÉ : Mot de passe écrit en dur (Hardcoded credential)
private static final String DB_PASSWORD = "SuperSecretPassword123!";
public static void main(String[] args) {
System.out.println("Démarrage de l'application...");
calculer(10, 0);
// ❌CODE SMELL : Variable déclarée mais jamais utilisée
int variableInutile = 42;
}
public static int calculer(int a, int b) {
// ❌BUG POTENTIEL : Risque de division par zéro sans vérification préalable
return a / b;
}
public void connexionBase() {
try {
// ❌FAILLE DE SÉCURITÉ / CODE SMELL
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "root",
DB_PASSWORD);
} catch (Exception e) {
// ❌CODE SMELL : Catch générique sans logger l'exception (Empty/generic catch block)
System.out.println("Erreur");
}
}
}