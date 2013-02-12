/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PETTER pgolasz@gmail.com
 */
public class Song implements Comparable<Song> {

    private final String n;
    private final long q;
    private final int i;

    Song(long a, String b, int c) {
        n = b;
        q = a * c;
        i = c;
    }

    @Override
    public int compareTo(Song o) {
        return (o.q > q) ? 1 : (o.q < q ? -1 : (o.i < i ? 1 : -1));
    }

    @Override
    public String toString() {
        return n;
    }
}
