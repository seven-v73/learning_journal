from collections import Counter
from pathlib import Path

def top_words(path: str, n: int= 10) ->list[tuple[str, int]]:
    text = Path(path).read_text(encoding="utf-8").lower()
    words = [w for w in text.split() if len(w) > 3]

    return Counter(words).most_common(n)

if __name__ == "__main__":
    for word, count in top_words("livre.txt"):
        print(f"{word:<15} {count}")