package com.tutorial.annotation;

@Annotation(d=14)

//@Queries({
//        @Query(name = "t1",value = "from person"),
//        @Query(name = "t2",value = "from product")
//}) // without repeatable annotation

@Query(name = "t1",value = "from person")
@Query(name = "t2",value = "from product") // by repetable annotation
public class Main {

    public void test() {

    }

}
