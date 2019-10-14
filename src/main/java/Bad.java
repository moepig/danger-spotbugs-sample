public class Bad {

    public Bad() {
        if (false) {
            System.out.println("");
        }
    }

    public int foo() {
        String foo = null;

        return Integer.getInteger(foo);
    }

    public class BadInner {
        public int hoge;

        public int getHoge() {
            return hoge;
        }
    }
}
