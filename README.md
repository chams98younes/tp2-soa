# CalculatriceWS – Service Web SOAP en Java

## 1. Présentation du projet

Ce projet consiste à développer une application Java nommée **CalculatriceWS**, permettant d'exposer un service Web SOAP pour effectuer des opérations mathématiques simples.

Le service permet à un client de communiquer avec le serveur à travers le protocole SOAP et d'effectuer des calculs à distance.

## 2. Objectifs

- Développer un service Web SOAP en Java.
- Utiliser Jakarta XML Web Services (JAX-WS).
- Configurer les dépendances avec Maven.
- Définir les opérations à travers une interface Java.
- Utiliser les annotations Jakarta pour exposer les méthodes.
- Publier le service Web avec `Endpoint.publish()`.
- Consulter le fichier WSDL et le schéma XSD généré.
- Tester les opérations avec SoapUI.

## 3. Technologies utilisées

- **Java 17** : langage de programmation.
- **Maven** : gestion des dépendances et construction du projet.
- **Jakarta XML Web Services (JAX-WS 3.x)** : développement du service SOAP.
- **IntelliJ IDEA** : environnement de développement.
- **SoapUI** : test des requêtes et réponses SOAP.
- **XML / WSDL / XSD** : description et structure des échanges.

## 4. Structure du projet

```text
CalculatriceWS/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            ├── service/
            │   ├── ICalculatrice.java
            │   └── Calculatrice.java
            │
            └── serveur/
                └── ServeurJWS.java
```

## 5. Fonctionnalités

Le service Web expose quatre opérations :

| Opération | Description |
|---|---|
| `somme(a, b)` | Addition de deux nombres |
| `multiplication(a, b)` | Multiplication de deux nombres |
| `soustraction(a, b)` | Soustraction de deux nombres |
| `division(a, b)` | Division de deux nombres |

Une vérification est effectuée pour empêcher la division par zéro.

## 6. Architecture du service

Le projet est organisé en deux packages principaux :

- **service** : contient l'interface `ICalculatrice` qui définit les opérations et la classe `Calculatrice` qui les implémente.
- **serveur** : contient la classe `ServeurJWS`, responsable de la publication du service Web.

Les annotations utilisées sont :

- `@WebService` : déclaration du service Web.
- `@WebMethod` : exposition des opérations.
- `@WebParam` : définition des paramètres des méthodes.

## 7. Exécution du projet

### Étape 1 : Configuration

Ouvrir le projet dans IntelliJ IDEA et vérifier les dépendances Maven dans le fichier `pom.xml`.

### Étape 2 : Publication du service

Exécuter la classe `ServeurJWS.java`.

Le service est publié à l'adresse :

```text
http://localhost:8080/CalculatriceWS
```

### Étape 3 : Consultation du WSDL

Ouvrir le navigateur et accéder à :

```text
http://localhost:8080/CalculatriceWS?wsdl
```

Le document WSDL décrit les opérations, les paramètres et l'adresse du service.

### Étape 4 : Tests avec SoapUI

Importer le WSDL dans SoapUI, sélectionner une opération, renseigner les paramètres et envoyer la requête SOAP.

## 8. Exemples de tests

| Opération | Paramètre A | Paramètre B | Résultat attendu |
|---|---:|---:|---:|
| Somme | 10 | 5 | 15 |
| Multiplication | 10 | 5 | 50 |
| Soustraction | 10 | 5 | 5 |
| Division | 10 | 5 | 2 |

## 9. Conclusion

Ce projet permet de mettre en pratique le développement et la publication d'un service Web SOAP en Java à l'aide de Jakarta JAX-WS et Maven. Il permet également de comprendre le rôle du WSDL et du XSD ainsi que les échanges entre un client et un serveur à travers SoapUI.