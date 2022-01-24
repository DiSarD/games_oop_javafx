package ru.job4j.chess.firuges.black;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest  {

    @Test
    public void testPosition() {
      Figure bishopBlack = new BishopBlack(Cell.C3);
      assertThat(bishopBlack.position(), is(Cell.C3));
    }

    @Test
    public void testC3CopyD4() {
        Figure bishopBlack = new BishopBlack(Cell.C3);
        bishopBlack = bishopBlack.copy(Cell.D4);
        assertThat(bishopBlack.position(), is(Cell.D4));
    }

    @Test
    public void testWay() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expexted = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expexted));
    }
}