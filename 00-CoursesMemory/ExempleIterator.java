Qu'est-ce qu'un Iterator en Java ?
Un Iterator est un objet qui permet de parcourir les éléments d'une collection (comme une liste, un ensemble, etc.) de manière séquentielle, sans exposer la structure interne de la collection.

Il fait partie de l'interface java.util et est couramment utilisé pour :

Parcourir une collection.
Supprimer des éléments de manière sûre pendant l'itération.
Pourquoi utiliser un Iterator ?
Suppression sécurisée d'éléments pendant l'itération :

Si tu utilises une boucle for classique et modifies la collection (par exemple, en supprimant un élément), cela peut provoquer une erreur ConcurrentModificationException.
Un Iterator résout ce problème en permettant de modifier la collection tout en la parcourant.
Abstraction :

Il fournit une manière uniforme de parcourir différentes collections (par exemple, ArrayList, HashSet, etc.).
Méthodes principales de l'interface Iterator :
Méthode	Description
hasNext()	Retourne true s'il reste des éléments à parcourir dans la collection.
next()	Retourne l'élément suivant de la collection.
remove()	Supprime l'élément courant (celui retourné par next()) de la collection.
Exemple d'utilisation de Iterator :
1. Parcourir une liste :
java
Copy
import java.util.ArrayList;
import java.util.Iterator;

public class ExempleIterator {
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<>();
        noms.add("Alice");
        noms.add("Bob");
        noms.add("Charlie");

        Iterator<String> iterator = noms.iterator();

        while (iterator.hasNext()) {
            String nom = iterator.next();
            System.out.println(nom);
        }
    }
}
Sortie :

plaintext
Copy
Alice
Bob
Charlie
2. Suppression d'éléments pairs d'une liste :
java
Copy
import java.util.ArrayList;
import java.util.Iterator;

public class ExempleSuppression {
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);

        Iterator<Integer> iterator = nombres.iterator();

        while (iterator.hasNext()) {
            Integer nombre = iterator.next();
            if (nombre % 2 == 0) { // Supprimer les nombres pairs
                iterator.remove();
            }
        }

        System.out.println("Liste après suppression : " + nombres);
    }
}
Sortie :

plaintext
Copy
Liste après suppression : [1, 3]
Pourquoi utiliser remove() de l'Iterator au lieu de list.remove() ?
Lorsque tu modifies une collection (ajout, suppression) pendant que tu la parcours, cela peut provoquer une exception ConcurrentModificationException. Cela se produit parce que la structure interne de la collection change pendant l'itération.

Avec un Iterator, la suppression est gérée de manière sûre, car il garde la collection dans un état cohérent.

Exemple avec une erreur :
java
Copy
ArrayList<Integer> nombres = new ArrayList<>();
nombres.add(1);
nombres.add(2);
nombres.add(3);

for (Integer nombre : nombres) {
    if (nombre % 2 == 0) {
        nombres.remove(nombre); // Provoque ConcurrentModificationException
    }
}
Fonctionnement interne d’un Iterator :
Lorsqu'un Iterator est créé, il pointe avant le premier élément de la collection.
À chaque appel de next(), il avance d'un élément et retourne cet élément.
hasNext() vérifie s'il reste encore des éléments à parcourir.
Avantages du Iterator :
Uniformité :

Il fournit un moyen standard de parcourir toutes les collections, quelles que soient leurs implémentations.
Suppression sécurisée :

La méthode remove() évite les erreurs liées aux modifications concurrentes.
Simplicité :

Il réduit la complexité de gestion des boucles, surtout pour des structures comme Set ou Map.
Limites du Iterator :
Unidirectionnel :

Il ne permet de parcourir une collection que dans un seul sens (du début à la fin).
Pour un parcours bidirectionnel, utilise ListIterator.
Pas de modification directe :

Hormis la suppression via remove(), il ne permet pas d'ajouter ou de remplacer des éléments.
Résumé :
Iterator est idéal pour parcourir et modifier des collections en toute sécurité.
Il est indispensable pour des collections qui ne sont pas basées sur un index, comme les Set ou les Map.
Pour des besoins plus avancés, comme un parcours dans les deux sens, préfère ListIterator.