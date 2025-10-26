package org.endtimezionministries.repository;

import org.endtimezionministries.model.internal.BibleBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Data {
    public static final List<BibleBook> bibleBooks = new ArrayList<>();
    public static final Map<String, Integer> bookAndMaxChapter = Map.<String, Integer>ofEntries(
            entry("GEN", 50),
            entry("EXO", 40),
            entry("LEV", 27),
            entry("NUM", 36),
            entry("DEU", 34),
            entry("JOS", 24),
            entry("JDG", 21),
            entry("RUT", 4),
            entry("1SA", 31),
            entry("2SA", 24),
            entry("1KI", 22),
            entry("2KI", 25),
            entry("1CH", 29),
            entry("2CH", 36),
            entry("EZR", 10),
            entry("NEH", 13),
            entry("EST", 10),
            entry("JOB", 42),
            entry("PSA", 150),
            entry("PRO", 31),
            entry("ECC", 12),
            entry("SNG", 8),
            entry("ISA", 66),
            entry("JER", 52),
            entry("LAM", 5),
            entry("EZK", 48),
            entry("DAN", 12),
            entry("HOS", 14),
            entry("JOL", 3),
            entry("AMO", 9),
            entry("OBA", 1),
            entry("JON", 4),
            entry("MIC", 7),
            entry("NAM", 3),
            entry("HAB", 3),
            entry("ZEP", 3),
            entry("HAG", 2),
            entry("ZEC", 14),
            entry("MAL", 4),
            entry("MAT", 28),
            entry("MRK", 16),
            entry("LUK", 24),
            entry("JHN", 21),
            entry("ACT", 28),
            entry("ROM", 16),
            entry("1CO", 16),
            entry("2CO", 13),
            entry("GAL", 6),
            entry("EPH", 6),
            entry("PHP", 4),
            entry("COL", 4),
            entry("1TH", 5),
            entry("2TH", 3),
            entry("1TI", 6),
            entry("2TI", 4),
            entry("TIT", 3),
            entry("PHM", 1),
            entry("HEB", 13),
            entry("JAS", 5),
            entry("1PE", 5),
            entry("2PE", 3),
            entry("1JN", 5),
            entry("2JN", 1),
            entry("3JN", 1),
            entry("JUD", 1),
            entry("REV", 22)
    );
}
