package o_finally;

import java.io.Closeable;

public class TryWithResources {

    public static void main(String[] args)  {


        try(final var x = new Adapter("adapter1");
                final var y = new Adapter("adapter2")) {
            throw new NullPointerException();
        }
    }


    static class Adapter implements Closeable {

        private final String adapterName;

        Adapter(String adapterName) {
            this.adapterName = adapterName;
        }

        @Override
        public void close() {
            throw new RuntimeException(adapterName);
        }
    }


}
