Map<String, Integer> weaponsByDamage = new HashMap<>();
weaponsByDamage.put("pike", 10);
weaponsByDamage.put("arrow", 15);
weaponsByDamage.put("sword", 20);
weaponsByDamage.put("pistol", 30);

for(Map.Entry<String, Integer> entry : weaponsByDamage.entrySet()) {
    System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());
}

for(String key : weaponsByDamage.keySet()) {
    System.out.println("key= " + key);
}

for(Integer value : weaponsByDamage.values()) {
    System.out.println("value= " + value);
}

// getting / setting values
System.out.println("sword has damage= " + weaponsByDamage.get("sword"));
System.out.println("size= " + weaponsByDamage.size());

weaponsByDamage.put("sword", 35);
System.out.println("sword has new damage= " + weaponsByDamage.get("sword"));
System.out.println("size= " + weaponsByDamage.size());