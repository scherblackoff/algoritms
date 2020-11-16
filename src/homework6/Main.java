package homework6;

public class Main {

    public static void main(String[] args) {
        int countBalancedTrees = 0;
        int countDisBalancedTrees = 0;
        createAndCheckBalance(20,4,-25,25);
    }


    public static void fillInRandom(Tree<Integer> tree, int max, int min) {
        for (int i = 0; i < (Math.pow(2 , tree.getMaxLevel())) - 1; i++) {
            tree.add((int) (Math.random() * (max - min) + min));
        }
    }
    public static void createAndCheckBalance(int count ,int level, int lowBound, int highBound){
        int countBalancedTrees = 0;
        int countDisBalancedTrees = 0;
        for (int i = 0; i < count; i++) {
            Tree<Integer> tree = new TreeImpl(4);
            fillInRandom(tree, lowBound, highBound);
            if(tree.checkBalanced()){
                countBalancedTrees++;
            }else{
                countDisBalancedTrees++;
            }
        }
        System.out.println("Количество сбалансированных деревьев: " +countBalancedTrees);
        System.out.println("Количество несбалансированных деревьев: " +countDisBalancedTrees);
        System.out.println("Процентное соотношение: "
                + (double) countBalancedTrees / count + "%");
    }
}
