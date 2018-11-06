Stack<String> deck = new Stack<>();
deck.push("Ace of diamonds"); // низ стека //помещает объект в стек
deck.push("Ace of hearts");
deck.push("Ace of clubs");
deck.push("Ace of spades"); // верх стека

System.out.println("size= " + deck.size());

for (String card : deck) {
    System.out.println("card= " + card);
}

System.out.println("search:" + deck.search("Ace of clubs")); //ищет заданный элемент в стеке, возвращая , которые требуются для того чтобы вытащить искомый элемент

for (int i = 0; i < deck.search("Ace of clubs"); i++) {
    System.out.println("Удалили " + deck.peek());
    deck.pop();
}

System.out.println(deck.peek());


while (deck.size() > 0) {
    System.out.println(deck.peek().toString()); //Просто смотрим кто последний не вытаскивая
    String cardName = deck.pop(); //вытаскивает объект из стека, объекта в стеке не будет
    System.out.println("dealing card= " + cardName);
}

System.out.println("size= " + deck.size());