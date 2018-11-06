List<String> names = new ArrayList<>();
names.add("Jimmy");
names.add("Anthony");
names.add("John");

for (String name : names) {
    System.out.println("name= " + name + " uppercase= " + name.toUpperCase());
}

for(int i = 0; i < names.size(); i++) {
    String s = names.get(i);
    System.out.println("s= " + s.getClass().getSimpleName());
}