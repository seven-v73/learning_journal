# variable

x = 5
print(x)

# condition

if x > 0 :
    print(f"{x} est positif")

# Boucle

for i in range(10):
    print(i)


# Fonction

def carre(n):
    return n * n


print(carre(6))

# mutabilité : Une variable python ne contient pas une liste , elle pointe vers une liste.
# si deux variables pointent vers la même liste, modifier l'une modifie l'autre

a = [1, 2, 3]
b = a 
b.append(4)
print(a)

c = a.copy()
c.append(5)
print(a)

# Fonction plus en detail

def prix_ttc(prix_ht: float, taux_tva: float = 0.18)-> float:
    return round(prix_ht * (1 + taux_tva), 2)

print(prix_ttc(1000))
print(prix_ttc(1000, taux_tva=0.20))

# lire un fichier

from collections import Counter

with  open("livre.txt", encoding="utf-8") as f:
    mots = f.read().lower().split()
mots

mots = [m.strip(".,;:!?") for m in mots if len(m) > 3]
for mot, nb in Counter(mots).most_common(5):
    print(mot, nb)