# Compte Rendu

## Introduction

Dans le monde informatique une application est doit être évolutif, fermée á la modification et ouverte à l'extension. L'application doit aussi s'adapter aux changements. Ces concepts peuvent être appliquer en utilisant les concepts de: 
 - Injection des dependances
 - Inversion de controle
 - Couplage faible

## Ennonce 

Ce TP consiste à mettre en œuvre l'injection de dependances de maniere dynamique et statique. La methode dynamique sera basée sur le framework Spring en utilisant à la fois les annotations et un fichier XML.

## Conception 

![img.png](assets/conecption.png)

## Capture D'ecran

#### Architecture du projet

![img.png](assets/project_architecture.png)

#### Interface IDao avec methode getData

![img.png](assets/IDao.png)

#### Implementation de l'interface IDao

![img.png](assets/DaoImpl.png)

#### Interface Metier

![img.png](assets/IMetier.png)

#### Implementation de l'interface IMetier

![img.png](assets/loose_coupling.png)

#### Injection Statique

![img.png](assets/static_injection.png)

#### Injection Dynamique

![img.png](assets/dynamic_injection.png)

##### Fichier _txt_ associe

![img.png](assets/config_txt.png)

#### Implementation Spring avec XML

![img.png](assets/xml_impl.png)

##### Fichier de configuration XML associe au framework Spring

![img.png](assets/xml_config.png)

#### Implementation Spring avec annotation

![img.png](assets/annotation.png)