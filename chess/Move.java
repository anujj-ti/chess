package chess;

public class Move {
    private Block startBlock;
    private Block endBlock;

    public Move(Block startBlock, Block endBlock) {
        this.startBlock = startBlock;
        this.endBlock = endBlock;
    }

    public Boolean isValid() {
        return true;
    }

    public Block getStartBlock() {
        return startBlock;
    }

    public Block getEndBlock() {
        return endBlock;
    }
}
