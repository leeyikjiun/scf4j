# About SCF4J
The Simple Collections Facade for Java makes it easy to switch between Collections frameworks. It allows users using Java Collections now to switch to Trove the next day, and FastUtil the day after without changing any code. It also allows users to use Set from Trove and Map from FastUtil.

# Setup
Simply include the scf4j-api and one of the following in your classpath:
- scf4j-jdk
- scf4j-trove4j
- scf4j-fastutil

# Examples
Using a single Collections framework.
```
// to use the default implementation
IntIntMap map = IntIntMapFactory.createIntIntHashMap();

// do something with map
map.push(1,2);
map.get(1);
```
Using multiple Collections frameworks.
```
// to use Trove's Map and FastUtil's Set
IntIntMap troveMap = IntIntMapFactory.createIntIntHashMap(TroveIntIntMapFactory.class);
IntSet fastUtilSet = IntSetFactory.createIntHashSet(FastUtilIntSetFactory.class);

// do something with map
troveMap.push(1,2);
troveMap.get(1);

// do something with set
fastUtilSet.add(1);
fastUtilSet.contains(1);
```

# Supported Collections Framework
- [Trove](http://trove.starlight-systems.com/)
- [FastUtil](http://fastutil.di.unimi.it/)
- [Mahout](https://mahout.apache.org/users/basics/mahout-collections.html)
- [HPPC](http://labs.carrotsearch.com/hppc.html)
- [GoldmanSachs](https://github.com/goldmansachs/gs-collections)
 
# Credits
This project is inspired and based on the [Simple Logging Facade for Java (SLF4J)](http://www.slf4j.org/)

# Issues
- How to support operations that framework A provides but framework B doesn't.

Let me know if you have any ideas on how to resolve the above issues, want to request new features or contribute to the project.
