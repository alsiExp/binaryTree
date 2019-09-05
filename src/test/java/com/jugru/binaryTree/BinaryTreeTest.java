package com.jugru.binaryTree;import org.junit.jupiter.api.Test;import java.util.List;import java.util.stream.Collectors;import static com.jugru.binaryTree.BinaryTreeTestHelper.*;import static org.junit.jupiter.api.Assertions.*;public class BinaryTreeTest {    @Test    public void testCountNodes() {        BinaryTree bt = getFilledTree();        assertEquals(23, bt.getAllNodes().size(), "Количество нод в тестовом дереве должно быть 23");    }    @Test    public void testFindValue() {        BinaryTree bt = getFilledTree();        bt.getAllNodes()                .stream()                .map(Node::getValue)                .sorted()                .forEach(currentValueToFind -> {                    Node found = bt.find(currentValueToFind);                    assertNotNull(found, "Нода " + currentValueToFind + " существует в дереве и должна быть найдена");                    assertTrue(currentValueToFind == found.getValue(), "Ожидаемое значение = " + currentValueToFind + ", найденная нода = " + found);                });    }    @Test    public void findNextLargerValue() {        BinaryTree bt = getFilledTree();        List<Long> values = bt.getAllNodes()                .stream()                .map(Node::getValue)                .sorted()                .collect(Collectors.toList());        for (int i = 0; i < values.size(); i++) {            long currentValueToFind = values.get(i);            Long nextLargerAwait = i == values.size() - 1 ? null : values.get(i + 1);            String errorMessage = "Для значения " + currentValueToFind                    + " ожмдаемое значение было " + nextLargerAwait + ", но было получено " + bt.findNextLarger(currentValueToFind) + ". Весь ряд " + values;            if(nextLargerAwait == null) {                assertNull(bt.findNextLarger(currentValueToFind), errorMessage);            }            assertEquals(nextLargerAwait, bt.findNextLarger(currentValueToFind), errorMessage);        }    }}