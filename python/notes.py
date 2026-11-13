notes = []

while True:
    saisie = input("Notes (ou fin) :")
    if saisie == "fin":
        break
    try:
        note = float(saisie)
    except ValueError:
        print("Ce n'est pas un nombre, recommence")
        continue
    notes.append(note)
if notes:
    moyenne = sum(notes) / len(notes)
    print(f"Moyenne : {moyenne: .2f} sur {len(notes)} sur notes")
else:
    print("Aucune note saisie.")