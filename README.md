# Homework 12

### Завершить задание которое начали в аудитории:

## **Task 1:** 
Написать метод `String reverse(String s) {...}`.  

Входящий параметр: s - строка которая состоит из слов через пробел  

Метод должен вернуть слова в обратном порядке  

**Пример:**  

"man has dog" => "dog has man"  


## **Task 2:**   
Iterator  

```
List of K sorted arrays:
[1,2,5]
[2,3]
[1,3,4,7]
create iterator:
[1,1,2,2,3,3,4,5,7]
```


```
        int[][] arr = {
                {1,2,5},
                {2,3},
                {1,3,4,7}
        };

        Iterator iterator = new Iterator(arr);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // [1,1,2,2,3,3,4,5,7]
```
