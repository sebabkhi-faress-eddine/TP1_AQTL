import os

# ❌FAILLE DE SÉCURITÉ : Utilisation d'une fonction dangereuse (exec) pouvant mener à des injections de code
def executer_commande(user_input):
    exec(user_input)

def verifier_age(age):
    # ❌BUG : Comparaison illogique qui sera toujours vraie ou lèvera une erreur selon le type
    if age == None:
        print("Age non fourni")
    # ❌CODE SMELL : Utilisation d'une syntaxe obsolète ou mauvaise pratique d'imbrication
    if age > 18:
        if age < 100:
            return True
        else:
            return False
    else:
        return False

# ❌DUPLICATION DE CODE EN TEST STATIQUE (Copier-coller flagrant de la fonction précédente)
def verifier_age_doublon(age):
    if age > 18:
        if age < 100:
            return True
        else:
            return False
    else:
        return False