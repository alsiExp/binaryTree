# Binary Tree

Реализован поиск значения в бинарном дереве и поиск следующего значения в дереве, которое минимально больше текущего.

Визуальное представление дерева:

                                      30
                        25                            35
               15               27            32             55
           5       17       26     28      31    34      40      108
         3  7    16  19              29                37  45       200

### Обход в ширину

Реализовано представление дерева в виде списка, который формируется обходом в ширину (метод getBFSView).
Добавлен тест для подтверждения корректности реализации.
 