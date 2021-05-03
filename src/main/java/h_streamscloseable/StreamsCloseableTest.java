package h_streamscloseable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCloseableTest {

    public static void main(String[] args) throws IOException {

        //this is perfectly valid statement
        try (final var stream = Stream.of(1, 2, 3)) {
            final var list = stream.map(integer -> integer * integer)
                    .collect(Collectors.toUnmodifiableList());
        }


        //why I need to close the stream then? And when?








        try (final var stream = Files.walk(Path.of("/"))) {
            final var list = stream.collect(Collectors.toUnmodifiableList());
        }


    }
}
