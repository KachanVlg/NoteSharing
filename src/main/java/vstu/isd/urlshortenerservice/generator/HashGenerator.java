package vstu.isd.urlshortenerservice.generator;

import java.util.stream.Stream;

public interface HashGenerator {
    Stream<String> generateHashes(int amount);
}