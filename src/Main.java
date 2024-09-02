public class Main {
    /*
    Chien qui Aboie

Nous avons un chien qui aime aboyer. Nous devons nous réveiller si le chien aboie la nuit !

Écrivez une méthode appelée shouldWakeUp qui a 2 paramètres.

	1.	Le premier paramètre doit être de type boolean et doit être nommé barking. Il représente si notre chien aboie actuellement.
	2.	Le deuxième paramètre représente l’heure de la journée. Il est de type int avec le nom hourOfDay et a une plage valide de 0 à 23.

Nous devons nous réveiller si le chien aboie avant 8 heures ou après 22 heures. Dans ce cas, la méthode doit retourner true.

Dans tous les autres cas, elle doit retourner false.

Si le paramètre hourOfDay est inférieur à 0 ou supérieur à 23, la méthode doit retourner false.

Exemples d’entrée/sortie :

	•	shouldWakeUp(true, 1); → doit retourner true
	•	shouldWakeUp(false, 2); → doit retourner false car le chien n’aboie pas.
	•	shouldWakeUp(true, 8); → doit retourner false car ce n’est pas avant 8 heures.
	•	shouldWakeUp(true, -1); → doit retourner false car le paramètre hourOfDay doit être dans la plage 0-23.

CONSEIL : Utilisez l’instruction if-else avec plusieurs conditions.
NOTE : La méthode shouldWakeUp doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if (barking &&(hourOfDay < 8 || hourOfDay >22)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));  // devrait retourner true
        System.out.println(shouldWakeUp(false, 2));  // devrait retourner false
        System.out.println(shouldWakeUp(true, 8));  // devrait retourner false
        System.out.println(shouldWakeUp(true, -1));  // devrait retourner false
    }
}
