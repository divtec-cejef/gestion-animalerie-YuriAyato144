# 🐾 Projet Java — Animalerie

## 📘 Contexte

Ce projet vous place dans la peau d’un gestionnaire d’**animalerie**.

***L’animalerie possède :***

- **Des animaux** de plusieurs types : `Chien`, `Chat`, `Lapin`.
    - Chaque animal hérite de la classe abstraite `Animal`.
    - Tous possèdent un **nom**, un **âge** et un **état de santé** (`SAIN`, `SOIN_LEGER`, `SOIN_INTENSIF`).
    - Chaque type d’animal redéfinit son **bruit** et son **soin quotidien** (polymorphisme).
        - Par exemple : Le chien fait pour bruit “Wouaf!”, et son soin quotidien est de se faire “brosser”.
- **Des employés** :
    - `Soigneur` : réalise les soins quotidiens propres à chaque animal.
    - `Veterinaire` : soigne un animal malade et améliore son état de santé.
    - Tous héritent de la classe abstraite `Employe` (avec nom, prénom, salaire et rôle).
- **Des concours animaliers** :
    - Chaque concours a un **nom**, un **lieu**, une **capacité maximale**.
    - On peut y inscrire uniquement des animaux **sains**, qui ne sont pas déjà inscrits.
    - Lorsqu’un concours est lancé, un **classement aléatoire** est attribué aux participants.
    - Il est possible d’afficher les **détails** d’un concours : informations générales + liste des animaux inscrits.

L’utilisateur interagit via une **interface console** (menu numérique).

---

## ⚙️ Exigences du projet

Votre programme doit :

1. Implémenter correctement les classes **Animal**, **Employe**, leurs sous-classes et le polymorphisme (`bruit()`, `soinQuotidien()`, `effectuerTache()`).
2. Gérer des **listes dynamiques** (ArrayList) d’animaux, d’employés et de concours.
3. Vérifier les **règles métier** :
    - Un `Soigneur` ne peut exécuter que l’option de soin quotidien.
    - Un `Veterinaire` ne peut exécuter que l’option de soins médicaux.
    - Un concours n’accepte que des animaux **sains**, pas déjà inscrits, dans la limite de sa capacité.
4. Fournir un **menu console** clair et robuste pour naviguer entre les fonctionnalités (ajout, suppression, inscriptions, concours, etc.).
5. Afficher des messages explicites (confirmation, erreur, invalidité d’index, etc.).

---

## 🚧 Points d’attention

- Bien respecter la séparation des responsabilités :
    - Les **classes métiers** (`Animal`, `Employe`, `Concours`) contiennent la logique.
    - La **classe Main** orchestre les choix utilisateurs.
    - La **classe ConsoleIO** centralise saisie et affichage.
- Utiliser l’**héritage** et le **polymorphisme** pour éviter les doublons.
- Respecter les principes de conception objet :
    - Les **attributs** des classes doivent être `private`.
    - On y accède via des **getters** et **setters** publics.
    - Utiliser `@Override` lorsqu’on redéfinit une méthode.
    - Privilégier la **lisibilité** du code (noms clairs, indentation correcte).
- Vérifier les entrées utilisateur (indices valides, types corrects).
- Gérer proprement les états de santé (`EtatSante`) : ne jamais dépasser les bornes (`SAIN` est le maximum).

---

## 📝 Jalons proposés

### Jalon 1 – Classes de base

- Créer la classe abstraite `Animal` (nom, âge, santé).
- Implémenter `Chien`, `Chat`, `Lapin` avec `bruit()` et `soinQuotidien()`.
- Créer `EtatSante` (enum).

### Jalon 2 – Employés

- Créer la classe abstraite `Employe`.
- Implémenter `Soigneur` et `Veterinaire` avec leur méthode `effectuerTache(Animal)`.

### Jalon 3 – Gestion de l’animalerie

- Mettre en place `Main` + `ConsoleIO` pour ajouter, supprimer, lister animaux et employés.
- Tester les tâches (`Soigneur` → soin quotidien, `Veterinaire` → améliorer santé).

### Jalon 4 – Concours

- Créer la classe `Concours` (nom, lieu, capacité, participants).
- Inscrire un animal (avec vérification des règles).
- Lancer un concours → générer un classement aléatoire.
- Afficher les détails d’un concours.

### Jalon 5 – Améliorations et finition

- Ajouter la gestion des erreurs (index invalide, saisie non numérique).
- Améliorer les messages utilisateurs.
- Tester l’ensemble du cycle : ajouter → inscrire → lancer co